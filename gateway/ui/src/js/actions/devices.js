import fetch from "cross-fetch";
import {enqueueSnackbar} from "./notifier";

export const REMOVE_DEVICE_BY_ID = "REMOVE_DEVICE_BY_ID";

export const removeDeviceByID = (id, service, path) => (dispatch) => {
  return fetch('/v1/Devices?id=' + id, {
    credentials: "same-origin",
    method: "DELETE",
    headers: {
      'fiware-service': service,
      'fiware-servicepath': path,
    }
  })
    .then(
      response => {
        if (response.status >= 300) {
          throw new Error("could not get devices")
        }
      }
    )
    .then(
      _ => dispatch( {type: REMOVE_DEVICE_BY_ID, payload: id})
    )
    .then( dispatch(enqueueSnackbar({message: "Device got deleted", options: {variant: 'success'}})))
    .catch(
      err => dispatch(enqueueSnackbar({message: err.message, options: {variant: 'error'}}))
    )
}

export const UPDATE_DEVICE = "UPDATE_DEVICE";

export const updateDeviceByID = (device, service, servicePath) => (dispatch) => {
  return fetch("/v1/Devices?id=" + device.device_id, {
    credentials: "same-origin",
    method: "PUT",
    headers: {
      'fiware-service': service,
      'fiware-servicepath': servicePath,
    },
    body: JSON.stringify(device)
  })
    .then(
      response => {
        if (response.status >= 300) {
          throw new Error("could not get devices")
        }
      }
    )
    .then(
      _ => dispatch( {type: UPDATE_DEVICE, payload: device})
    )
    .then( dispatch(enqueueSnackbar({message: "Device got updated", options: {variant: 'success'}})))
    .catch(
      err => dispatch(enqueueSnackbar({message: err.message, options: {variant: 'error'}}))
    )
}

export const ADD_DEVICE = "ADD_DEVICE";

export function addDevice(payload) {
  return {type: ADD_DEVICE, payload}
}
export const getDeviceByID = (state, id) => state.devices.find(d => d.device_id === id)
export const getDevice = (id, service, servicePath) => (dispatch) => {
  return fetch("/v1/Devices?id=" + id, {
    credentials: "same-origin",
    method: "GET",
    headers: {
      'fiware-service': service,
      'fiware-servicepath': servicePath,
    },
  })
    .then(
      response => {
        if (response.status >= 300) {
          throw new Error("could not get devices")
        }
        return response.json()
      }
    )
    .then(
      json => dispatch(addDevice(json))
    )
    .catch(
      err => dispatch(enqueueSnackbar({message: err.message, options: {variant: 'error'}}))
    )
}

export const getDevices = (fiwareService, fiwareServicePath) => (dispatch) => {
  return fetch("/v1/Devices", {
    credentials: "same-origin",
    method: "GET",
    headers: {
      'fiware-service': fiwareService,
      'fiware-servicepath': fiwareServicePath,
    },
  })
    .then(
      response => {
        if (response.status >= 300) {
          throw new Error("could not get devices")
        }
        return response.json()
      }
    )
    .then(
      json => dispatch(addDevice(json))
    )
    .catch(
      err => dispatch(enqueueSnackbar({message: err.message, options: {variant: 'error'}}))
    )
}
