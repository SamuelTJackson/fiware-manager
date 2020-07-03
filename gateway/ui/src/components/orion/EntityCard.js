import React from "react";
import TreeView from "@material-ui/lab/TreeView";
import ExpandMoreIcon from '@material-ui/icons/ExpandMore';
import ChevronRightIcon from '@material-ui/icons/ChevronRight';
import CustomTreeItem from "./CustomTreeItem";


const EntityCard = ({field}) => {
  const makeid = (length) => {
    var result           = '';
    var characters       = 'ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789';
    var charactersLength = characters.length;
    for ( var i = 0; i < length; i++ ) {
      result += characters.charAt(Math.floor(Math.random() * charactersLength));
    }
    return result;
  }

  const dataToTree = (nodes, key, deep) => {
    if (nodes) {
      if (typeof nodes === 'string')  {
        return (
          <CustomTreeItem key={`${key}-${deep}-${makeid(10)}`}
                          nodeId={`${key}-${deep}-${makeid(10)}`}
                          name={key} value={nodes}/>
        )
      }
      if (typeof nodes === 'number') {
        return (
          <CustomTreeItem key={`${key}-${deep}-${makeid(10)}`}
                          nodeId={`${key}-${deep}-${makeid(10)}`} name={key} value={nodes}/>
        )
      }
      if (Array.isArray(nodes)) {
        return (<CustomTreeItem key={`${key}-${deep}-${makeid(10)}`}
                                nodeId={`${key}-${deep}-${makeid(10)}`}
                                name={key} value={JSON.stringify(nodes)}/>)
      }
      if (typeof nodes === 'object') {
        if (nodes.value && (typeof nodes.value === 'string' || typeof nodes.value == 'number')) {
          return (
            <CustomTreeItem key={`${key}-${deep}-${makeid(10)}`}
                            nodeId={`${key}-${deep}-${makeid(10)}`}
                            name={key} value={`(${nodes.value})`}>
              {Object.keys(nodes).map((k,i) => (
                dataToTree(nodes[k], k, deep * 10)
              ))}
            </CustomTreeItem>
          )
        } else {
        return (
          <CustomTreeItem key={`${key}-${deep}-${makeid(10)}`}
                          nodeId={`${key}-${deep}-${makeid(10)}`}
                          name={key}>
            {Object.keys(nodes).map((k,i) => (
            dataToTree(nodes[k], k, deep * 10)
          ))}
          </CustomTreeItem>
        )}
      }

    }
  }
  return(
        <TreeView
                  label={`${field.id}: ${field.type}`}
                  defaultCollapseIcon={<ExpandMoreIcon />}
                  defaultExpandIcon={<ChevronRightIcon />}>
          {Object.keys(field).map((key, index) => {
           return dataToTree(field[key], key, index * 100)})}
        </TreeView>
  )
}
export default EntityCard;