import React, {useState} from "react";
import {Box} from "@material-ui/core";
import {Visibility, VisibilityOff} from "@material-ui/icons";
import IconButton from "@material-ui/core/IconButton";


const PasswordField = ({value}) => {
  const [showValue, setShowValue] = useState(false);

  const createPassword = () => {
    let p = ""
    for (let i = 0; i< value.length; i++) {
      p = p + "*"
    }
    return p
  }

  return (
    <Box>
      {showValue ? value : createPassword()}
      <IconButton
      onClick={() => setShowValue(!showValue)}
      edge="end"
    >
      {showValue ? <Visibility /> : <VisibilityOff />}
    </IconButton>
    </Box>
  )

}

export default PasswordField;