import fetch from "cross-fetch";
import {enqueueSnackbar} from "./notifier";


export const ADD_ENTITIES = "ADD_ENTITIES";

export function addEntities(payload) {
  return {type: ADD_ENTITIES, payload}
}

export const getEntity = (state, id) => state.orion.filter(e => e.id === id)[0]

export const getEntities = (state) => state.orion
export const getEntitiesByIDPattern = (fiwareService, fiwareServicePath, idPattern) => (dispatch) => {
  return fetch("/v1/orion?idPattern=" + (idPattern ? idPattern : ".*"), {
    credentials: "same-origin",
    headers: {
      'fiware-service': fiwareService,
      'fiware-servicepath': fiwareServicePath,
    }
  })
    .then( response => {
    if (response.status >= 300) {
      throw new Error("could not get entity")
    }
    return response.json()
  }
)
.then(json =>
      dispatch(addEntities(json))
    )
    .catch(
      err => dispatch(enqueueSnackbar({message: err.message, options: {variant: 'error'}}))
    )
}

export const getEntityByID = (fiwareService, fiwareServicePath, id) => (dispatch) => {
  return fetch("/v1/orion/" + id, {
    credentials: "same-origin",
    headers: {
      'fiware-service': fiwareService,
      'fiware-servicepath': fiwareServicePath,
    }
  })
    .then(
      response => {
        if (response.status >= 300) {
          throw new Error("could not get entity")
        }
        return response.json()
      }
    )
    .then(
      json => dispatch(addEntities([json]))
    )
    .catch(
      err => dispatch(enqueueSnackbar({message: err.message, options: {variant: 'error'}}))
    )
}