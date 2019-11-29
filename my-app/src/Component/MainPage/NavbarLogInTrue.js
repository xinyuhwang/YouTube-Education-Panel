import React, { Component } from 'react';
import {Link, NavLink} from "react-router-dom"
import "../../style/MainPage.css"



class NavbarLogInTrue extends Component {
    render() {
        return (
            <nav className="Navbar">
                <div className="ProjectName">
                <Link  to="/">Youtube Education</Link>
                </div>
                <div className="Menue">
                    <Link className="MenueItem" to="/">Home</Link>
                    <NavLink className="MenueItem" to="/VideoManager">VideoManager</NavLink>
                    <NavLink className="MenueItem" to="/Account">Account</NavLink>
                </div>
            </nav>
        );
    }
}

export default NavbarLogInTrue;