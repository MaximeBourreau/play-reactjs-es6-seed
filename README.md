# play-reactjs-es6-seed
This is a seed application with [Play Framework 2](https://playframework.com/), [React.js](https://facebook.github.io/react/) and ES6 (ECMAScript 6, a.k.a. ES2015), using [Browserify](http://browserify.org/) and [Babel](https://babeljs.io/)

Prerequisite :

* Node.js and npm
* Typesafe Activator

Usage :

* Install npm dependencies with ```npm install```
* You may have to adjust the line ```val cmd = "...``` in build.sbt
  * On Windows it should be ```val cmd = ".\\node_modules\\.bin\\browserify.cmd -t [ babelify --presets [ es2015 react ] ] app\\assets\\javascripts\\main.jsx -o " + outputFile.getPath```
* Run with ```activator run```
