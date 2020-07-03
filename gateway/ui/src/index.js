import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import App from './App';
import * as serviceWorker from './serviceWorker';
import { createMuiTheme, MuiThemeProvider, responsiveFontSizes } from "@material-ui/core";
import { Provider } from 'react-redux'
import store from "./js/store/index";
import { SnackbarProvider } from 'notistack';
import indigo from '@material-ui/core/colors/indigo';
import pink from '@material-ui/core/colors/pink';

let theme = createMuiTheme(
  {
    palette: {
      primary: pink,
      secondary: indigo // Indigo is probably a good match with pink

    },
  },
);
theme = responsiveFontSizes(theme);

ReactDOM.render(
    <Provider store={store}>
      <MuiThemeProvider theme={theme}>
      <SnackbarProvider maxSnack={3} anchorOrigin={{
        vertical: 'bottom',
        horizontal: 'right',
      }}>
          <App />
      </SnackbarProvider>
      </MuiThemeProvider>
    </Provider>
,
  document.getElementById('root')
);

// If you want your app to work offline and load faster, you can change
// unregister() to register() below. Note this comes with some pitfalls.
// Learn more about service workers: https://bit.ly/CRA-PWA
serviceWorker.unregister();
