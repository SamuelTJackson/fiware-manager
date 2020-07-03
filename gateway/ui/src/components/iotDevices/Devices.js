import React, {useState} from "react";
import Grid from "@material-ui/core/Grid";
import TopNavigation from "../common/TopNavigation";
import SearchField from "../common/SearchField";
import {Link, useLocation} from "react-router-dom";
import Button from "@material-ui/core/Button";
import AddIcon from "@material-ui/icons/Add";
import {getDevices} from "../../js/actions/devices";
import {useDispatch, useSelector} from "react-redux";
import {makeStyles} from "@material-ui/styles";
import TableContainer from "@material-ui/core/TableContainer";
import {Paper} from "@material-ui/core";
import Table from "@material-ui/core/Table";
import TableHead from "@material-ui/core/TableHead";
import TableRow from "@material-ui/core/TableRow";
import TableCell from "@material-ui/core/TableCell";
import TableBody from "@material-ui/core/TableBody";
import DeviceRow from "./DeviceRow";

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

function useQuery() {
  return new URLSearchParams(useLocation().search);
}

const Devices = () => {
  const devices = useSelector(state => state.devices);
  const dispatch = useDispatch();
  const query = useQuery()
  const service = query.get("service")
  const path = query.get("path")
  const classes = useStyle();
  const [fiwareService, setFiwareService] = useState(service || "");
  const [fiwareServicePath, setFiwareServicePath] = useState(path || "");

  const search = () => {
    dispatch(getDevices(fiwareService, fiwareServicePath))
  }

  return (
    <Grid container align="center" justify="center" alignItems="center">
      <TopNavigation list={[{name: 'Devices', link: '/Devices'}]}/>
      <Grid item xs={12} sm={6} style={{marginTop: 30, marginBottom: 5}} align="left"><SearchField
        setFiwareService={setFiwareService} setFiwareServicePath={setFiwareServicePath}
        fiwareService={fiwareService}
        fiwareServicePath={fiwareServicePath} search={search}/></Grid>
      <Grid item xs={12} sm={6} style={{marginTop: 30, marginBottom: 5}} align="right">
        <Link className={classes.link} to="/Devices/create"><Button variant="outlined" color="primary"
                                                                    startIcon={<AddIcon/>}>Create</Button></Link>
      </Grid>
      <Grid item xs={12} className={classes.table}>
        <TableContainer component={Paper} className={classes.table}>
          <Table>
            <TableHead>
              <TableRow>
                <TableCell className={classes.tableHeader}>ID</TableCell>
                <TableCell className={classes.tableHeader}>Protocol</TableCell>
                <TableCell className={classes.tableHeader}>Entity Type</TableCell>
                <TableCell className={classes.tableHeader}>Entity Name</TableCell>
              </TableRow>
            </TableHead>
            <TableBody>
              {devices.filter((d) => (d.service === fiwareService) && d.service_path ===
                (fiwareServicePath === "" ? "/" : fiwareServicePath)).map((device) => (
                <DeviceRow device={device} service={fiwareService} path={fiwareServicePath}
                           key={device.device_id}/>
              ))}

            </TableBody>
          </Table>
        </TableContainer>
      </Grid>
    </Grid>
  )
}

export default Devices;