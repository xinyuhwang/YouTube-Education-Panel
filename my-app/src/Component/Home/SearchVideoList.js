import React, { Component } from 'react';
import {connect} from "react-redux"
import TagWindow from '../Tag/TagWindow';
import VidoePalyer from './VidoePalyer';

class SearchVideoList extends Component {
    
    render() {
        const {searchVideoList}=this.props
        const videoListView = searchVideoList.length ?(
            searchVideoList.map( video=>{
                return(
                    <div className="post"  key={video.id}>
                        {/* <iframe src={video.url}></iframe> */}
                        <VidoePalyer key={video.id} 
                            url ={video.id} 
                            height= '195'
                            width='320'
                        />
                        <div className="video-information">
                            <ul>Title : {video.title} </ul>
                            <TagWindow 
                                key={video.id} 
                                name="Add Tags"
                                vidoId={video.id} 
                            />
                        </div>
                    </div>
                )
            })

        ):(
            <div className="center">Loading video</div>
        )

        return (
            <div>
                {/* <h4>Search Result</h4> */}
                {videoListView}
            </div>
        );
    }
}

const mapStateToProps=(state)=>{
    return{
        videoList:state.videoList
    }
}

export default connect(mapStateToProps)(SearchVideoList);

