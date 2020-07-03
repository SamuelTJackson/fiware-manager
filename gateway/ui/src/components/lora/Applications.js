import React, {useEffect} from "react";
import TopNavigation from "../common/TopNavigation";
import Grid from "@material-ui/core/Grid";
import TableContainer from "@material-ui/core/TableContainer";
import {Paper} from "@material-ui/core";
import Table from "@material-ui/core/Table";
import TableHead from "@material-ui/core/TableHead";
import TableRow from "@material-ui/core/TableRow";
import TableCell from "@material-ui/core/TableCell";
import TableBody from "@material-ui/core/TableBody";
import {makeStyles} from "@material-ui/styles";
import {useDispatch, useSelector} from "react-redux";
import {getApplictaions} from "../../js/actions/lora";
import ApplicationRow from "./ApplicationRow";

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
const Applications = () => {
  const applications = useSelector(state => state.lora.applications);
  const dispatch = useDispatch();
  const classes = useStyle();

  useEffect(() => {
    dispatch(getApplictaions());
  },[dispatch])
  return (
    <Grid container align="center" justify="center" alignItems="center">
      <TopNavigation list={[{name: 'Chirpstack Applications', link: '/ChirpstackApplications'}]}/>
      <Grid item xs={12} className={classes.table}>
        <TableContainer component={Paper} className={classes.table}>
          <Table>
            <TableHead>
              <TableRow>
                <TableCell className={classes.tableHeader}>ID</TableCell>
                <TableCell className={classes.tableHeader}>Name</TableCell>
                <TableCell className={classes.tableHeader}>Description</TableCell>
                <TableCell className={classes.tableHeader}>Organization ID</TableCell>
                <TableCell className={classes.tableHeader}>Service profile</TableCell>
              </TableRow>
            </TableHead>
            <TableBody>
              {applications.map((app) => (
                <ApplicationRow application={app}
                                 key={app.id}/>
              ))}

            </TableBody>
          </Table>
        </TableContainer>
      </Grid>
    </Grid>
  )
}

export default Applications;