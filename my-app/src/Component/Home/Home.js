import React, { Component } from 'react';
import SearchVideo from './SearchVideo';
// import TagWindow from '../Tag/TagWindow';
// import TagShow from '../Tag/TagShow';
// import TagEdit from '../Tag/TagEdit';

class Home extends Component {
    render() {

        return (
            <div className="container">
                <SearchVideo/>
                {/* <TagWindow/> */}
            </div>
        );
    }
}

export default Home;