import React, {useEffect} from "react";
import {useLocation} from "react-router-dom";
import {useDispatch, useSelector} from "react-redux";
import {getDevicesForAppID} from "../../js/actions/lora";
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
import DeviceRow from "./DeviceRow";

function useQuery() {
  return new URLSearchParams(useLocation().search);
}
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
const ChirpstackDevices = () => {
  let query = useQuery();
  const appID = query.get("appID")
  const appName = query.get("name")
  const devices = useSelector(state => state.lora.devices[appID]) || [];
  const dispatch = useDispatch();
  const classes = useStyle();

  useEffect(() => {
    dispatch(getDevicesForAppID(appID));
  },[dispatch, appID])

  return (
    <Grid container align="center" justify="center" alignItems="center">
    <TopNavigation list={[{name: 'Chirpstack Applications', link: '/ChirpstackApplications'}, {name: (appName ? appName: appID), link: '/ChirpstackDevices?appID=' + appID}]}/>
  <Grid item xs={12} className={classes.table}>
    <TableContainer component={Paper} className={classes.table}>
      <Table>
        <TableHead>
          <TableRow>
            <TableCell className={classes.tableHeader}>Device EUI</TableCell>
            <TableCell className={classes.tableHeader}>Name</TableCell>
            <TableCell className={classes.tableHeader}>Description</TableCell>
            <TableCell className={classes.tableHeader}>Device Profile ID</TableCell>
            <TableCell className={classes.tableHeader}>Device Profile Name</TableCell>
            <TableCell className={classes.tableHeader}>Battery Level</TableCell>
          </TableRow>
        </TableHead>
        <TableBody>
          {devices.map((device) => (
            <DeviceRow device={device}
                            key={device.dev_eui}/>
          ))}

        </TableBody>
      </Table>
    </TableContainer>
  </Grid>
</Grid>
  )
}
export default ChirpstackDevices;