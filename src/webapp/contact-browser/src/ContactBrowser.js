import React, { Component } from 'react';
import './App.css';
import HeaderMenu from './browser-window/HeaderMenu';
import CategoryPanel from './browser-window/CategoryPanel';
import CompanyList from './browser-window/CompanyList';
import SearchBar from './browser-window/SearchBar';
import AppFrame from './browser-window/AppFrame';
import PropTypes from 'prop-types';
import { withStyles } from '@material-ui/core/styles';
import Card from '@material-ui/core/Card';
import CardActions from '@material-ui/core/CardActions';
import CardContent from '@material-ui/core/CardContent';
import CardMedia from '@material-ui/core/CardMedia';
import Button from '@material-ui/core/Button';
import Typography from '@material-ui/core/Typography';


const styles = {
  card: {
    maxWidth: 345,
  },
  media: {
    height: 0,
    paddingTop: '56.25%', // 16:9
  },
};

class ContactBrowser extends Component {

  constructor(props) {
    super(props);
    this.changeState = this.changeState.bind(this);
  }

  state = {
    welcomeTxt: 'bla bla bla'
  }

  changeState(e) {
    e.preventDefault();
    this.setState( {
      welcomeTxt: 'dupa'
    });
  }

  render() {

    const classes = {
      card: '',
      media: ''
    };

    return(
      <div>
        <AppFrame/>
        <CategoryPanel/>
      </div>
    );
  }
}


export default withStyles(styles)(ContactBrowser);