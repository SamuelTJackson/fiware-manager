import React from "react";
import TableCell from "@material-ui/core/TableCell";
import Moment from "react-moment";
import TableRow from "@material-ui/core/TableRow";

const GatewayRow = ({gateway}) => {
  return (
    <TableRow>
      <TableCell>{gateway.id}</TableCell>
      <TableCell>{gateway.name}</TableCell>
      <TableCell>{gateway.description}</TableCell>
      <TableCell><Moment unix date={parseInt(gateway.created_at.seconds)}/> </TableCell>
      <TableCell><Moment unix date={parseInt(gateway.updated_at.seconds)}/> </TableCell>
      <TableCell><Moment unix date={parseInt(gateway.last_seen_at.seconds)}/> </TableCell>
    </TableRow>
  )
}
export default GatewayRow;