import React, {useState} from "react";
import TopNavigation from "../common/TopNavigation";
import Grid from "@material-ui/core/Grid";
import {Link, useLocation} from "react-router-dom";
import Button from "@material-ui/core/Button";
import AddIcon from "@material-ui/icons/Add";
import TableContainer from "@material-ui/core/TableContainer";
import {Paper} from "@material-ui/core";
import Table from "@material-ui/core/Table";
import TableHead from "@material-ui/core/TableHead";
import TableRow from "@material-ui/core/TableRow";
import TableCell from "@material-ui/core/TableCell";
import TableBody from "@material-ui/core/TableBody";
import {makeStyles} from "@material-ui/styles";
import SearchField from "./SearchField";
import {useDispatch, useSelector} from "react-redux";
import {getEntities, getEntitiesByIDPattern} from "../../js/actions/orion";
import OrionRow from "./OrionRow";

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

const Orion = (props) => {
  const dispatch = useDispatch();
  const entities = useSelector((state) => getEntities(state));
  console.log(entities)
  const query = useQuery()
  const service = query.get("service")
  const path = query.get("path")
  const classes = useStyle();
  const [fiwareService, setFiwareService] = useState(service || "");
  const [fiwareServicePath, setFiwareServicePath] = useState(path || "");
  const [idPattern, setIdPattern] = useState("")
  const search = () => {
    dispatch(getEntitiesByIDPattern(fiwareService, fiwareServicePath, idPattern))
  }
  return (
    <Grid container align="center" justify="center" alignItems="center">
      <TopNavigation list={[{name: 'Orion', link: '/Orion'}]}/>
      <Grid item xs={12} sm={6} style={{marginTop: 30, marginBottom: 5}} align="left">
        <SearchField
          setIdPattern={setIdPattern}
          setFiwareService={setFiwareService}
          setFiwareServicePath={setFiwareServicePath}
          idPattern={idPattern}
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
                <TableCell className={classes.tableHeader}>Entity Name</TableCell>
              </TableRow>
            </TableHead>
            <TableBody>
              {entities.map(entitiy =>(
                <OrionRow entity={entitiy} path={fiwareServicePath} service={fiwareService} key={entitiy.id}/>
              ))}
            </TableBody>
          </Table>
        </TableContainer>
      </Grid>
    </Grid>
  )
}
export default Orion;