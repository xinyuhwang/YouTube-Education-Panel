import React, { Component } from 'react';
import { connect } from 'react-redux';
import MainSignin from './MainSignin';
import {Route, Switch} from "react-router-dom"
import {userLogIn,userLogOut} from "../aAction/actionUserState"
import "../../style/Main.css"
import MainSignUp from './MainSignUp';

// class MainLoginFalse extends Component {
//     render() {
//         return (
//                 <div className="login">
//                     <MainSignin userLogIn={this.props.userLogIn}/>
//                 </div>
//         );
//     }
// }
class MainLoginFalse extends Component {
    render() {
        const SignIn = ()=><MainSignin userLogIn={this.props.userLogIn}/>
        console.log(this.BrowserRouter)
        return (
                <Switch>
                    <Route exact path="/" component = {SignIn}/>
                    <Route path="/SignIn" component = {SignIn}/>
                    <Route path="/SignUp" component={MainSignUp}/>
                </Switch>

        );
    }
}

function mapStateToProps(state) {
    return {
        userState:state.userState
    };
}

function mapDispatchToProps(dispatch){
    return{
        userLogIn:(userState)=>dispatch(userLogIn(userState)),
        userLogOut:(userState)=>dispatch(userLogOut(userState)),
        }
}
export default connect(
    mapStateToProps,mapDispatchToProps
)(MainLoginFalse);