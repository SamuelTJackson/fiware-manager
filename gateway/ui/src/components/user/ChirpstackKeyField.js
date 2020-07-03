import React, {Fragment, useState} from "react";
import Input from "@material-ui/core/Input";
import InputAdornment from "@material-ui/core/InputAdornment";
import IconButton from "@material-ui/core/IconButton";
import {Visibility, VisibilityOff} from "@material-ui/icons";
import FormHelperText from "@material-ui/core/FormHelperText";
const ChirpstackKeyField = ({value,setValue}) => {
  const [show, setShow] = useState(false);

  const update = (e) => {
    const v = e.target.value
    setValue(v)
  }
  return (
    <Fragment>
      <Input
        type={show ? 'text' : 'password'}
        value={value}
        onChange={update}
        fullWidth
        placeholder='Api key'
        endAdornment={
          <InputAdornment position="end">
            <IconButton
              aria-label="toggle password visibility"
              onClick={() => setShow(prevState => !prevState)}
              onMouseDown={(event => event.preventDefault())}
            >
              {show ? <Visibility /> : <VisibilityOff />}
            </IconButton>
          </InputAdornment>
        }
      />
      <FormHelperText>To communicate with the chirpstack application service, you have to
        create an api key in the chirpstack application service and enter it here.</FormHelperText>
    </Fragment>
  )
}
export default ChirpstackKeyField;