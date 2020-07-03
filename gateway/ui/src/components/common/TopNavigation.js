import React from "react";
import Breadcrumbs from "@material-ui/core/Breadcrumbs";
import {Link} from "react-router-dom";
import Grid from "@material-ui/core/Grid";
import {makeStyles} from "@material-ui/core/styles";

const useStyles = makeStyles((theme) => ({
  root: {
    flexGrow: 1,
    backgroundColor: theme.palette.background.paper,
  },
  font: {
    color: theme.palette.primary.main
  },
  link: {
    textDecoration: 'none',
    color: theme.palette.primary.main
  },
  lastItem:{
    color: "#000",
    textDecoration: 'none'
  }
}));
const TopNavigation = ({list}) => {
  const classes = useStyles();
  return (
    <Grid item xs={12} align="left">
      <Breadcrumbs style={{fontSize: 30}} aria-label="breadcrumb">
        {list.map((item, index) => (
          index < list.length -1 ?
            <Link key={item.name} className={classes.link}  to={item.link} >
              {item.name}
            </Link> :
            <Link key={item.name} className={classes.lastItem} to={item.link} >
              {item.name}
            </Link>
        ))}

      </Breadcrumbs>
    </Grid>
  )
}
export default TopNavigation;