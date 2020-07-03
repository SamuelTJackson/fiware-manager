import fetch from "cross-fetch";
import {enqueueSnackbar} from "./notifier";


export const ADD_IOT_AGENT = "ADD_IOT_AGENT";
export function addIotAgent(payload) {
  return { type: ADD_IOT_AGENT, payload }
}

export function getIotAgents() {
  return function (dispatch) {
    return fetch("/v1/iotagents",{credentials: "same-origin"})
      .then(
        response => response.json()
      )
      .then(json =>
        dispatch(addIotAgent(json))
      )
      .catch(
        err => dispatch(enqueueSnackbar({message: err.message, options: {variant: 'error'}}))
      )
  }

}