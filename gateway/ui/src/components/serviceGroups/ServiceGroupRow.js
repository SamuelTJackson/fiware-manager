import React from "react";
import TableCell from "@material-ui/core/TableCell";
import TableRow from "@material-ui/core/TableRow";
import PasswordField from "./PasswordField";
import {useHistory} from "react-router-dom";

const ServiceGroupRow = ({service, type, fiwareService, fiwareServicePath}) => {
  const history = useHistory();
  return (
    <TableRow>
      <TableCell onClick={() => history.push({
        pathname: "/ServiceGroups/view", search: '?id=' + service._id + '&service=' + fiwareService + '&path=' + fiwareServicePath
      })} style={{textDecoration: "underline blue", cursor: "pointer"}}>{service._id}</TableCell>
      <TableCell>{type}</TableCell>
      <TableCell>{fiwareService}</TableCell>
      <TableCell>{fiwareServicePath ? fiwareServicePath : '/'}</TableCell>
      <TableCell>
        <PasswordField value={service.apikey}/>
      </TableCell>
    </TableRow>
  )
}

export default ServiceGroupRow;