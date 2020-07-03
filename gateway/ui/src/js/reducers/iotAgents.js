import {
  ADD_IOT_AGENT,

} from "../actions/iotAgents";
let _ = require('lodash');

const initialState = [];

function iotAgentsReducer(state = initialState, action) {
  if (action.type === ADD_IOT_AGENT) {
    return Object.assign([], state,
      _.unionBy(state, action.payload, 'resource')
    );
  }
  return state;
}

export default iotAgentsReducer;
