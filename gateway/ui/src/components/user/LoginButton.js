import React, {Fragment} from "react";
import {makeStyles} from "@material-ui/core/styles";
import Gravatar from "react-gravatar";
import Button from "@material-ui/core/Button";
import Typography from "@material-ui/core/Typography";
import {useSelector} from "react-redux";

const useStyles = makeStyles((theme) => ({
  gravatar: {
    height: "30px",
    borderRadius: "15px",
    width: "30px",
    marginLeft: "45px",
    position: "absolute"
  },
  button: {
    height: "30px",
    borderRadius: "15px",
    background: theme.palette.primary.dark,
    width: "120px"
  },
  typography: {
    textAlign: "left",
    textDecoration: 'none !important',
    width: '100%',
    color: 'white'
  }
}));
const LoginButton = () => {
  const classes = useStyles();
  const user = useSelector(state => state.user.user);
  return (
    <Fragment>

      <Button
        className={classes.button}
        ariant="contained"
      ><Gravatar className={classes.gravatar} email={user.email}/>
      <Typography variant='subtitle2' className={classes.typography}>{user.username}</Typography></Button>
    </Fragment>

  )
}
export default LoginButton