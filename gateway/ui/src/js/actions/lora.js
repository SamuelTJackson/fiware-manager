import fetch from "cross-fetch";
import {enqueueSnackbar} from "./notifier";

export function getReducedOrganizations(state) {
  return state.lora.organizations.map(org => ({name: org.name, id: org.id }))

}
export const ADD_ORGANIZATIONS = "ADD_ORGANIZATIONS";
export function addOrganizations(payload) {
  return { type: ADD_ORGANIZATIONS, payload }
}

export function getOrganizations() {
  return function (dispatch) {
    return fetch("/v1/chirpstack/organizations",{credentials: "same-origin"})
      .then(
        response => {
          if (response.status >= 300) {
            throw new Error(response.statusText)
          }
          return response.json()
        }
      )
      .then(json =>
        dispatch(addOrganizations(json))
      )
      .catch(
        err => dispatch(enqueueSnackbar({message: err.message, options: {variant: 'error'}}))
      )
  }

}

export const ADD_APPLICATIONS = "ADD_APPLICATIONS";
export function addApplications(payload) {
  return { type: ADD_APPLICATIONS, payload }
}
export function getApplictaions() {
  return function (dispatch) {
    return fetch("/v1/chirpstack/applications",{credentials: "same-origin"})
      .then(
        response =>  {
          if (response.status >= 300) {
            throw new Error(response.statusText)
          }
          return response.json()
        }
      )
      .then(json =>
        dispatch(addApplications(json))
      )
      .catch(
        err => dispatch(enqueueSnackbar({message: err.message, options: {variant: 'error'}}))
      )
  }
}

export const ADD_DEVICES = "ADD_DEVICES";
export function addDevices({devices, appID}) {
  return { type: ADD_DEVICES, payload: {devices, appID} }
}
export function getDevicesForAppID(appID) {
  return function (dispatch) {
    return fetch("/v1/chirpstack/devices/" + appID,{credentials: "same-origin"})
      .then(
        response =>  {
          if (response.status >= 300) {
            throw new Error("invalid response")
          }
          return response.json()
        }
      )
      .then(devices =>
        dispatch(addDevices({devices, appID}))
      )
      .catch(
        err => dispatch(enqueueSnackbar({message: err.message, options: {variant: 'error'}}))
      )
  }
}
export const ADD_GATEWAYS = "ADD_GATEWAYS";
export function addGateways({gateways, orgID}) {
  return { type: ADD_GATEWAYS, payload: {gateways, orgID} }
}
export function getGatewaysForOrgID(orgID) {
  return function (dispatch) {
    return fetch("/v1/chirpstack/gateways/" + orgID,{credentials: "same-origin"})
      .then(
        response =>  {
          if (response.status >= 300) {
            throw new Error(response.statusText)
          }
          return response.json()
        }
      )
      .then(gateways =>
        dispatch(addGateways({gateways, orgID}))
      )
      .catch(
        err => dispatch(enqueueSnackbar({message: err.message, options: {variant: 'error'}}))
      )
  }
}