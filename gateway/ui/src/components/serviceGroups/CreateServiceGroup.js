import React from "react";
import ServiceGroupView from "./ServiceGroupView";
import {useDispatch} from "react-redux";
import {createServiceGroup} from "../../js/actions/serviceGroups";


const CreateServiceGroup = (props) => {
  const dispatch = useDispatch();

  const create = (serviceGroup) => {
    dispatch(createServiceGroup(serviceGroup))
      .then(
        created => {
          console.log("created")
        }
      )
    //history.push({pathname: "/ServiceGroups/view", search: '?id=' + data.data._id});

  }
  return (<ServiceGroupView create={true} mainButtonAction={create} initialServiceGroup={{
    apikey: "",
    entity_type: "",
    commands: [],
    attributes: [],
    static_attributes: [],
    lazy: [],
    service: "",
    subservice: "",
    resource: ""
  }}/> )
}

export default CreateServiceGroup;