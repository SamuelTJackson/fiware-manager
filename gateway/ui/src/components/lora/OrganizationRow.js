import React from "react";
import TableCell from "@material-ui/core/TableCell";
import TableRow from "@material-ui/core/TableRow";
import CheckBoxIcon from '@material-ui/icons/CheckBox';
import ClearIcon from '@material-ui/icons/Clear';
import Moment from 'react-moment';

const OrganizationRow = ({organization}) => {
  return (
    <TableRow>
      <TableCell>{organization.id}</TableCell>
      <TableCell>{organization.name}</TableCell>
      <TableCell>{organization.display_name}</TableCell>
      <TableCell>{organization.can_have_gateways ? <CheckBoxIcon/> : <ClearIcon/>}</TableCell>
      <TableCell><Moment unix date={parseInt(organization.created_at.seconds)}/> </TableCell>
      <TableCell><Moment unix date={parseInt(organization.updated_at.seconds)}/> </TableCell>
    </TableRow>
  )
}
export default OrganizationRow;