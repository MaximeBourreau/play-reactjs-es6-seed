import React from 'react';

export default React.createClass({
  render: function() {
    return <p>Hello {this.props.params.name} !</p>
  }
});
