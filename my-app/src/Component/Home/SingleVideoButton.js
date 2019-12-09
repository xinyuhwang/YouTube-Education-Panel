import React, { Component } from 'react';
import "../../style/SearchPage.css"
import { Icon ,Button } from 'antd';
import TagWindow from '../Tag/TagWindow';
import {connect} from "react-redux"
import {userTagsList} from "../aAction/actionEditTags"

class SingleVideoButton extends Component {
    state={
        likeIconColor:"#81a2fa4f",
        tagIconColor:false
    }

    handleClickOpenTag=()=>{
        //get this video's user tages
        //if unlike, set null, if liked, send request
        if(this.state.likeIconColor==="#81a2fa4f"){
            //un like video
            let currentVideoTags = []
            this.props.userTagsList(currentVideoTags)
            //console.log("store tags",this.props.userTags)
        }else{
            //send request to get tags list
            let vid=this.props.video.id
            let uid=this.props.userState.username
            let urlGetTags="/YouTube/tag/getTags?uid="+uid+"&vid="+vid
            //console.log("Get Tags url:",urlGetTags)
            try{
                fetch(urlGetTags)
                .then((response) => response.json())
                .then((tags)=>{
                    this.props.userTagsList(tags)
                })
            }catch (error) {
                console.log("Get Tags error")
            }
        }
        //show window
        this.props.setTagWindowDisplay(true)
        this.props.setCurrentVideo(this.props.video)

    }
    handleClickFavorite=(v)=>{
        //console.log(v)
        // /favorite?name=A&id=B&tittle=C&thumbnail=D&url=E
        let name=this.props.userState.username
        let id=v.id
        let url=v.url
        let title=v.title
        // let thumbnail=v.thumbnail
        if(this.state.likeIconColor!=="#f759ab"){
            //need to like video
            this.setState({
                likeIconColor:"#f759ab",
                tagIconColor:true
            })
            //close previous window 
            if(this.props.tagWindowDisplay){
                this.props.setTagWindowDisplay(false)
            }
            //send request
            //if request success, set color to hotpink            
            let urlFavorite="/YouTube/favorite/?name="+name+"&id="+id+"&title="+title+"&url="+url
                            //+"&thumbnail="+thumbnail
            try{
                fetch(urlFavorite)
                .then((response) => response.json())
                .then(()=>{
                    console.log("favorite video",name,id)
                })
            }catch (error) {
                console.log("favorite video error")
                this.setState({
                    likeIconColor:"81a2fa4f",
                    tagIconColor:false
                })
            }
        }else{
            //need to remove video from list
            //send request to server
            //set color back
            this.props.setTagWindowDisplay(false)
            this.setState({
                likeIconColor:"81a2fa4f",
                tagIconColor:false
            })
        }
    }


    render() {
        //console.log("PPPPPPPPPPP",this.props)
        return (
            <div className="SingleVideoOperation">
                <Button 
                    className="TagButton"
                    type="primary" shape="circle"
                    onClick={this.handleClickOpenTag} 
                    style={{
                        transform:this.state.tagIconColor ?"translateY(0)":"translateY(-100vh)",
                        opacity:this.state.tagIconColor? "1":0
                    }}
                    >Tag</Button>
                <Button 
                    className="SingleVideoLike"  
                    type="link" 
                    onClick={(e) => this.handleClickFavorite(this.props.video)}
                    >
                    <Icon 
                        type="heart" theme="twoTone" 
                        twoToneColor={this.state.likeIconColor}
                        size="large"
                        style={{ fontSize: '33px'}} 
                        />     
                </Button>
            </div>
        );
    }
}


const mapStateToProps=(state)=>{
    return{
        videoList:state.videoList,
        userState:state.userState,
        userTags: state.userTags
    }
}
function mapDispatchToProps(dispatch){
    return{
        userTagsList:(userTags)=>dispatch(userTagsList(userTags))
        }
}
export default connect(mapStateToProps,mapDispatchToProps)(SingleVideoButton);
