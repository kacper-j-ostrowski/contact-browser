import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import ContactBrowser from './ContactBrowser';
import registerServiceWorker from './registerServiceWorker';
import 'typeface-roboto';

ReactDOM.render(<ContactBrowser />, document.getElementById('root'));
registerServiceWorker();