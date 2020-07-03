import React from "react";
import {Box} from "@material-ui/core";
import {makeStyles} from "@material-ui/styles";
const useStyle = makeStyles((theme) => ({
    container: {
    display: 'flex',
    alignItems: 'center',
  },
  border: {
    borderBottom: '1px solid ' + theme.palette.primary.main,
    width: '100%',
  },
  content: {
    padding: '0 10px 0 10px',
    fontWeight: '600',
    color: theme.palette.primary.main
  }
}))
const TextDivider = ({text}) => {
  const classes = useStyle();
  return (
    <Box className={classes.container}>
      <Box className={classes.content}>
        {text}
      </Box>
      <div className={classes.border} />
    </Box>
  )
}
export default TextDivider;