import React, {useEffect, useState} from 'react';
import { makeStyles } from '@material-ui/core/styles';
import {useHistory} from "react-router-dom";
import Grid from "@material-ui/core/Grid";
import Paper from "@material-ui/core/Paper";
import Button from "@material-ui/core/Button";
import Checkbox from "@material-ui/core/Checkbox";
import FormControlLabel from "@material-ui/core/FormControlLabel";
import {Face, Fingerprint} from "@material-ui/icons";
import TextField from "@material-ui/core/TextField";
import Typography from "@material-ui/core/Typography";
import {useDispatch} from "react-redux";
import {getUserInformation, login} from "../js/actions/user";
import Box from "@material-ui/core/Box";
const useStyles = makeStyles((theme) => ({
  margin: {
    margin: '20px',
  },
  padding: {
    padding: '5px'
  },
  paper: {
    position: 'absolute',
    top: '50%',
    left: '50%',
    transform: 'translate(-50%, -50%)',
    width: '50%'
  }
}));
const Login = (props) => {
  const classes = useStyles();
  const history = useHistory();
  const [email, setEmail] = useState("");
  const [password, setPassword] = useState("");
  const dispatch = useDispatch();
  useEffect(()=> {
    dispatch(getUserInformation())
  },[dispatch])
  const changeValue = (e,k) => {
    const v = e.target.value
    if (k === "pass") {
      setPassword(v)
    } else {
      setEmail(v)
    }
  }
  const makeLogin = () => {
    dispatch(login({email, password}))
    history.push("/IotAgents")
  }
  return (
    <Paper className={classes.paper}>
      <Box className={classes.margin}>
        <Grid container spacing={8} alignItems="flex-end">
          <Grid item xs={12}>
            <Typography variant='h5'>Login with your keyrock credentials</Typography>
          </Grid>
          <Grid item>
            <Face />
          </Grid>
          <Grid item md={true} sm={true} xs={true}>
            <TextField id="email" label="Email" type="email"
                       value={email} onChange={(e) => changeValue(e, "email")} fullWidth autoFocus required />
          </Grid>
        </Grid>
        <Grid container spacing={8} alignItems="flex-end">
          <Grid item>
            <Fingerprint />
          </Grid>
          <Grid item md={true} sm={true} xs={true}>
            <TextField id="password" label="Password" type="password"
                       value={password} onChange={(e) => changeValue(e, "pass")} fullWidth required />
          </Grid>
        </Grid>
        <Grid container alignItems="center" justify="space-between">
          <Grid item>
            <FormControlLabel control={
              <Checkbox
                color="primary"
              />
            } label="Remember me" />
          </Grid>
          <Grid item>
            <Button disableFocusRipple disableRipple style={{ textTransform: "none" }} variant="text" color="primary">Forgot password ?</Button>
          </Grid>
        </Grid>
        <Grid container justify="center" style={{ marginTop: '10px' }}>
          <Button variant="outlined" color="primary" style={{ textTransform: "none" }} onClick={makeLogin}>Login</Button>
        </Grid>
      </Box>
    </Paper>
  )
}
export default Login;