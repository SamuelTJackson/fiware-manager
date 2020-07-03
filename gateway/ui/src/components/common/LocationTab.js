import React, {Fragment, useRef, useState} from "react";
import Grid from "@material-ui/core/Grid";
import Button from "@material-ui/core/Button";
import AddIcon from "@material-ui/icons/Add";
import Leaflet from 'leaflet';
import {Map, Marker, TileLayer} from "react-leaflet";
import DeleteIcon from '@material-ui/icons/Delete';
import "leaflet/dist/leaflet.css";
import TextField from "@material-ui/core/TextField";

Leaflet.Icon.Default.imagePath = '//cdnjs.cloudflare.com/ajax/libs/leaflet/1.0.0/images/';


const LocationTab = ({setValue, value}) => {
  let map = useRef();
  const [showLocation, setShowLocation] = useState(!!value.location)
  const [zoom, setZoom] = useState(2)
  const handleClick = (e) => {
    const latlng = e.latlng

    setValue((prevState) => (
      {...prevState, location: {name: "location", type: "GEOJSON", value: {type: "point" , value: [latlng.lat,latlng.lng]}}}
    ))
  }
  const onZoomEnd = (e) => {
    const target = e.target
    setZoom(target._zoom)
  }

  const setShowLocationClick = () => {
    if (showLocation) {
      setValue((prevState) => (
        {...prevState, location:undefined}
      ))
    } else {
      setValue((prevState) => (
        {...prevState, location: {name: "location", type: "GEOJSON", value: {type: "point" , value: [52.51627309503224,13.40263366699219]}}}
      ))
    }
    setShowLocation((prevState) => (!prevState))

  }

  const changeLat = (e) => {
    const target = e.target
    setValue((prevState) =>
      ({
        ...prevState, location: {name: "location", type: "GEOJSON", value: {type: "point", value: [parseFloat(target.value), prevState.location.value.value[1]]}}
      })
    )

  }
  const changeLng = (e) => {
    const target = e.target
    setValue((prevState) =>
      ({
        ...prevState, location: {name: "location", type: "GEOJSON", value: {type: "point", value: [prevState.location.value.value[0], parseFloat(target.value)]}}
      })
    )
  }

  return (
    <Grid container spacing={3}>
      <Grid item xs={12} align="right">
        <Button variant="outlined" color={showLocation ? "secondary" : "primary"}
                onClick={setShowLocationClick}
                startIcon={showLocation ? <DeleteIcon/> :
                  <AddIcon/>}>{showLocation ? "Remove Location" : "Add Location"}</Button>
      </Grid>
      {showLocation &&
      <Fragment>
        <Grid item xs={12}>
          <TextField
            name="lat"
            value={value.location.value.value[0]}
            onChange={changeLat}
            required
            type="number"
            style={{width: '100%'}}
            label="Latitude"
            helperText="In geography, latitude is a geographic coordinate that specifies the north–south position of a point on the Earth's surface."
          />
        </Grid>
        <Grid item xs={12}>
          <TextField
            onChange={changeLng}
            name="long"
            value={value.location.value.value[1]}
            required
            type="number"
            style={{width: '100%'}}
            label="Longitude"
            helperText="Longitude, is a geographic coordinate that specifies the east–west position of a point on the Earth's surface, or the surface of a celestial body."
          />
        </Grid>
        <Grid item xs={12}>
          <Map
            ref={map}
            zoomControl={true}
            style={{height: "480px", width: "100%"}}
            zoom={zoom}
            onZoomEnd={onZoomEnd}
            center={{lat: value.location.value.value[0], lng: value.location.value.value[1]}}
            onClick={handleClick}
          >
            <TileLayer url="http://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png"/>
            <Marker position={{lat: value.location.value.value[0], lng: value.location.value.value[1]}}/>
          </Map>
        </Grid>
      </Fragment>
      }
    </Grid>
  )
}

export default LocationTab;