import React, { Component } from 'react';
import SingleVideoPlayer from './SingleVideoPlayer';
import UserVideoList from './UserVideoList';
import VideoList from './VideoList';
import VideoList2 from './VideoList2';

class VideoManager extends Component {
    render() {
        return (
            <div>
                <div className="center">VideoMnager</div>
                {/* <SingleVideoPlayer/> */}
                <VideoList/>
            </div>
        );
    }
}

export default VideoManager;