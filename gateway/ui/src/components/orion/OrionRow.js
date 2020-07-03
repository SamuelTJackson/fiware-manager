import React from "react";
import TableCell from "@material-ui/core/TableCell";
import TableRow from "@material-ui/core/TableRow";
import {useHistory} from "react-router-dom";



const OrionRow = ({entity, service, path}) => {
  const history = useHistory();
  return (
    <TableRow>
      <TableCell onClick={() => history.push({
        pathname: "/Orion/view", search: '?id=' + entity.id + '&service=' + (service ? service : "")+ '&path=' + (path ? path : "/")
      })} style={{textDecoration: "underline blue", cursor: "pointer"}}>{entity.id}</TableCell>
      <TableCell>{entity.type}</TableCell>
    </TableRow>
  )
}

export default OrionRow;