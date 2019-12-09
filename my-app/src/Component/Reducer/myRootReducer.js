// const initeUserTagsState =[
//     {tagId:"1",tagName:"tag1"},
//     {tagId:"2",tagName:"tag2"},
//     {tagId:"3",tagName:"getdata"},
//     {tagId:"4",tagName:"casssss"},
// ]
const initeUserTagsState=["tag1","tag2","tag3","tag4"]
const initSearchVideoListState =[
//     {
//     videoID: null,
//     Tittle: null,
//     URL: null,
// }
]
const testtUserVideoList=[
    {
    videoID: "hEsofW-h6zA",
    title: "BEST DANCES OF 2018",
    URL: "https://www.youtube.com/embed/hEsofW-h6zA",
    thumbnail: "https://i.ytimg.com/vi/hEsofW-h6zA/default.jpg",
    tagsId:"1",
    videoTags:["tag1","tag2"]
    },
    {
        videoID: "SrVV73gTBpk",
        title: "TONES AND I - DANCE MONKEY / Lia Kim Choreography",
        URL: "https://www.youtube.com/embed/SrVV73gTBpk",
        thumbnail: "https://i.ytimg.com/vi/SrVV73gTBpk/default.jpg",
        tagsId:"2",
        videoTags:["tag1","tag2"]
     },
     {
        videoID: "SrVV73gTBpk",
        title: "TMovie test",
        URL: "https://www.youtube.com/embed/SrVV73gTBpk",
        thumbnail: "https://i.ytimg.com/vi/SrVV73gTBpk/default.jpg",
        tagsId:"3",
        videoTags:["tag1","tag2","getdata"]
     },
    {
        videoID: "SrVV73gTBpk",
        title: "Test Video dance",
        URL: "https://www.youtube.com/embed/SrVV73gTBpk",
        thumbnail: "https://i.ytimg.com/vi/SrVV73gTBpk/default.jpg",
        videoTags:["getdata","casssss"]
     },
]

const testtUserVideoList2=[
    {id: "v7", url: "https://www.youtube.com/embed/v467", title: "v4 6NEW7", thumbnail: "https://i.ytimg.com/vi/v7/default.jpg"},
    {id: "v2", url: "https://www.youtube.com/embed/v2", title: "v2", thumbnail: "https://i.ytimg.com/vi/v2/default.jpg"},
    {id: "v6", url: "https://www.youtube.com/embed/v46", title: "v6NEW B", thumbnail: "https://i.ytimg.com/vi/v6/default.jpg"},
    {id: "v3", url: "https://www.youtube.com/embed/v3", title: "v3", thumbnail: "https://i.ytimg.com/vi/v3/default.jpg"}
]

const initUSerState=
   {    loginState: false,
        username: null
        // Password: null,
        // Email: null,
    }

const initUserVideoTag=[
    {id: "", url: "", title: "", thumbnail: "", tags:[]}
]

const initState = {
    userState:initUSerState,
    searchVideoList:initSearchVideoListState,
    userTags: initeUserTagsState,
    userVideoList:null,
    //userVideoListTEST:testtUserVideoList2,
    UserVideoTag:null,
    displayVideo:{video:"",notes:""},
    currentVideo:""

}
const myRootReducer = (state=initState,action) => {
    console.log("Current Action:",action);
    if(action.type==="ADD_DATA"){
        console.log("Global root state",state)
    }
    if(action.type ==="GET_VIDEOLIST"){
        return{
            ...state,
            searchVideoList:action.searchVideoList
            //videoList: state.videoList.concat(action.videoList)
            //videoList:[...state.videoList,action.videoList]
        }
    }
    if(action.type ==="GET_USERVIDEOLIST"){
        return{
            ...state,
            userVideoList:action.userVideoList
        }
    }
    if(action.type ==="GET_USERVIDEOAll"){
        return{
            ...state,
            UserVideoTag:action.UserVideoTag
        }
    }
    if(action.type ==="SET_DISPLAYVIDEO"){
        return{
            ...state,
            displayVideo:action.displayVideo
        }
    }
    if(action.type ==="SET_CURRENTVIDEO"){
        return{
            ...state,
            setCurrentVideo:action.setCurrentVideo
            //videoList: state.videoList.concat(action.videoList)
            //videoList:[...state.videoList,action.videoList]
        }
    }
    if(action.type ==="EDIT_TAGS"){
        console.log("user tags list",state.userTags)
        return{
            ...state,
            userTags:action.userTags
        }
    }
    if(action.type ==="LOG_IN"){
        //console.log("User state",state.userState)
        return{
            ...state,
            userState:action.userState
        }
    }else  if(action.type ==="LOG_OUT"){
        console.log("User state",state.userState)
        return{
            ...state,
            userState:action.userState
        }
    }
    return state;
};

export default myRootReducer;