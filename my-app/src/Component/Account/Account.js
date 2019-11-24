import React, { Component } from 'react';
import Login from './Login';

class Account extends Component {
    render() {
        return (
            <div>
                <div className="center">Account</div>
                <Login/>
            </div>
        );
    }
}

export default Account;