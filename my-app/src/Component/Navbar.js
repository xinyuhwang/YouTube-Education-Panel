import React, { Component } from 'react';
import {Link, NavLink} from "react-router-dom"

class Navbar extends Component {
    render() {
        return (
            <nav className="nav-warpper red darken-3">
                <div className="container">
                    <Link className="brand-logo" to="/">Youtube Education</Link>
                    <ul className="right">
                        <li><Link to="/">Home</Link></li>
                        <li><NavLink to="/VideoManager">VideoManager</NavLink></li>
                        <li><NavLink to="/Account">Account</NavLink></li>
                    </ul>
                </div>
            </nav>
        );
    }
}

export default Navbar;