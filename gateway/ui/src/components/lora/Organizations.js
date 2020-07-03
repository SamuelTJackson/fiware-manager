import React, {useEffect} from "react";
import {makeStyles} from "@material-ui/styles";
import {useDispatch, useSelector} from "react-redux";
import TopNavigation from "../common/TopNavigation";
import Grid from "@material-ui/core/Grid";
import TableContainer from "@material-ui/core/TableContainer";
import {Paper} from "@material-ui/core";
import Table from "@material-ui/core/Table";
import TableHead from "@material-ui/core/TableHead";
import TableRow from "@material-ui/core/TableRow";
import TableCell from "@material-ui/core/TableCell";
import TableBody from "@material-ui/core/TableBody";
import OrganizationRow from "./OrganizationRow";
import {getOrganizations} from "../../js/actions/lora";


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
const Organizations = () => {
  const organizations = useSelector(state => state.lora.organizations);
  const dispatch = useDispatch();
  const classes = useStyle();

  useEffect(() => {
    dispatch(getOrganizations());
  },[dispatch])

  return (
    <Grid container align="center" justify="center" alignItems="center">
      <TopNavigation list={[{name: 'Chirpstack Organizations', link: '/ChirpstackOrganizations'}]}/>
      <Grid item xs={12} className={classes.table}>
        <TableContainer component={Paper} className={classes.table}>
          <Table>
            <TableHead>
              <TableRow>
                <TableCell className={classes.tableHeader}>ID</TableCell>
                <TableCell className={classes.tableHeader}>Name</TableCell>
                <TableCell className={classes.tableHeader}>Display name</TableCell>
                <TableCell className={classes.tableHeader}>Can have gateway</TableCell>
                <TableCell className={classes.tableHeader}>Created</TableCell>
                <TableCell className={classes.tableHeader}>Updated</TableCell>
              </TableRow>
            </TableHead>
            <TableBody>
              {organizations.map((organization) => (
                <OrganizationRow organization={organization}
                             key={organization.id}/>
              ))}

            </TableBody>
          </Table>
        </TableContainer>
      </Grid>
    </Grid>
  )
}
export default Organizations;