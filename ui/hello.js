import React from 'react';

class Hello extends React.Component {
  render() {
    return <p>Hello {this.props.match.params.name} !</p>
  }
}

export default Hello;
