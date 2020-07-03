import fetch from "cross-fetch";
import {enqueueSnackbar} from "./notifier";

export const ADD_SERVICE_GROUP = "ADD_SERVICE_GROUP";

export function addServiceGroup(payload) {
  return {type: ADD_SERVICE_GROUP, payload}
}

export const REMOVE_SERVICE_GROUP_BY_ID = "REMOVE_SERVICE_GROUP_BY_ID";

export function removeServiceGroupByID(payload) {
  return {type: REMOVE_SERVICE_GROUP_BY_ID, payload}
}

export const deleteServiceGroup = (group) => (dispatch) => {
  return fetch("/v1/serviceGroups?resource="+group.resource + "&key=" + group.apikey, {
    credentials: "same-origin",
    method: "DELETE",
    headers: {
      'fiware-service': group.service,
      'fiware-servicepath': group.subservice,
    }
  })
    .then(
      response => {
        if (response.status >= 300) {
          throw new Error("Could not delete service group")
        }
        return
      }
    )
    .then(
      _ => dispatch({type: REMOVE_SERVICE_GROUP_BY_ID, payload: group._id})
    )
    .then(dispatch(enqueueSnackbar({message: "Service group got deleted", options: {variant: 'success'}})))
    .catch(
      err => dispatch(enqueueSnackbar({message: err.message, options: {variant: 'error'}}))
    )
}

export const getServiceGroupByID = (state, id) => state.serviceGroups.find((group) => group._id === id)


export const UPDATE_SERVICE_GROUP = "UPDATE_SERVICE_GROUP";
export const updateServiceGroup = (group, service, path) => (dispatch) => {
  return fetch("/v1/serviceGroups?id="+group._id, {
    credentials: "same-origin",
    method: "PUT",
    headers: {
      'fiware-service': service,
      'fiware-servicepath': path,
    },
    body: JSON.stringify(group)
  })
    .then(
      response => {
        if (response.status >= 300) {
          throw new Error("Could not update service group")
        }
      }
    )
    .then(
      _ => dispatch({type: UPDATE_SERVICE_GROUP, payload: group})
    )
    .then(dispatch(enqueueSnackbar({message: "Service group got updated", options: {variant: 'success'}})))
    .catch(
      err => dispatch(enqueueSnackbar({message: err.message, options: {variant: 'error'}}))
    )
}
export const CREATE_SERVICE_GROUP = "CREATE_SERVICE_GROUP"

export function createServiceGroup(serviceGroup) {
  return (dispatch) => Promise.resolve().then(() => {
    fetch("/v1/serviceGroups", {
      credentials: "same-origin",
      method: "POST",
      headers: {
        'fiware-service': serviceGroup.service,
        'fiware-servicepath': serviceGroup.subservice,
        'Content-Type': 'application/json',
      },
      body: JSON.stringify(serviceGroup)
    })
      .then(
        response => {
          if (response.status >= 300) {
            throw new Error("could not create service group")
          }
          return response.json()
        }
      )
      .then(
        json => dispatch(addServiceGroup(json))
      )

  })
}


export const getServiceGroups = (fiwareService, fiwareServicePath) => (dispatch) => {
  return fetch("/v1/serviceGroups", {
    credentials: "same-origin",
    headers: {
      'fiware-service': fiwareService,
      'fiware-servicepath': fiwareServicePath,
    }
  })
    .then(
      response => response.json()
    )
    .then(json =>
      dispatch(addServiceGroup(json))
    )
    .catch(
      err => dispatch(enqueueSnackbar({message: err.message, options: {variant: 'error'}}))
    )
}