import React, { Component } from 'react';
import SingleVideoPlayer from './SingleVideoPlayer';
import UserVideoList from './UserVideoList';

class VideoManager extends Component {
    render() {
        return (
            <div>
                <div className="center">VideoMnager</div>
                <SingleVideoPlayer/>
                <UserVideoList/>
            </div>
        );
    }
}

export default VideoManager;