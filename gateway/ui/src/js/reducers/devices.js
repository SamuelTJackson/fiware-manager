import {
    ADD_DEVICE, REMOVE_DEVICE_BY_ID, UPDATE_DEVICE,
} from "../actions/devices";
let _ = require('lodash');
const initialState = [];

function deviceReducer(state = initialState, action) {
    if (action.type === REMOVE_DEVICE_BY_ID) {
        return state.filter((g) => (g.device_id !== action.payload))
    }

    if (action.type === UPDATE_DEVICE) {
        return Object.assign([], state,
            [...state.filter((g) => (g.device_id !== action.payload.device_id)), action.payload]
        )
    }

    if (action.type === ADD_DEVICE) {
        if (Object.prototype.toString.call(action.payload) === '[object Array]') {
            return Object.assign([], state,
                _.unionBy(state, action.payload, 'device_id')
            );
        } else {
            return Object.assign([], state,
                _.unionBy(state, [action.payload], 'device_id')
            );
        }

    }
    return state;
}

export default deviceReducer;
