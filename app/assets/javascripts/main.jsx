import React from 'react';
import ReactDOM from 'react-dom';
import { Router, Route, Redirect } from 'react-router'
import Hello from './hello.jsx';

var routes =
  <Router>
    <Route path="/hello/:name" component={Hello}/>
    <Redirect from="/" to="/hello/world" />
  </Router>;

ReactDOM.render(routes, document.getElementById('app'));
