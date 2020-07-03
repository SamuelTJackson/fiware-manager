import React, {Fragment} from "react";
import Grid from "@material-ui/core/Grid";
import Button from "@material-ui/core/Button";
import AddIcon from "@material-ui/icons/Add";
import TextField from "@material-ui/core/TextField";
import IconButton from "@material-ui/core/IconButton";
import DeleteIcon from "@material-ui/icons/Delete";


const VariableTabInsersts = ({setValue, value, configs}) => {

  const onChange = (e, index) => {
    const target = e.target
    const array = value[configs.key] || []
    array[index] = {...array[index], [target.name]: target.value}
    setValue((prevState) => ({...prevState, [configs.key]: array}))

  }

  const addNewEntry = () => {
    let newEntry = {}
    configs.entries.map((entry) => (
      newEntry[entry.name] = ""
    ))
    setValue((prevState) => ({...prevState, [configs.key]: (prevState[configs.key]? [...prevState[configs.key],newEntry] : [newEntry])}))
  }

  const deleteEntry = (index) => {
    let array = value[configs.key]
    array.splice(index, 1)
    setValue((prevState) => ({...prevState, [configs.key]: array}))
  }

  return (
    <Grid container spacing={3}>
      <Grid item xs={12} align="right">
        <Button variant="outlined" color="primary" onClick={addNewEntry}
                startIcon={<AddIcon/>}>{configs.addButtonText}</Button>
      </Grid>
      {(value[configs.key] ? [...Array(value[configs.key].length).keys()] : []).map((index) => (
        <Fragment key={index}>
          {configs.entries.map((entry,innerIndex) => (
            <Grid item xs={(12 / configs.entries.length)} key={innerIndex}>
              <TextField
                name={entry.name}
                key={index}
                value={value[configs.key][index][entry.name]}
                required={entry.required}
                style={{width: '100%'}}
                label={entry.label}
                onChange={(e) => onChange(e, index)}
                helperText={entry.helperText}
                InputProps={(innerIndex === configs.entries.length -1) ? {
                  endAdornment: <IconButton size="small"
                                            onClick={() => deleteEntry(index)}
                  >
                    <DeleteIcon/>
                  </IconButton>
                }:{}}
              />
            </Grid>
          ))}
        </Fragment>
      ))}
    </Grid>
  )
}
export default VariableTabInsersts;