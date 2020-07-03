import React, {useState} from "react";
import Box from "@material-ui/core/Box";
import PropTypes from "prop-types";
import {makeStyles} from "@material-ui/core/styles";
import Grid from "@material-ui/core/Grid";
import TopNavigation from "../common/TopNavigation";
import Button from "@material-ui/core/Button";
import DeleteIcon from "@material-ui/icons/Delete";
import Paper from "@material-ui/core/Paper";
import AppBar from "@material-ui/core/AppBar";
import Tabs from "@material-ui/core/Tabs";
import Tab from "@material-ui/core/Tab";
import TextField from "@material-ui/core/TextField";
import IconButton from "@material-ui/core/IconButton";
import RefreshIcon from "@material-ui/icons/Refresh";
import VariableTabInsersts from "../common/VariableTabInserts";
import LocationTab from "../common/LocationTab";

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

const DeviceView = ({initialDevice, create, mainButtonAction, deleteAction}) => {
  const classes = useStyles();
  const [value, setValue] = React.useState('general');
  const [device, setDevice] = useState(initialDevice)
  const generateAPIKey = () => {
    let charSet = 'ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789';
    let randomString = '';
    for (let i = 0; i < 30; i++) {
      let randomPoz = Math.floor(Math.random() * charSet.length);
      randomString += charSet.substring(randomPoz, randomPoz + 1);
    }
    setDevice((prevState) => ({...prevState, apikey: randomString}));
  }
  const onChange = (e) => {
    const target = e.target
    setDevice((prevState) => ({...prevState, [target.name]: target.value}))
  }


  const handleChange = (event, newValue) => {
    setValue(newValue);
  };
  return (
    <Grid container align="center" justify="center" alignItems="center">
      <Grid item xs={create ? 12 : 8}><TopNavigation
        list={[{name: 'Devices', link: '/Devices'}, {
          name: (create ? 'create' : device.device_id),
          link: (create ? '/Devices/create' : '/Devices/view?id=' + initialDevice.device_id)
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
                <Tab value="location" label="Location" {...a11yProps('location')} />
              </Tabs>
            </AppBar>
            <TabPanel value={value} index="general">
              <Grid container spacing={3}>
                <Grid item xs={12}>
                  <TextField
                    name="device_id"
                    required
                    style={{width: '100%'}}
                    value={device.device_id}
                    label="Device ID"
                    onChange={onChange}
                    helperText="Device ID that will be used to identify the device."
                  />
                </Grid>
                <Grid item xs={12}>
                  <TextField
                    name="entity_name"
                    required
                    style={{width: '100%'}}
                    value={device.entity_name}
                    label="Entity Name"
                    onChange={onChange}
                    disabled={!create}
                    helperText="Name of the entity representing the device in the Context Broker."
                  />
                </Grid>
                <Grid item xs={12}>
                  <TextField
                    name="entity_type"
                    style={{width: '100%'}}
                    onChange={onChange}
                    value={device.entity_type}
                    label="Entity Type"
                    helperText="Type of the entity in the Context Broker."
                  />
                </Grid>
                <Grid item xs={12}>
                  <TextField
                    name="service"
                    onChange={onChange}
                    value={device.service}
                    style={{width: '100%'}}
                    label="Fiware Service"
                    helperText="Name of the service the device belongs to (will be used in the fiware-service header)."
                  />
                </Grid>
                <Grid item xs={12}>
                  <TextField
                    name="service_path"
                    onChange={onChange}
                    value={device.service_path}
                    style={{width: '100%'}}
                    label="Fiware Service Path"
                    helperText="Name of the subservice the device belongs to (used in the fiware-servicepath header)."
                  />
                </Grid>
                <Grid item xs={12}>
                  <TextField
                    name="timezone"
                    onChange={onChange}
                    value={device.timezone}
                    style={{width: '100%'}}
                    label="Timezone"
                    helperText='Time zone of the sensor if it has any.'
                  />
                </Grid>
                <Grid item xs={12}>
                  <TextField
                    name="timestamp"
                    onChange={onChange}
                    value={device.timestamp}
                    style={{width: '100%'}}
                    label="Timestamp"
                    helperText="Optional flag about whether or not to addthe TimeInstant attribute to the device
                    entity created, as well as a TimeInstant metadata to each attribute, with the current timestamp."
                  />
                </Grid>
                <Grid item xs={12}>
                  <TextField
                    name="endpoint"
                    onChange={onChange}
                    value={device.endpoint}
                    style={{width: '100%'}}
                    label="Enpoint"
                    helperText="Endpoint where the device is going to receive commands, if any."
                  />
                </Grid>
                <Grid item xs={12}>
                  <TextField
                    name="protocol"
                    onChange={onChange}
                    value={device.protocol}
                    style={{width: '100%'}}
                    label="Protocol"
                    helperText="Name of the device protocol, for its use with an IoT Manager."
                  />
                </Grid>
                <Grid item xs={12}>
                  <TextField
                    name="transport"
                    onChange={onChange}
                    value={device.transport}
                    style={{width: '100%'}}
                    label="Transport"
                    helperText="Name of the device transport protocol, for the IoT Agents with multiple transport protocols."
                  />
                </Grid>
                <Grid item xs={12}>
                  <TextField
                    disabled={!create}
                    name="apikey"
                    style={{width: '100%'}}
                    label="API Key"
                    value={device.apikey}
                    onChange={onChange}
                    helperText="Optional Apikey key string to use instead of group apikey."
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
              }} setValue={setDevice} value={device}/>
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
              }} setValue={setDevice} value={device}/>
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
              }} setValue={setDevice} value={device}/>
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
              }} setValue={setDevice} value={device}/>
            </TabPanel>
            <TabPanel value={value} index="location">
              <LocationTab setValue={setDevice} value={device}/>
            </TabPanel>
          </Box>
          <Grid item xs={12} align="right" style={{marginTop: 8, marginRight: 4, marginBottom: 4}}>
            <Button onClick={() => mainButtonAction(device)} color="primary"
                    style={{fontSize: '20px'}}>{create ? "Create Device" : "Update Device"}</Button>
          </Grid>
        </Paper>
      </Grid>

    </Grid>
  )
}

export default DeviceView;