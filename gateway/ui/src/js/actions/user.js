import fetch from "cross-fetch";
import {enqueueSnackbar} from "./notifier";

export const ADD_USER_INFORMATION = "ADD_USER_INFORMATION";
export function addUserInformation(payload) {
  return { type: ADD_USER_INFORMATION, payload }
}
export const LOGOUT = "LOGOUT"
export function removeUser(payload) {
  return { type: LOGOUT, payload }
}

export function logout() {
  return function (dispatch) {
    return fetch("/v1/logout",{credentials: "same-origin"})
      .then(
        _ => dispatch(removeUser(null))
      )
      .catch(
        err => dispatch(enqueueSnackbar({message: err.message, options: {variant: 'error'}}))
      )
  }
}
export const ADD_CHIRPSTACK_KEY = "ADD_CHIRPSTACK_KEY"
export function addChirpstackKey(payload) {
  return { type: ADD_CHIRPSTACK_KEY, payload}
}

export const UPDATE_CHIRPSTACK_KEY = "UPDATE_CHIRPSTACK_KEY"
export function updateChirpstackKey(loraKey) {
  return function (dispatch) {
    return fetch("/v1/chirpstackKey",
      {
        credentials: "same-origin",
        method: 'POST',
        headers: {
          'Content-Type': 'application/json'
        },
        body: JSON.stringify({
          lora_key: loraKey
        })})
      .then(
        response =>
        {
          if (response.status >= 300) {
            throw new Error(response.statusText)
          }
          dispatch(enqueueSnackbar({message: "lora key updated", options: {variant: 'success'}}))
        }
      )
      .then(_ => dispatch(addChirpstackKey(loraKey)))
      .catch(
        err => dispatch(enqueueSnackbar({message: err.message, options: {variant: 'error'}}))
      )
  }
}

export const GET_CHIRPSTACK_KEY = "GET_CHIRPSTACK_KEY"
export function getChirpstackKey() {
  return {type: GET_CHIRPSTACK_KEY}
}

export const FETCH_CHIRPSTACK_KEY = "FETCH_CHIRPSTACK_KEY"
export function fetchChirpstackKey() {
  return function (dispatch) {
    return fetch("/v1/chirpstackKey",
      {credentials: "same-origin"})
      .then(
        response => response.json()
      )
      .then(
        json => dispatch(addChirpstackKey(json)
        ))
      .catch(
        err => dispatch(enqueueSnackbar({message: err.message, options: {variant: 'error'}}))
      )
  }
}
export const GET_USER_INFORMATION = "GET_USER_INFORMATION";
export function getUserInformation() {
  return function (dispatch) {
    return fetch("/v1/user",{credentials: "same-origin"})
      .then(
        response => {
          if (response.status === 401) {
            throw new Error("You are logged out.");
          }
          if (response.status >= 300) {
            throw new Error("Something went wrong. Try again later.");
          }
          return response.json()
        }
      )
      .then(json =>
        dispatch(addUserInformation(json))
      )
      .catch(
        err => dispatch(enqueueSnackbar({message: err.message, options: {variant: 'error'}}))
      )
  }
}
export const User = "LOGIN";
export function login(payload) {
  return function (dispatch) {
    return fetch("/v1/login",{
      method: "post",
      headers: {
        'Content-Type': 'application/json'
      },

      //make sure to serialize your JSON body
      body: JSON.stringify({
        email: payload.email,
        password: payload.password
      })
    })
      .then(
        resp => dispatch(getUserInformation())
      )
      .catch(
        err => dispatch(enqueueSnackbar({message: err.message, options: {variant: 'error'}}))
      )
  }
}