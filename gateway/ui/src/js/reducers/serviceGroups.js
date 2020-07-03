import {ADD_SERVICE_GROUP, REMOVE_SERVICE_GROUP_BY_ID, UPDATE_SERVICE_GROUP} from "../actions/serviceGroups";

const initialState = [];

function serviceGroupsReducer(state = initialState, action) {
  if (action.type === ADD_SERVICE_GROUP) {
    return action.payload
  }
  if (action.type === REMOVE_SERVICE_GROUP_BY_ID) {
    return state.filter((g) => (g._id !== action.payload))

  }
  if (action.type === UPDATE_SERVICE_GROUP) {
    return [...state.filter((g) => (g._id !== action.payload._id)), action.payload]

  }
  return state;
}

export default serviceGroupsReducer;