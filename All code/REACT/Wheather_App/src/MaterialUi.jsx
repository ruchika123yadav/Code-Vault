import * as React from 'react'
import Button from '@mui/material/Button';
import Slider from '@mui/material/Slider';
import ToggleButtonGroup from '@mui/material/ToggleButtonGroup';
import ToggleButton from '@mui/material/ToggleButton';



function MaterialUi() {
  
  return (
    <div>
        <h1>Material Ui Components!</h1>
        {/* ham variant ka use krte alg alg buttons ko dikhane ke liye */}
         <Button variant="contained" color="success">
        Success
      </Button>
      
      <Slider
        size="small"
        defaultValue={70}
        aria-label="Small"
        valueLabelDisplay="auto"
      />
          <ToggleButton value="web">Web</ToggleButton>
     </div>
  )
}

export default MaterialUi
