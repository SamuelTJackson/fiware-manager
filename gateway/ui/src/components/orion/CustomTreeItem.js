import React from "react";
import Typography from "@material-ui/core/Typography";
import TreeItem from "@material-ui/lab/TreeItem";
import makeStyles from "@material-ui/core/styles/makeStyles";
import Box from "@material-ui/core/Box";
import FingerprintIcon from '@material-ui/icons/Fingerprint';
import StyleIcon from '@material-ui/icons/Style';
import DoubleArrowIcon from '@material-ui/icons/DoubleArrow';
import MapIcon from '@material-ui/icons/Map';
import InfoIcon from '@material-ui/icons/Info';
const useTreeItemStyles = makeStyles((theme) => ({
  root: {
    color: theme.palette.text.secondary,
    '&$selected > $content $label': {
      backgroundColor: 'transparent',
      color: 'red',
    },
    '&:hover > $content': {
      backgroundColor: theme.palette.primary.light,
    },
    '&:focus > $content, &$selected > $content': {
      backgroundColor: `${theme.palette.primary.main}, ${theme.palette.primary.main})`,
      color: theme.palette.secondary.main,
    },
    '&:focus > $content $label, &:hover > $content $label, &$selected > $content $label': {
      backgroundColor: 'transparent',
    },
  },
  content: {
    color: theme.palette.text.secondary,
    borderTopRightRadius: theme.spacing(2),
    borderBottomRightRadius: theme.spacing(2),
    paddingRight: theme.spacing(1),
    fontWeight: theme.typography.fontWeightMedium,
    '$expanded > &': {
      fontWeight: theme.typography.fontWeightRegular,
    },
  },
  group: {
    marginLeft: 0,
    '& $content': {
      paddingLeft: theme.spacing(2),
    },
  },
  expanded: {},
  selected: {},
  name: {
    fontWeight: '800',
    color: theme.palette.textColor,
    textAlign: 'left'
  },
  value: {
    fontWeight: '400',
    color: theme.palette.textColor,
    textAlign: 'left',
    marginLeft: '10px'
  },
  labelRoot: {
    display: 'flex',
    alignItems: 'center',
    padding: theme.spacing(0.5, 0),
  },
  labelIcon: {
    marginRight: theme.spacing(1),
  },
  labelText: {
    fontWeight: 'inherit',
    flexGrow: 1,
  },
}));

const CustomTreeItem = (props) => {
  const classes = useTreeItemStyles();
  const {name, value, ...other} = props
  const getIcon = (v) => {
    if (v === "id") {
      return <FingerprintIcon color="inherit" className={classes.labelIcon}/>
    }
    if (v === "type") {
      return <StyleIcon color="inherit" className={classes.labelIcon}/>
    }
    if (v === "value") {
      return <DoubleArrowIcon color="inherit" className={classes.labelIcon}/>
    }
    if (v === "coordinates") {
      return <MapIcon color="inherit" className={classes.labelIcon}/>
    }
    if (v === "metadata") {
      return <InfoIcon color="inherit" className={classes.labelIcon}/>
    }
  }
  return (
    <TreeItem
    label={
      <Box className={classes.labelRoot}>
        {getIcon(name)}
        <Typography variant="body2" className={classes.name}>
          {name}{value && ":"}
        </Typography>
        {value && <Typography variant="caption" color="inherit" className={classes.value}>
          {value}
        </Typography>}
      </Box>
    }

    classes={{
      root: classes.root,
      content: classes.content,
      expanded: classes.expanded,
      selected: classes.selected,
      group: classes.group,
      label: classes.label,
    }}
    {...other}
  />)
}
export default CustomTreeItem;