import React from "react";
import DeviceView from "./DeviceView";
import {useDispatch} from "react-redux";
import {useHistory} from "react-router-dom";
import {useSnackbar} from "notistack";
import axios from "axios";
import {addDevice} from "../../js/actions/devices";

const CreateDevice = () => {
  const dispatch = useDispatch();
  const history = useHistory();
  const { enqueueSnackbar } = useSnackbar();
  const createDevice = (device) => {
    axios.post("/v1/Devices", device, {
      headers: {
        'fiware-service': device.service,
        'fiware-servicepath': device.service_path,
        'Content-Type': 'application/json',
      }
    }).then((data) => {
      dispatch(addDevice(device))
      enqueueSnackbar("Device created!", {variant:  'success' });
      history.push({pathname: "/Devices/view", search: '?id=' + device.device_id});

    })
      .catch((error) => {
        enqueueSnackbar(error.response.data, {variant:  'error' });
      })
  }
  return (<DeviceView create={true} mainButtonAction={createDevice} initialDevice={{
    apikey: "",
    entity_type: "",
    commands: [],
    attributes: [],
    static_attributes: [],
    lazy: [],
    service: "",
    service_path: "",
    protocol: "",
    endpoint: "",
    timestamp: "",
    timezone: "",
    entity_name: "",
    device_id: ""
  }}/> )
}

export default CreateDevice;