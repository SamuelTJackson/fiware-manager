import React, { useState} from "react";
import Grid from "@material-ui/core/Grid";
import Button from "@material-ui/core/Button";
import AddIcon from '@material-ui/icons/Add';
import TableContainer from "@material-ui/core/TableContainer";
import Table from "@material-ui/core/Table";
import TableHead from "@material-ui/core/TableHead";
import TableRow from "@material-ui/core/TableRow";
import TableCell from "@material-ui/core/TableCell";
import TableBody from "@material-ui/core/TableBody";
import {Paper} from "@material-ui/core";
import ServiceGroupRow from "./ServiceGroupRow";
import {makeStyles} from "@material-ui/styles";
import SearchField from "../common/SearchField";
import {Link, useLocation} from "react-router-dom";
import TopNavigation from "../common/TopNavigation";
import {useDispatch, useSelector} from "react-redux";
import {getServiceGroups, removeServiceGroupByID} from "../../js/actions/serviceGroups";

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

const ServiceGroups = () => {
  const serviceGroups = useSelector(state => state.serviceGroups);
  const dispatch = useDispatch();
  const query = useQuery();
  const service = query.get("service")
  const path = query.get("path")
  const classes = useStyle();
  const [fiwareService, setFiwareService] = useState(service || "");
  const [fiwareServicePath, setFiwareServicePath] = useState(path || "");


  const search = () => {
    dispatch(getServiceGroups(fiwareService,fiwareServicePath))
  }

  const deleteService = (id, resource, key) => {
    dispatch(removeServiceGroupByID({resource, key, fiwareServicePath, fiwareService}))
  }
  return (
    <Grid container align="center" justify="center" alignItems="center">
      <TopNavigation list={[{name: 'Service Groups', link: '/ServiceGroups'}]}/>
      <Grid item xs={12} sm={6} style={{marginTop: 30, marginBottom: 5}} align="left"><SearchField
        setFiwareService={setFiwareService} setFiwareServicePath={setFiwareServicePath}
        fiwareService={fiwareService}
        fiwareServicePath={fiwareServicePath} search={search}/></Grid>
      <Grid item xs={12} sm={6} style={{marginTop: 30, marginBottom: 5}} align="right">
        <Link className={classes.link} to="/ServiceGroups/create"><Button variant="outlined" color="primary"
                                                                          startIcon={<AddIcon/>}>Create</Button></Link>
      </Grid>
      <Grid item xs={12} className={classes.table}>
        <TableContainer component={Paper} className={classes.table}>
          <Table>
            <TableHead>
              <TableRow>
                <TableCell className={classes.tableHeader}>ID</TableCell>
                <TableCell className={classes.tableHeader}>Type</TableCell>
                <TableCell className={classes.tableHeader}>Fiware Service</TableCell>
                <TableCell className={classes.tableHeader}>Fiware Service Path</TableCell>
                <TableCell style={{width: "25%"}} className={classes.tableHeader}>Key</TableCell>
              </TableRow>
            </TableHead>
            <TableBody>
              {serviceGroups.filter((sG) => (sG.service === fiwareService) && sG.subservice === (fiwareServicePath === "" ? "/" : fiwareServicePath)).map((service) => (
                <ServiceGroupRow service={service} type="Json" fiwareService={service.service}
                                 fiwareServicePath={service.subservice}
                                 key={service._id} deleteService={deleteService}/>
              ))}

            </TableBody>
          </Table>
        </TableContainer>
      </Grid>
    </Grid>
  )
}
export default ServiceGroups;