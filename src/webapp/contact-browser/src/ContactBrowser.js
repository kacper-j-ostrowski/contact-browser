import React, { Component } from 'react';
import './App.css';
import HeaderMenu from './browser-window/HeaderMenu';
import CategoryPanel from './browser-window/CategoryPanel';
import CompanyList from './browser-window/CompanyList';
import SearchBar from './browser-window/SearchBar';
import AppFrame from './browser-window/AppFrame';

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
    return(
      <AppFrame></AppFrame>
    );
  }
}


export default ContactBrowser;