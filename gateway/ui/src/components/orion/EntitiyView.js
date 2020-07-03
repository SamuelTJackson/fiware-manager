import React from "react";
import Grid from "@material-ui/core/Grid";
import TopNavigation from "../common/TopNavigation";
import Button from "@material-ui/core/Button";
import DeleteIcon from "@material-ui/icons/Delete";
import Paper from "@material-ui/core/Paper";
import EntityCard from "./EntityCard";

const EntityView = ({entity, create, service, path}) => {
  const deleteAction = () => {

  }
  return (
    <Grid container align="center" justify="center" alignItems="center">
      <Grid item xs={create ? 12 : 8}><TopNavigation
        list={[{name: 'Orion', link: '/Orion'}, {
          name: (create ? 'create' : entity.id),
          link: (create ? '/Orion/create' : '/Orion/view?id=' + entity.id + '&service=' + (service ? service : "") +
            '&path=' + (path ? path : "/"))
        }]}/></Grid>
      {!create && <Grid item xs={4} align="right"><Button variant="outlined" color="secondary"
                                                          onClick={deleteAction}
                                                          startIcon={<DeleteIcon/>}>Delete</Button></Grid>}
      <Grid item xs={12} style={{marginTop: 30}}>
        <Paper>
          <EntityCard field={entity}/>
        </Paper>
      </Grid>
    </Grid>

  )
}
export default EntityView;