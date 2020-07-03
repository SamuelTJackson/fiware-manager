import React, {useEffect} from "react";
import Grid from "@material-ui/core/Grid";
import TopNavigation from "../common/TopNavigation";
import {useDispatch, useSelector} from "react-redux";
import {makeStyles} from "@material-ui/styles";
import TableContainer from "@material-ui/core/TableContainer";
import {Paper} from "@material-ui/core";
import Table from "@material-ui/core/Table";
import TableHead from "@material-ui/core/TableHead";
import TableRow from "@material-ui/core/TableRow";
import TableCell from "@material-ui/core/TableCell";
import TableBody from "@material-ui/core/TableBody";
import IotAgentRow from "./IotAgentRow";
import { getIotAgents} from "../../js/actions/iotAgents";

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


const IotAgents = () => {
  const iotAgents = useSelector(state => state.iotAgents);
  const dispatch = useDispatch();
  const classes = useStyle();

  useEffect(() => {
    dispatch(getIotAgents());
  },[dispatch])

  return (
    <Grid container align="center" justify="center" alignItems="center">
      <TopNavigation list={[{name: 'Iot Agents', link: '/IotAgents'}]}/>
      <Grid item xs={12} className={classes.table}>
        <TableContainer component={Paper} className={classes.table}>
          <Table>
            <TableHead>
              <TableRow>
                <TableCell className={classes.tableHeader}>Protocols</TableCell>
                <TableCell className={classes.tableHeader}>Endpoint</TableCell>
                <TableCell className={classes.tableHeader}>Resource</TableCell>
                <TableCell className={classes.tableHeader}>Description</TableCell>
              </TableRow>
            </TableHead>
            <TableBody>
              {iotAgents.map((agent) => (
                <IotAgentRow agent={agent}
                           key={agent.resource}/>
              ))}

            </TableBody>
          </Table>
        </TableContainer>
      </Grid>
    </Grid>
  )
}

export default IotAgents;