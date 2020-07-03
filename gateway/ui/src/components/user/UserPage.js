import React, { useState} from "react";
import Grid from "@material-ui/core/Grid";
import {useDispatch, useSelector} from "react-redux";
import Paper from "@material-ui/core/Paper";
import {makeStyles} from "@material-ui/core/styles";
import ChirpstackKeyField from "./ChirpstackKeyField";
import Box from "@material-ui/core/Box";
import PropTypes from "prop-types";
import TopNavigation from "../common/TopNavigation";
import Button from "@material-ui/core/Button";
import AppBar from "@material-ui/core/AppBar";
import Tabs from "@material-ui/core/Tabs";
import Tab from "@material-ui/core/Tab";
import TextField from "@material-ui/core/TextField";
import ExitToAppIcon from '@material-ui/icons/ExitToApp';
import {logout} from "../../js/actions/user";
import {updateChirpstackKey} from "../../js/actions/user";
import Typography from "@material-ui/core/Typography";

const useStyles = makeStyles((theme) => ({
  margin: {
    padding: '20px',
  },
  gravatar: {
    height: '100%',
    width: 'auto'
  },
  paper: {
    position: 'absolute',
    top: '50%',
    left: '50%',
    transform: 'translate(-50%, -50%)',
    width: '50%'
  },
  root: {
    flexGrow: 1,
    backgroundColor: theme.palette.background.paper,
  },
  font: {
    color: theme.palette.primary.main
  }
}));
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
const UserPage = () => {
  const dispatch = useDispatch();
  const classes = useStyles();
  const user = useSelector(state => state.user.user);
  const [value, setValue] = useState('general');
  const updateLoraKey = () => {
    dispatch(updateChirpstackKey(newLoraKey))
  }
  const [newLoraKey, setNewLoraKey] = useState(user.lora_key)
  const handleChange = (event, newValue) => {
    setValue(newValue);
  };


  return (
    <Grid container align="center" justify="center" alignItems="center">
      <Grid item xs={8}><TopNavigation
        list={[{name: 'User', link: '/User'}, {
          name: user.username,
          link: '/User'
        }]}/></Grid>
      <Grid item xs={4} align="right">
        <Button variant="outlined" color="secondary" onClick={()=> dispatch(logout())} startIcon={<ExitToAppIcon/>}>
          Logout
        </Button>
      </Grid>
      <Grid item xs={12} style={{marginTop: 30}}>
        <Paper>
          <Box className={classes.root}>
            <AppBar position="static" color="inherit">
              <Tabs value={value} onChange={handleChange}
                    indicatorColor="primary">
                <Tab
                  value="general"
                  label="General"
                  wrapped
                  {...a11yProps('general')}
                />
                <Tab value="chirpstack" label="Chirpstack" {...a11yProps('chirpstack')} />
              </Tabs>
            </AppBar>
            <TabPanel value={value} index="general">
              <Grid container spacing={3}>
                <Grid item xs={12}>
                  <TextField
                    name="username"
                    style={{width: '100%'}}
                    value={user.username}
                    label="Username"
                    disabled
                    helperText="Your username from your keyrock account. If you want to change it, do it directly in Keyrock."
                  />
                </Grid>
                <Grid item xs={12}>
                  <TextField
                    name="ID"
                    style={{width: '100%'}}
                    value={user.id}
                    label="User ID"
                    disabled
                    helperText="Your unique user id of keyrock."
                  />
                </Grid>
                <Grid item xs={12}>
                  <TextField
                    name="email"
                    style={{width: '100%'}}
                    value={user.email}
                    label="Email"
                    disabled
                    helperText="Your email from your keyrock account."
                  />
                </Grid>
              </Grid>
            </TabPanel>
            <TabPanel value={value} index="chirpstack">
              <Grid container spacing={3}>
                <Grid item xs={12}>
                  <Typography variant="subtitle1" style={{textAlign: 'left'}} color='primary'>
                    {user.chirpstack_token ? 'You have already deposited an API Key.' : ''}
                  </Typography>
                </Grid>
                <Grid item xs={12}>
                  <ChirpstackKeyField value={newLoraKey} setValue={setNewLoraKey}/>
                </Grid>
              </Grid>
            </TabPanel>
          </Box>
          {value === 'chirpstack' && <Grid item xs={12} align="right" style={{marginTop: 8, marginRight: 4, marginBottom: 4}}>
            <Button onClick={updateLoraKey} color="primary"
                    style={{fontSize: '20px'}}>Update Lora Key</Button>
          </Grid>}
        </Paper>
      </Grid>

    </Grid>  )
}
export default UserPage;