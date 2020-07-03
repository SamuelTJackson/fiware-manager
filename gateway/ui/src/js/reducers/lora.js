import {ADD_APPLICATIONS, ADD_DEVICES, ADD_GATEWAYS, ADD_ORGANIZATIONS} from "../actions/lora";

const initialState = {
  organizations: [],
  applications: [],
  devices: {},
  gateways: {}
};

function loraReducer(state = initialState, action) {
  if (action.type === ADD_ORGANIZATIONS) {
    return {...state, organizations: action.payload}
  }
  if (action.type === ADD_APPLICATIONS) {
    return {...state, applications: action.payload}
  }
  if (action.type === ADD_DEVICES) {
    return {...state, devices: {...state.devices,  [action.payload.appID]: action.payload.devices}}
  }
  if (action.type === ADD_GATEWAYS) {
    return {...state, gateways: {...state.gateways, [action.payload.orgID]: action.payload.gateways}}
  }
  return state;
}

export default loraReducer;