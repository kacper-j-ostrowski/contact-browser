import React, { Component } from 'react';
import AppBar from '@material-ui/core/AppBar'
import Toolbar from '@material-ui/core/Toolbar'
import Typography from '@material-ui/core/Typography'
import AppSearch from './AppSearch';

class HeaderMenu extends Component {

    constructor(props) {
      super(props);
    }
  
    render() {
      return(
            <div>
            <AppBar position="static">
                <Toolbar>
                    <Typography variant="title" color="inherit">
                        Arche - Wyszukiwarka
                    </Typography>
                </Toolbar>
                <AppSearch />
            </AppBar>
        </div>
      );
    }
  }
  
  
  export default HeaderMenu;