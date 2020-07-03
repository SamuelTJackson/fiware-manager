import {ADD_ENTITIES} from "../actions/orion";


const initialState = [];

function orionReducer(state = initialState, action) {
  if (action.type === ADD_ENTITIES) {
    return action.payload
  }
  return state;
}

export default orionReducer;