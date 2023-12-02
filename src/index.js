import React from "react";
import  ReactDOM from "react-dom";

var h=React.createElement("h1",{},"hello world by react")
var res=document.getElementById("root")
var result=ReactDOM.createRoot(res)
result.render(h)