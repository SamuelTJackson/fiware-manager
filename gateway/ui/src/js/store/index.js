import {createStore, applyMiddleware, combineReducers} from "redux";
import deviceReducer from "../reducers/devices";
import thunk from 'redux-thunk';
import iotAgentsReducer from "../reducers/iotAgents";
import serviceGroupsReducer from "../reducers/serviceGroups";
import notifier from "../reducers/notifier";
import userReducer from "../reducers/user";
import loraReducer from "../reducers/lora";
import orionReducer from "../reducers/orion"
const rootReducer = combineReducers(
  {
    iotAgents: iotAgentsReducer,
    devices: deviceReducer,
    serviceGroups: serviceGroupsReducer,
    notifications: notifier,
    user: userReducer,
    lora: loraReducer,
    orion: orionReducer,
  }
)

const store = applyMiddleware(thunk)(createStore)(rootReducer);

export default store;
