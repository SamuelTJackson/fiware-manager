import React, {Fragment, useEffect} from "react";
import { useLocation} from "react-router-dom";
import {useDispatch, useSelector} from "react-redux";
import {getEntity, getEntityByID} from "../../js/actions/orion";
import EntityView from "./EntitiyView";
import ErrorPage from "../common/ErrorPage";

function useQuery() {
  return new URLSearchParams(useLocation().search);
}
const ViewEntity = (props) => {
  const dispatch = useDispatch();

  let query = useQuery();
  const id = query.get("id")
  const service = query.get("service")
  const path = query.get("path")
  const entity = useSelector(state => getEntity(state, id));
  useEffect(()=> {
    dispatch(getEntityByID(service, path, id))
  }, [dispatch, service, path, id])
  return (
    <Fragment>
      {entity ? <EntityView service={service} path={path} entity={entity}/> : <ErrorPage text={"OOP's something went wrong!"}/>}
    </Fragment>
  )
}

export default ViewEntity;