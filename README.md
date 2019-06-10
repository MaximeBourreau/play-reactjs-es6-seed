# play-reactjs-es6-seed
This is a seed application with [Play Framework 2](https://playframework.com/), [React.js](https://facebook.github.io/react/) and ES6 (ECMAScript 6, a.k.a. ES2015), using [webpack](https://webpack.js.org/) and [Babel](https://babeljs.io/)

Prerequisite :

* Node.js and npm (or yarn)
* sbt

Usage :

* Install npm dependencies with ```npm install```
* When running ```sbt test```, ```sbt dist``` and ```sbt stage```, webpack is also launched
* During development, it is required to launch simultaneously ```./node_modules/.bin/webpack --watch --mode=development``` and ```sbt run```
