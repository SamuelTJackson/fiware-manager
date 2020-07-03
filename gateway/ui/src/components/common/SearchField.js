import React from "react";
import Paper from "@material-ui/core/Paper";
import InputBase from "@material-ui/core/InputBase";
import IconButton from "@material-ui/core/IconButton";
import SearchIcon from '@material-ui/icons/Search';
import { makeStyles } from '@material-ui/core/styles';
import Divider from "@material-ui/core/Divider";


const useStyles = makeStyles((theme) => ({

  root: {
    display: "flex",
    width: "400px",
    height: "40px",
    backgroundColor: "transparent",
    borderColor: theme.palette.primary.light
  },
  input: {
    marginLeft: theme.spacing(1),
    flex: 1,
  },
  iconButton: {
    padding: 10,
  },
  divider: {
    height: 27,
    margin: 4,
    backgroundColor: theme.palette.primary.light
  },
}));

const SearchField = ({setFiwareService, setFiwareServicePath, search, fiwareService, fiwareServicePath}) => {
  const classes = useStyles();

  const keyPressed = (event) => {
    if (event.which === 13) {
      search()
    }
  }
  return (
    <Paper variant="outlined" className={classes.root}>
      <InputBase
        onKeyPress={keyPressed}
        className={classes.input}
        placeholder="Fiware Service"
        inputProps={{ 'aria-label': 'search google maps' }}
        value={fiwareService}
        onChange={(event) => setFiwareService(event.target.value)}
      />
      <Divider className={classes.divider} orientation="vertical"/>
      <InputBase
        onKeyPress={keyPressed}
        className={classes.input}
        value={fiwareServicePath}
        placeholder="Fiware Service Path"
        inputProps={{ 'aria-label': 'naked' }}
        onChange={(event) => setFiwareServicePath(event.target.value)}
      />
      <Divider className={classes.divider} orientation="vertical"/>
      <IconButton className={classes.iconButton} onClick={search}>
        <SearchIcon  />
      </IconButton>
    </Paper>
  )
}

export default SearchField;