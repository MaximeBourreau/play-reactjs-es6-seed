const path = require('path');

module.exports = {
  entry: './ui/main.js',
  output: {
    path: path.resolve(__dirname, 'public/javascripts'),
    filename: 'bundle.js',
  },
  module: {
    rules: [
      {
        test: /\.js$/,
        loader: 'babel-loader',
        query: {
          presets: ['@babel/preset-env', '@babel/preset-react']
        }
      }
    ]
  }
};
