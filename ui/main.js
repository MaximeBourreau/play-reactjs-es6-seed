import React from 'react';
import ReactDOM from 'react-dom';
import { Route, Redirect, HashRouter as Router } from 'react-router-dom';
import Hello from './hello';

const app = (
  <Router>
    <Route path='/hello/:name' component={Hello}/>
    <Redirect from='/' to='/hello/world' />
  </Router>
);

ReactDOM.render(app, document.getElementById('app'));
