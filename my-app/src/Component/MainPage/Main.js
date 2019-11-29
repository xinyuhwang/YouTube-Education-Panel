import React, { Component } from 'react';
import { connect } from 'react-redux';
import "../../style/MainPage.css"
import Navbar2 from '../PageDesign/Navbar2';
import MainLoginFalse from './MainLoginFalse';
import MainLoginTreu from './MainLoginTreu';
// import {BrowserRouter, Route, Switch} from "react-router-dom"
import {BrowserRouter} from "react-router-dom"
import NavbarLogInFalse from './NavbarLogInFalse';

class Main extends Component {
  

  render() {
    console.log(this.props.userState.loginState)
    let Navbar;
    let Body;
      if(this.props.userState.loginState===true){
        console.log("inside")
          Navbar = <Navbar2/>
          Body = <MainLoginTreu/>
      }else{ 
        console.log("inside")
        Navbar = <NavbarLogInFalse/>
        Body =<MainLoginFalse/>
        console.log(Navbar)
      }



    return (
      <BrowserRouter>
        <div className="wrapper">
          <header className="header">
            {Navbar}
          </header>
          <div className="body">
            <div className="aside-left"></div>
            <div className="main">
             {Body}
            </div>
            <div className="aside-right"></div>
          </div>
          <footer className="footer"></footer>
        </div>
      </BrowserRouter>
    );
  }
}

const mapStateToProps=(state)=>{
    return {
        userState:state.userState
    };
}
export default connect(
    mapStateToProps
)(Main);