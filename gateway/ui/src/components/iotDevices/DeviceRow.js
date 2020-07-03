import React from "react";
import {useHistory} from "react-router-dom";
import TableCell from "@material-ui/core/TableCell";
import TableRow from "@material-ui/core/TableRow";

const DeviceRow = ({device, service, path}) => {
  const history = useHistory();

  return(
    <TableRow>
      <TableCell onClick={() => history.push({
        pathname: "/Devices/view", search: '?id=' + device.device_id + '&service=' + service + '&path=' + path
      })} style={{textDecoration: "underline blue", cursor: "pointer"}}>{device.device_id}</TableCell>
      <TableCell>{device.protocol}</TableCell>
      <TableCell>{device.entity_name}</TableCell>
      <TableCell>{device.entity_type}</TableCell>
    </TableRow>
  )
}
export default DeviceRow;