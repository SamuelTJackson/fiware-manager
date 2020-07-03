import {ADD_CHIRPSTACK_KEY, ADD_USER_INFORMATION, GET_CHIRPSTACK_KEY, LOGOUT} from "../actions/user";

const initialState = {
  user: {},
  loggedIn: false
};

function userReducer(state = initialState, action) {
  if (action.type === ADD_USER_INFORMATION) {
    return {...state, user: action.payload, loggedIn: true};
  }
  if (action.type === LOGOUT) {
    return {...state, user: {}, loggedIn: false};
  }
  if (action.type === ADD_CHIRPSTACK_KEY) {
    return {...state, loraKey: action.payload.lora_key, user: {...state.user, chirpstack_token: true}};
  }
  if (action.type === GET_CHIRPSTACK_KEY) {
    return state.loraKey
  }

  return state;
}
export default userReducer;