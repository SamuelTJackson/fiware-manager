import React from "react";
import TableRow from "@material-ui/core/TableRow";
import TableCell from "@material-ui/core/TableCell";


const DeviceRow = ({device}) => {
  return (
    <TableRow>
      <TableCell>{device.dev_eui}</TableCell>
      <TableCell>{device.name}</TableCell>
      <TableCell>{device.description}</TableCell>
      <TableCell>{device.device_profile_id}</TableCell>
      <TableCell>{device.device_profile_name}</TableCell>
      <TableCell>{device.device_status_battery_level} %</TableCell>
    </TableRow>
  )
}

export default DeviceRow;