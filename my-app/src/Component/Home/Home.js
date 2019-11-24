import React, { Component } from 'react';
import TagWindow from '../Tag/TagWindow';
import SearchVideo from './SearchVideo';
import TagShow from '../Tag/TagShow';
import TagEdit from '../Tag/TagEdit';

class Home extends Component {
    render() {

        return (
            <div className="container">
                <div className="center">Home</div>
                <SearchVideo/>
                {/* <TagWindow/> */}
            </div>
        );
    }
}

export default Home;