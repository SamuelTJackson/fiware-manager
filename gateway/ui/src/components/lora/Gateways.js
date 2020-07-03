import React, {useEffect, useState} from "react";
import {useDispatch, useSelector} from "react-redux";
import {
  getGatewaysForOrgID,
  getOrganizations,
  getReducedOrganizations
} from "../../js/actions/lora";
import {makeStyles} from "@material-ui/styles";
import TopNavigation from "../common/TopNavigation";
import Grid from "@material-ui/core/Grid";
import TableContainer from "@material-ui/core/TableContainer";
import {Paper} from "@material-ui/core";
import Table from "@material-ui/core/Table";
import TableHead from "@material-ui/core/TableHead";
import TableRow from "@material-ui/core/TableRow";
import TableCell from "@material-ui/core/TableCell";
import TableBody from "@material-ui/core/TableBody";
import Select from "@material-ui/core/Select";
import MenuItem from "@material-ui/core/MenuItem";
import GatewayRow from "./GatewayRow";

const useStyle = makeStyles((theme) => ({
  tableHeader: {
    color: "#999999",
  },
  table: {
    margin: "auto"
  },
  link: {
    textDecoration: 'none'
  }
}))
const ChirpstackGateways = () => {
  const organizations = useSelector(state => getReducedOrganizations(state)) || [];

  const dispatch = useDispatch();
  const classes = useStyle();
  const [selectedOrganization, setSelectedOrganization] = useState("")
  const gateways = useSelector(state => state.lora.gateways[selectedOrganization]) || []
  useEffect(() => {
    dispatch(getOrganizations());
  },[dispatch])

  const changeOrganization = (e) => {
    const v = e.target.value
    setSelectedOrganization(v)
    dispatch(getGatewaysForOrgID(v))
  }
  return (
    <Grid container align="center" justify="center" alignItems="center">
      <TopNavigation list={[{name: 'Chirpstack Gateways', link: '/ChirpstackGateways'}]}/>
      <Grid style={{marginTop: 30, marginBottom: 5}} align="left" item xs={12}>
        <Select
          style={{width: '20%'}}
          onChange={changeOrganization}
          value={selectedOrganization}
        >
          {organizations.map(org => (
            <MenuItem key={org.id} value={org.id}>{org.name}</MenuItem>
          ))}
        </Select>
      </Grid>
      {gateways &&
      <Grid item xs={12} className={classes.table}>
        <TableContainer component={Paper} className={classes.table}>
          <Table>
            <TableHead>
              <TableRow>
                <TableCell className={classes.tableHeader}>ID</TableCell>
                <TableCell className={classes.tableHeader}>Name</TableCell>
                <TableCell className={classes.tableHeader}>Description</TableCell>
                <TableCell className={classes.tableHeader}>Created</TableCell>
                <TableCell className={classes.tableHeader}>Updated</TableCell>
                <TableCell className={classes.tableHeader}>Last Seen</TableCell>
              </TableRow>
            </TableHead>
            <TableBody>
              {gateways.map((gateway) => (
                <GatewayRow gateway={gateway}
                           key={gateway.id}/>
              ))}

            </TableBody>
          </Table>
        </TableContainer>
      </Grid>}
    </Grid>
  )
}
export default ChirpstackGateways;