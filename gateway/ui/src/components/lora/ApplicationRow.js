import React from "react";
import TableCell from "@material-ui/core/TableCell";
import TableRow from "@material-ui/core/TableRow";
import {useHistory} from "react-router-dom";


const ApplicationRow = ({application}) => {
  const history = useHistory();
  return (
    <TableRow>
      <TableCell onClick={() => history.push({
        pathname: "/ChirpstackDevices", search: '?appID=' + application.id + '&name=' + application.name
      })} style={{textDecoration: "underline blue", cursor: "pointer"}}>{application.id}</TableCell>
      <TableCell>{application.name}</TableCell>
      <TableCell>{application.description}</TableCell>
      <TableCell>{application.organization_id}</TableCell>
      <TableCell>{application.service_profile_name}</TableCell>
    </TableRow>
  )
}
export default ApplicationRow;