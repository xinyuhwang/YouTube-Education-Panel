import React, { Component } from 'react';
import {BrowserRouter, Route, Switch} from "react-router-dom"

import Navbar from "./Navbar"
import Home from './Home/Home';
import VideoManager from './VideoManager/VideoManager';
import Account from './Account/Account';

class Main extends Component {
    render() {
        return (
            <BrowserRouter>
                <Navbar />
                <Switch>
                    <Route exact path="/" component = {Home}/>
                    <Route path="/VideoManager" component={VideoManager}/>
                    <Route path="/Account" component={Account}/>
                </Switch>
            </BrowserRouter>
        );
    }
}

export default Main;