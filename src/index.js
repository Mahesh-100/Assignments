import React from "react";
import  ReactDOM from "react-dom";

//create a nested header element using React.createElement(h1,h2,h3,inside a div with class "title")
const header=React.createElement("div",{className:"title"},[
    React.createElement("h1",{},"this is heading h1"),
    React.createElement("h2",{},"this is heading h2"),
    React.createElement("h3",{},"this is heading h3")
]) 
ReactDOM.render(header,document.getElementById("root"))

//create the same element using jsx
const header1=(
    <div className="title">
        <h1>This is heading1 using jsx</h1>
        <h2>This is heading2 using jsx</h2>
        <h3>This is heading3 using jsx</h3>
    </div>
)
ReactDOM.render(header1,document.getElementById("root"))
// create a functional component of the same jsx
const Head=()=>{
    return (
        <div className="title">
        <h1>This is heading1 using functional component</h1>
        <h2>This is heading2 using functional component</h2>
        <h3>This is heading3 using functional component</h3>
    </div>
    )
}
ReactDOM.render(<Head/>,document.getElementById("root"))
//pass attributes into the tag in jsx
const attributes=(
    <div className="title">
        <h1 style={{color:"red"}}>This is heading1 using jsx</h1>
        <h2 style={{color:"blue"}}>This is heading2 using jsx</h2>
        <h3 style={{color:"green"}}>This is heading3 using jsx</h3>
    </div>
    )
    ReactDOM.render(attributes,document.getElementById("root"))
    //composition of component(add a component inside another)

    const Composition=()=>{
        return(
            <p>composition of component</p>,
            <Head/>
        )
    }
    ReactDOM.render(<Composition/>,document.getElementById("root"))
    const TitleComponent=()=>{
        return <h1>TitleComponent</h1>
    }
    const Sample=()=>{
        return (
        <div className="title" >
        <TitleComponent/>
        <TitleComponent></TitleComponent>
        </div>
        )
    }
    ReactDOM.render(<Sample/>,document.getElementById("root"))
/*
var h=React.createElement("h1",{},"hello world by react")
var res=document.getElementById("root")
var result=ReactDOM.createRoot(res)
result.render(h)
//nested element
var x=React.createElement("h1",{},"THIS IS HEADING")
var y=React.createElement("p",{},"nested element")
var z=document.getElementById("root1")
var r=ReactDOM.createRoot(z)
r.render(React.createElement("div",{},x,y));*/
