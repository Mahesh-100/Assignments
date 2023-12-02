import React from "react";
import  ReactDOM from "react-dom";

var h=React.createElement("h1",{},"hello world by react")
var res=document.getElementById("root")
var result=ReactDOM.createRoot(res)
result.render(h)
//nested element
var x=React.createElement("h1",{},"THIS IS HEADING")
var y=React.createElement("p",{},"nested element")
var z=document.getElementById("root1")
var r=ReactDOM.createRoot(z)
r.render(React.createElement("div",{},x,y));