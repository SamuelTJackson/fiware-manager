import React from "react";
import TextField from "@material-ui/core/TextField";



const SolTextField = ({onChange, label}) => {

  return (
    <form noValidate autoComplete="off">
      <TextField
        onChange={ (event) => onChange(event.target.value)}
        id="outlined-basic"
        label={label}
        variant="filled" />
    </form>
  )
}

export default SolTextField;