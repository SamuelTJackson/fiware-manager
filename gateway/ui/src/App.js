import React, {Fragment} from 'react';
import './App.css';
import {HashRouter, Link, Route, Switch} from "react-router-dom";
import CssBaseline from "@material-ui/core/CssBaseline";
import clsx from "clsx";
import AppBar from "@material-ui/core/AppBar";
import Toolbar from "@material-ui/core/Toolbar";
import IconButton from "@material-ui/core/IconButton";
import MenuIcon from "@material-ui/icons/Menu";
import Drawer from "@material-ui/core/Drawer";
import ChevronLeftIcon from "@material-ui/icons/ChevronLeft";
import ChevronRightIcon from "@material-ui/icons/ChevronRight";
import Divider from "@material-ui/core/Divider";
import List from "@material-ui/core/List";
import ListItem from "@material-ui/core/ListItem";
import ListItemIcon from "@material-ui/core/ListItemIcon";
import FiberSmartRecordIcon from '@material-ui/icons/FiberSmartRecord';
import ListItemText from "@material-ui/core/ListItemText";
import {makeStyles, useTheme} from "@material-ui/core/styles";
import Box from "@material-ui/core/Box";
import ServiceGroups from "./components/serviceGroups/ServiceGroups";
import CreateServiceGroup from "./components/serviceGroups/CreateServiceGroup";
import ViewServiceGroup from "./components/serviceGroups/ViewServiceGroup";
import Devices from "./components/iotDevices/Devices";
import CreateDevice from "./components/iotDevices/CreateDevice";
import ViewDevice from "./components/iotDevices/ViewDevice";
import RouterIcon from '@material-ui/icons/Router';
import SpeakerGroupIcon from '@material-ui/icons/SpeakerGroup';
import IotAgents from "./components/iotAgents/IotAgents";
import Notifier from "./components/common/Notifier";
import Login from "./components/Login";
import UserPage from "./components/user/UserPage";
import {useSelector} from "react-redux";
import LoginButton from "./components/user/LoginButton";
import Organizations from "./components/lora/Organizations";
import TextDivider from "./components/common/TextDivider";
import SettingsInputAntennaIcon from '@material-ui/icons/SettingsInputAntenna';
import Applications from "./components/lora/Applications";
import ChirpstackDevices from "./components/lora/Devices";
import AppsIcon from '@material-ui/icons/Apps';
import ChirpstackGateways from "./components/lora/Gateways";
import DomainIcon from '@material-ui/icons/Domain';
import Logo from "./iot-manager.png"
import Orion from "./components/orion/Orion";
import ViewEntity from "./components/orion/ViewEntity";
const drawerWidth = 240;

const useStyles = makeStyles((theme) => ({
  root: {
    display: 'flex',
  },
  appBar: {
    transition: theme.transitions.create(['margin', 'width'], {
      easing: theme.transitions.easing.sharp,
      duration: theme.transitions.duration.leavingScreen,
    }),
  },
  appBarShift: {
    width: `calc(100% - ${drawerWidth}px)`,
    marginLeft: drawerWidth,
    transition: theme.transitions.create(['margin', 'width'], {
      easing: theme.transitions.easing.easeOut,
      duration: theme.transitions.duration.enteringScreen,
    }),
  },
  menuButton: {
    marginRight: theme.spacing(2),
  },
  hide: {
    display: 'none',
  },
  drawer: {
    width: drawerWidth,
    flexShrink: 0,
  },
  drawerPaper: {
    width: drawerWidth,
  },
  drawerHeader: {
    display: 'flex',
    alignItems: 'center',
    padding: theme.spacing(0, 1),
    // necessary for content to be below app bar
    ...theme.mixins.toolbar,
    justifyContent: 'flex-end',
  },
  content: {
    flexGrow: 1,
    padding: theme.spacing(3),
    transition: theme.transitions.create('margin', {
      easing: theme.transitions.easing.sharp,
      duration: theme.transitions.duration.leavingScreen,
    }),
    marginLeft: -drawerWidth + 240,
    marginTop: 50
  },
  contentShift: {
    transition: theme.transitions.create('margin', {
      easing: theme.transitions.easing.easeOut,
      duration: theme.transitions.duration.enteringScreen,
    }),
    marginLeft: 240,
  },
  link: {
    textDecoration: "none",
    color: "#000"
  },

}));


function App() {
  const classes = useStyles();
  const loggedIn = useSelector(state => state.user.loggedIn);
  const theme = useTheme();
  const [open, setOpen] = React.useState(false);

  const handleDrawerOpen = () => {
    setOpen(true);
  };

  const handleDrawerClose = () => {
    setOpen(false);
  };
  return (
    <Fragment>
      <Notifier/>
      <CssBaseline/>
      <HashRouter>
        {!loggedIn ? <Login/> :
          <Fragment>
            <AppBar
              position="fixed"
              className={clsx(classes.appBar, {
                [classes.appBarShift]: open,
              })}
            >
              <Toolbar>
                <IconButton
                  color="inherit"
                  aria-label="open drawer"
                  onClick={handleDrawerOpen}
                  edge="start"
                  className={clsx(classes.menuButton, open && classes.hide)}
                >
                  <MenuIcon/>
                </IconButton>
                  <Box style={{flex: 1}}>
                    <img alt="logo" style={{height: "50px"}} src={Logo}/>
                  </Box>
                <Link className={classes.link} to="/User" >
                  <LoginButton/>
                </Link>
              </Toolbar>
            </AppBar>
            <Drawer
              className={classes.drawer}
              variant="persistent"
              anchor="left"
              open={open}
              classes={{
                paper: classes.drawerPaper,
              }}
            >
              <Box className={classes.drawerHeader}>
                <IconButton onClick={handleDrawerClose}>
                  {theme.direction === 'ltr' ? <ChevronLeftIcon/> : <ChevronRightIcon/>}
                </IconButton>
              </Box>
              <Divider/>
              <List> {/*onClick={() => setOpen(false)}>*/}
                <Link to="/IotAgents" className={classes.link}>
                  <ListItem button key="iot-agents">
                    <ListItemIcon><FiberSmartRecordIcon/></ListItemIcon>
                    <ListItemText primary="Iot Agents"/>
                  </ListItem>
                </Link>
                <Link to="/ServiceGroups" className={classes.link}>
                  <ListItem button key="service-groups">
                    <ListItemIcon><SpeakerGroupIcon/></ListItemIcon>
                    <ListItemText primary="Service Groups"/>
                  </ListItem>
                </Link>
                <Link to="/Devices" className={classes.link}>
                  <ListItem button key="devices">
                    <ListItemIcon><RouterIcon/></ListItemIcon>
                    <ListItemText primary="Devices"/>
                  </ListItem>
                </Link>
                <TextDivider text="Chirpstack"/>
                <Link to="/ChirpstackOrganizations" className={classes.link}>
                  <ListItem button key="chirganization">
                    <ListItemIcon><DomainIcon/></ListItemIcon>
                    <ListItemText primary="Organizations"/>
                  </ListItem>
                </Link>
                <Link to="/ChirpstackApplications" className={classes.link}>
                  <ListItem button key="chrapps">
                    <ListItemIcon><AppsIcon/></ListItemIcon>
                    <ListItemText primary="Applications"/>
                  </ListItem>
                </Link>
                <Link to="/ChirpstackGateways" className={classes.link}>
                  <ListItem button key="chrorg">
                    <ListItemIcon><SettingsInputAntennaIcon/></ListItemIcon>
                    <ListItemText primary="Gateways"/>
                  </ListItem>
                </Link>
                <TextDivider text="Orion"/>
                <Link to="/Orion" className={classes.link}>
                  <ListItem button key="orion">
                    <ListItemIcon><SettingsInputAntennaIcon/></ListItemIcon>
                    <ListItemText primary="Orion"/>
                  </ListItem>
                </Link>
              </List>
            </Drawer>
            <main className={clsx(classes.content, {
              [classes.contentShift]: open,
            })}>
              <Switch>
                <Fragment>
                  <Route exact path="/ServiceGroups">
                    <ServiceGroups/>
                  </Route>
                  <Route exact path="/ServiceGroups/create">
                    <CreateServiceGroup/>
                  </Route>
                  <Route path="/ServiceGroups/view">
                    <ViewServiceGroup/>
                  </Route>
                  <Route exact path="/Devices">
                    <Devices/>
                  </Route>
                  <Route path="/Devices/view*">
                    <ViewDevice/>
                  </Route>
                  <Route exact path="/Devices/create">
                    <CreateDevice/>
                  </Route>
                  <Route exact path="/IotAgents">
                    <IotAgents/>
                  </Route>
                  <Route exact path="/User">
                    <UserPage/>
                  </Route>
                  <Route exact path="/ChirpstackOrganizations">
                    <Organizations/>
                  </Route>
                  <Route exact path="/ChirpstackApplications">
                    <Applications/>
                  </Route>
                  <Route path="/ChirpstackDevices">
                    <ChirpstackDevices/>
                  </Route>
                  <Route exact path="/ChirpstackGateways">
                    <ChirpstackGateways/>
                  </Route>
                  <Route exact path="/orion">
                    <Orion/>
                  </Route>
                  <Route path="/Orion/view*">
                    <ViewEntity/>
                  </Route>
                </Fragment>
              </Switch>
            </main>
          </Fragment>
        }
      </HashRouter>
    </Fragment>
  );
}

export default App;
