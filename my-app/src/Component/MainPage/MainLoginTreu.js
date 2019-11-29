import React, { Component } from 'react';
import {Route, Switch} from "react-router-dom"
import Home from '../Home/Home';
import Account from "../Account/Account"
import PageVideoManager from '../VideoManager/PageVideoManager';
import VideoManager from '../VideoManager/VideoManager';

class MainLoginTreu extends Component {
    render() {
        return (
                <Switch>
                    <Route exact path="/" component = {Home}/>
                    <Route path="/VideoManager" component={VideoManager}/>
                    <Route path="/Account" component={Account}/>  
                </Switch>
        );
    }
}

export default MainLoginTreu;

// class MainLoginTreu extends Component {
//     render() {
//         return (
//             <BrowserRouter>
//                 <Switch>
//                     <Route exact path="/" component = {Home}/>
//                     <Route path="/VideoManager" component={VideoManager}/>
//                     <Route path="/Account" component={Account}/>  
//                 </Switch>
//             </BrowserRouter>
//         );
//     }
// }

// export default MainLoginTreu;