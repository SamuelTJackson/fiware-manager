import { ENQUEUE_SNACKBAR, CLOSE_SNACKBAR, REMOVE_SNACKBAR } from '../actions/notifier';

const defaultState = []

export default (state = defaultState, action) => {
  switch (action.type) {
    case ENQUEUE_SNACKBAR:
      return [...state,
        {
          key: action.key,
          ...action.notification,
        }];

    case CLOSE_SNACKBAR:
      return {
        ...state,
        notifications: state.map(notification => (
          (action.dismissAll || notification.key === action.key)
            ? { ...notification, dismissed: true }
            : { ...notification }
        )),
      };

    case REMOVE_SNACKBAR:
      return  state.filter(
          notification => notification.key !== action.key,
        );

    default:
      return state;
  }
};