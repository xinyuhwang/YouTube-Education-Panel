import React, { Component } from 'react';
import SignleVideoContainer from './SignleVideoContainer';
import TagPopWindow from '../Tag/TagPopWindow';
//get data and map to show each video pannel


const data = [
    {id: "PkZNo7MFNFg", url: "https://www.youtube.com/embed/PkZNo7MFNFg", title: "Learn JavaScript - Full Course for Beginners", thumbnail: "https://i.ytimg.com/vi/PkZNo7MFNFg/default.jpg"}
    ,{id: "W6NZfCO5SIk", url: "https://www.youtube.com/embed/W6NZfCO5SIk", title: "JavaScript Tutorial for Beginners: Learn JavaScript in 1 Hour [2019]", thumbnail: "https://i.ytimg.com/vi/W6NZfCO5SIk/default.jpg"}
    ,{id: "Ptbk2af68e8", url: "https://www.youtube.com/embed/Ptbk2af68e8", title: "O que o JavaScript é capaz de fazer? - Curso JavaScript #01", thumbnail: "https://i.ytimg.com/vi/Ptbk2af68e8/default.jpg"}
    ,{id: "Ukg_U3CnJWI", url: "https://www.youtube.com/embed/Ukg_U3CnJWI", title: "Learn JavaScript in 12 Minutes", thumbnail: "https://i.ytimg.com/vi/Ukg_U3CnJWI/default.jpg"}
    ,{id: "hdI2bqOjy3c", url: "https://www.youtube.com/embed/hdI2bqOjy3c", title: "JavaScript Crash Course For Beginners", thumbnail: "https://i.ytimg.com/vi/hdI2bqOjy3c/default.jpg"}
    ,{id: "upDLs1sn7g4", url: "https://www.youtube.com/embed/upDLs1sn7g4", title: "What is JavaScript?", thumbnail: "https://i.ytimg.com/vi/upDLs1sn7g4/default.jpg"}
    ,{id: "RqQ1d1qEWlE", url: "https://www.youtube.com/embed/RqQ1d1qEWlE", title: "Curso Javascript para Principiantes", thumbnail: "https://i.ytimg.com/vi/RqQ1d1qEWlE/default.jpg"}
    ,{id: "10WnvBk9sZc", url: "https://www.youtube.com/embed/10WnvBk9sZc", title: "JavaScript interview with a Google engineer", thumbnail: "https://i.ytimg.com/vi/10WnvBk9sZc/default.jpg"}
    ,{id: "ylakWC0VcEM", url: "https://www.youtube.com/embed/ylakWC0VcEM", title: "Как выучить JavaScript? Самый аху#### способ!", thumbnail: "https://i.ytimg.com/vi/ylakWC0VcEM/default.jpg"}
    ,{id: "nItSSTwBvSU", url: "https://www.youtube.com/embed/nItSSTwBvSU", title: "What is JavaScript?", thumbnail: "https://i.ytimg.com/vi/nItSSTwBvSU/default.jpg"}
    ,{id: "ylakWC0VcEM", url: "https://www.youtube.com/embed/ylakWC0VcEM", title: "Как выучить JavaScript? Самый аху#### способ!", thumbnail: "https://i.ytimg.com/vi/ylakWC0VcEM/default.jpg"}
    ,{id: "nItSSTwBvSU", url: "https://www.youtube.com/embed/nItSSTwBvSU", title: "What is JavaScript?", thumbnail: "https://i.ytimg.com/vi/nItSSTwBvSU/default.jpg"}
    ]

class SearcheVideoDisplay extends Component {
    state={
        tagWindowDisplay :false,
        currentVideo:""
    }
    setTagWindowDisplay=(display)=>{
        this.setState({
            tagWindowDisplay:display
        })
    }
    setCurrentVideo=(video)=>{
        this.setState({
            currentVideo:video
        })
    }
    render() {
        const searchVideoList=data
        const videoDisplay = searchVideoList.length ? (
            searchVideoList.map(video=>{
                return (
                    <SignleVideoContainer 
                        key={video.id+"SV"} video={video}
                        setTagWindowDisplay={this.setTagWindowDisplay}
                        tagWindowDisplay={this.state.tagWindowDisplay}
                        setCurrentVideo={this.setCurrentVideo}
                        />
                );
            })

        ):(
            <div></div>
        )
        return(
            <div  className="SearchVideoContainer">
                {videoDisplay}
                <TagPopWindow
                    tagWindowDisplay={this.state.tagWindowDisplay}
                    setTagWindowDisplay={this.setTagWindowDisplay}
                    currentVideo={this.state.currentVideo}
                />
            </div>
        )
    }
}

export default SearcheVideoDisplay;