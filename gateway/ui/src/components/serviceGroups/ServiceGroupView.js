import React, {useState} from "react";
import PropTypes from 'prop-types';
import {makeStyles} from '@material-ui/core/styles';
import AppBar from '@material-ui/core/AppBar';
import Tabs from '@material-ui/core/Tabs';
import Tab from '@material-ui/core/Tab';
import Box from '@material-ui/core/Box';
import Paper from "@material-ui/core/Paper";
import Grid from "@material-ui/core/Grid";
import TopNavigation from "../common/TopNavigation"
import TextField from "@material-ui/core/TextField";
import IconButton from "@material-ui/core/IconButton";
import RefreshIcon from '@material-ui/icons/Refresh';
import Button from "@material-ui/core/Button";
import VariableTabInsersts from "../common/VariableTabInserts"
import DeleteIcon from '@material-ui/icons/Delete';

function TabPanel(props) {
  const {children, value, index, ...other} = props;

  return (
    <Box
      role="tabpanel"
      hidden={value !== index}
      id={`wrapped-tabpanel-${index}`}
      {...other}
    >
      {value === index && (
        <Box p={3}>
          {children}
        </Box>
      )}
    </Box>
  );
}

TabPanel.propTypes = {
  children: PropTypes.node,
  index: PropTypes.any.isRequired,
  value: PropTypes.any.isRequired,
};

function a11yProps(index) {
  return {
    id: `wrapped-tab-${index}`,
    'aria-controls': `wrapped-tabpanel-${index}`,
  };
}

const useStyles = makeStyles((theme) => ({
  root: {
    flexGrow: 1,
    backgroundColor: theme.palette.background.paper,
  },
  font: {
    color: theme.palette.primary.main
  }
}));

const ServiceGroupView = ({initialServiceGroup, create, mainButtonAction, deleteAction}) => {
  const classes = useStyles();
  const [value, setValue] = React.useState('general');
  const [serviceGroup, setServiceGroup] = useState(initialServiceGroup)
  const generateAPIKey = () => {
    let charSet = 'ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789';
    let randomString = '';
    for (let i = 0; i < 30; i++) {
      let randomPoz = Math.floor(Math.random() * charSet.length);
      randomString += charSet.substring(randomPoz, randomPoz + 1);
    }
    setServiceGroup((prevState) => ({...prevState, apikey: randomString}));
  }
  const onChange = (e) => {
    const target = e.target
    setServiceGroup((prevState) => ({...prevState, [target.name]: target.value}))
  }


  const handleChange = (event, newValue) => {
    setValue(newValue);
  };
  return (
    <Grid container align="center" justify="center" alignItems="center">
      <Grid item xs={create ? 12 : 8}><TopNavigation
        list={[{name: 'Service Group', link: '/ServiceGroups'}, {
          name: (create ? 'create' : serviceGroup._id),
          link: '/ServiceGroups/create'
        }]}/></Grid>
      {!create && <Grid item xs={4} align="right"><Button variant="outlined" color="secondary"
                                                          onClick={deleteAction}
                                                          startIcon={<DeleteIcon/>}>Delete</Button></Grid>}
      <Grid item xs={12} style={{marginTop: 30}}>
        <Paper>
          <Box className={classes.root}>
            <AppBar position="static" color="inherit">
              <Tabs value={value} onChange={handleChange}
                    indicatorColor="primary">
                <Tab
                  value="general"
                  label="General"
                  {...a11yProps('general')}
                />
                <Tab value="commands" label="Commands" {...a11yProps('commands')} />
                <Tab value="attributes" label="Attributes" {...a11yProps('attributes')} />
                <Tab value="staticAttributes"
                     label="Static Attributes" {...a11yProps('staticAttributes')} />
                <Tab value="lazyAttributes" label="Lazy Attributes" {...a11yProps('lazyAttributes')} />
              </Tabs>
            </AppBar>
            <TabPanel value={value} index="general">
              <Grid container spacing={3}>
                <Grid item xs={12}>
                  <TextField
                    name="resource"
                    required
                    style={{width: '100%'}}
                    value={serviceGroup.resource}
                    label="Reource"
                    onChange={onChange}
                    disabled={!create}
                    helperText="Representing the southbound resource that will be used to assign a type to a device (e.g.: pathname in the southbound port)."
                  />
                </Grid>
                <Grid item xs={12}>
                  <TextField
                    name="service"
                    style={{width: '100%'}}
                    onChange={onChange}
                    value={serviceGroup.service}
                    label="Fiware Service"
                    helperText="Is defined so that entities for a given service can be held in a separate mongoDB database. Default is none."
                  />
                </Grid>
                <Grid item xs={12}>
                  <TextField
                    name="subservice"
                    onChange={onChange}
                    value={serviceGroup.subservice}
                    style={{width: '100%'}}
                    label="Fiware Service Path"
                    helperText='Can be used to differentiate between arrays of devices. Default is "/".'
                  />
                </Grid>
                <Grid item xs={12}>
                  <TextField
                    name="entity_type"
                    onChange={onChange}
                    value={serviceGroup.entity_type}
                    style={{width: '100%'}}
                    label="Entity Type"
                    helperText='Name of the Entity type to assign to the group.'
                  />
                </Grid>
                <Grid item xs={12}>
                  <TextField
                    required
                    disabled={!create}
                    name="apikey"
                    style={{width: '100%'}}
                    label="API Key"
                    value={serviceGroup.apikey}
                    onChange={onChange}
                    helperText="The API key used to authenticate the request from the iot devices."
                    InputProps={{
                      endAdornment: <IconButton
                        disabled={!create}
                        aria-label="toggle password visibility"
                        onClick={generateAPIKey}
                      >
                        <RefreshIcon/>
                      </IconButton>
                    }}
                  />
                </Grid>

              </Grid>
            </TabPanel>
            <TabPanel value={value} index="commands">
              <VariableTabInsersts configs={{
                addButtonText: "Add new Command", key: "commands", entries: [{
                  label: "Name",
                  name: "name",
                  helperText: "A common command attribute of the devices. For each attribute, its name must be provided.",
                  required: true
                },
                  {
                    label: "Type",
                    name: "type",
                    helperText: "A common command attribute of the devices. For each attribute, its type must be provided.",
                    required: true
                  }]
              }} setValue={setServiceGroup} value={serviceGroup}/>
            </TabPanel>
            <TabPanel value={value} index="attributes">
              <VariableTabInsersts configs={{
                addButtonText: "Add new Attribute", key: "attributes", entries: [{
                  label: "Object ID",
                  name: "object_id",
                  helperText: "Name of the attribute as coming from the device.",
                  required: false
                },
                  {
                    label: "Name",
                    name: "name",
                    helperText: "ID of the attribute in the target entity in the Context Broker.",
                    required: true
                  },
                  {
                    label: "Type",
                    name: "type",
                    helperText: "Name of the type of the attribute in the target entity.",
                    required: true
                  }]
              }} setValue={setServiceGroup} value={serviceGroup}/>
            </TabPanel>
            <TabPanel value={value} index="staticAttributes">
              <VariableTabInsersts configs={{
                addButtonText: "Add new Static Attribute", key: "static_attributes", entries: [{
                  label: "Value",
                  name: "value",
                  helperText: "Value of the static attributes which will be appended to every updateContext requests to the CB.",
                  required: true
                },
                  {
                    label: "Name",
                    name: "name",
                    helperText: "Name of the static attributes which will be appended to every updateContext requests to the CB.",
                    required: true
                  },
                  {
                    label: "Type",
                    name: "type",
                    helperText: "Type of the static attributes which will be appended to every updateContext requests to the CB.",
                    required: true
                  }]
              }} setValue={setServiceGroup} value={serviceGroup}/>
            </TabPanel>
            <TabPanel value={value} index="lazyAttributes">
              <VariableTabInsersts configs={{
                addButtonText: "Add new Lazy Attribute", key: "lazy", entries: [
                  {
                    label: "Name",
                    name: "name",
                    helperText: "A common command attribute of the devices. For each attribute, its name must be provided.",
                    required: true
                  },
                  {
                    label: "Type",
                    name: "type",
                    helperText: "A common command attribute of the devices. For each attribute, its type must be provided.",
                    required: true
                  }]
              }} setValue={setServiceGroup} value={serviceGroup}/>
            </TabPanel>
          </Box>
          <Grid item xs={12} align="right" style={{marginTop: 8, marginRight: 4, marginBottom: 4}}>
            <Button onClick={() => mainButtonAction(serviceGroup)} color="primary"
                    style={{fontSize: '20px'}}>{create ? "Create Service Group" : "Update Service Group"}</Button>
          </Grid>
        </Paper>
      </Grid>

    </Grid>
  )
}

export default ServiceGroupView;