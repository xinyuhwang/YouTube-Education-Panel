import React from 'react';
import SearchVideoList from './SearchVideoList';
import {connect} from "react-redux"
import {getVideoList} from "../aAction/actionGetVideoList"

class SearchVideo extends React.Component {
    state = {
        keywords:"",
    }
    
    handleChagne=(event)=>{
        this.setState({
            keywords: event.target.value
        })
    }
    handleSubmit=(e)=>{
        //hold keywords in search text
        e.preventDefault();
        //set keywords also get data from backend
        const keywords = this.state.keywords
        fetch("/YouTube/search/"+keywords)
        .then((response) => response.json())
        .then(data=>{
            //set global redux data of videolist
            this.props.getVideoList(data)
            console.log(data)
        })
    }
    render() {
        return (
            <div>
                <form onSubmit={this.handleSubmit}>
                    <button>Search</button>
                    <input type="text" placeholder="Input Keywords"onChange={this.handleChagne} value={this.state.keywords}/>                  
                </form>
                <SearchVideoList searchVideoList={this.props.searchVideoList}/>
            </div>
        )
    }
}
const mapStateToProps=(state)=>{
    return{
        searchVideoList:state.searchVideoList
    }
}
function mapDispatchToProps(dispatch){
    return{
        getVideoList:(searchVideoList)=>dispatch(getVideoList(searchVideoList))
        }
}
export default  connect(mapStateToProps,mapDispatchToProps)(SearchVideo);