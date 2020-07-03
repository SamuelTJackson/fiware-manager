import React from "react";
import TableCell from "@material-ui/core/TableCell";
import TableRow from "@material-ui/core/TableRow";



const IotAgentRow = ({agent}) => {

  return(
    <TableRow>
      <TableCell>{agent.protocol.replace(/\|/g, ", ")}</TableCell>
      <TableCell>{agent.url}</TableCell>
      <TableCell>{agent.resource}</TableCell>
      <TableCell>{agent.description}</TableCell>
    </TableRow>
  )
}
export default IotAgentRow;