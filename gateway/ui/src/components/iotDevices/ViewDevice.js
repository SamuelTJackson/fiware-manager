import React, {Fragment, useEffect} from "react";
import {useHistory, useLocation} from "react-router-dom";
import {useDispatch, useSelector} from "react-redux";
import {getDevice, getDeviceByID, removeDeviceByID, updateDeviceByID} from "../../js/actions/devices";
import ErrorPage from "../common/ErrorPage";
import DeviceView from "./DeviceView";



function useQuery() {
  return new URLSearchParams(useLocation().search);
}
const ViewDevice = () => {
  const dispatch = useDispatch();
  const history = useHistory();

  let query = useQuery();
  const id = query.get("id")
  const service = query.get("service")
  const path = query.get("path")
  const device = useSelector(state => getDeviceByID(state, id));
  useEffect(()=> {
    dispatch(getDevice(id, service, path))
  }, [dispatch, id, service, path])

  const updateDevice = (device) => {
    dispatch(updateDeviceByID(device, service, path))
  }
  const deleteDevice = () => {
    dispatch(removeDeviceByID(id, service, path))
      .then(history.push({
        pathname: "/Devices", search: "?service=" + device.service + "&path=" + device.service_path
      }))

  }
  return (<Fragment>
    {device ? <DeviceView create={false} deleteAction={deleteDevice} mainButtonAction={updateDevice}
                          initialDevice={device}/> : <ErrorPage text={"OOP's something went wrong!"}/>}
  </Fragment>)
}
export default ViewDevice;