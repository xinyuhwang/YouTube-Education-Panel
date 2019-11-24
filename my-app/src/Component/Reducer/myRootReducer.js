
const totalState = {
    userId: null,
    Password: null,
    Email: null,
    LastName: null,
    FirstName: null,
    //list id is an array contain list of video
    ListID:[
        {
            videoID: null,
            URL: null,
            Tittle: null,
            NoteID: [
                //each video contain a notbook
                {NoteBookID: null, Text: null, TimeStamp: null}
            ],
            Tags:[
                {TagID: null, TagName: null} 
            ]
        }
    ],
    TagList:[ 
        {TagID: null, TagName: null} 
    ]
}
const initeUserTagsState =[
    {tagId:"1",tagName:"tag1"},
    {tagId:"2",tagName:"tag2"},
    {tagId:"3",tagName:"getdata"},
    {tagId:"4",tagName:"casssss"},
    {tagId:"5",tagName:"1234aa1718"},
    {tagId:"6",tagName:"01112131415161718"}
]

const initUserState = {
    userId: null,
    Password: null,
    Email: null,
    LastName: null,
    FirstName: null,
}
const initSearchVideoListState =[
//     {
//     videoID: null,
//     Tittle: null,
//     URL: null,
// }
]
const initUserVideoList=[
//     {
//     videoID: null,
//     Tittle: null,
//     URL: null,
//  }
]

const initState = {
    userState:initUserState,
    searchVideoList:initSearchVideoListState,
    userTags: initeUserTagsState,
    UserVideoList:initUserVideoList
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
    if(action.type ==="EDIT_TAGS"){
        console.log("user tags list",state.userTags)
        return{
            ...state,
            userTags:action.userTags
        }
    }
    return state;
};

export default myRootReducer;