import React, {Fragment, useEffect} from "react";
import ServiceGroupView from "./ServiceGroupView";
import {useHistory, useLocation} from "react-router-dom";
import {useDispatch, useSelector} from "react-redux";
import ErrorPage from "../common/ErrorPage";
import {
  deleteServiceGroup,
  getServiceGroupByID, getServiceGroups,
  updateServiceGroup,
} from "../../js/actions/serviceGroups";


function useQuery() {
  return new URLSearchParams(useLocation().search);
}

const ViewServiceGroup = () => {
  const dispatch = useDispatch();
  const history = useHistory();

  let query = useQuery();
  const id = query.get("id")
  const service = query.get("service")
  const path = query.get("path")
  const serviceGroup = useSelector(state => getServiceGroupByID(state, id));
  useEffect(()=> {
    dispatch(getServiceGroups(service, path))
  }, [dispatch, service, path])
  const update = (group) => {
    dispatch(updateServiceGroup(group,service, path))
  }
  const deleteEntry = () => {
    dispatch(deleteServiceGroup(serviceGroup))
      .then(_ => history.push({
        pathname: "/ServiceGroups", search: "?service=" + serviceGroup.service + "&path=" + serviceGroup.subservice
      }))

  }
  return (<Fragment>
    {serviceGroup ? <ServiceGroupView create={false} deleteAction={deleteEntry} mainButtonAction={update}
                            initialServiceGroup={serviceGroup}/> : <ErrorPage text={"OOP's something went wrong!"}/>}
  </Fragment>)
}

export default ViewServiceGroup;