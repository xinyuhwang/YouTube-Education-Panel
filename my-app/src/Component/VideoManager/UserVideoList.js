import React, { Component } from 'react';
import SearchVideoList from '../Home/SearchVideoList';
class UserVideoList extends Component {
    state={
        userlist:[
        {id: "hEsofW-h6zA", url: "https://www.youtube.com/embed/hEsofW-h6zA", title: "BEST DANCES OF 2018", thumbnail: null, videoList: null},
        {id: "SrVV73gTBpk", url: "https://www.youtube.com/embed/SrVV73gTBpk", title: "TONES AND I - DANCE MONKEY ", thumbnail: null, videoList: null}
    ]

    }
    render() {
        return (
            <div>
                <SearchVideoList searchVideoList={this.state.userlist}/>
            </div>
        );
    }
}

export default UserVideoList;