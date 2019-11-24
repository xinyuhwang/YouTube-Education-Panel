import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import * as serviceWorker from './serviceWorker';

import {Provider} from "react-redux";
import {createStore} from "redux";
import myRootReducer from './Component/Reducer/myRootReducer';
import Main from './Component/Main';


const store = createStore(myRootReducer);
store.subscribe(()=>{
    console.log(store.getState());
})

ReactDOM.render(
    <Provider store={store}>
        <Main />
    </Provider>
, document.getElementById('root'));
serviceWorker.unregister();


//_____________________________________________________
// import React from 'react';
// import ReactDOM from 'react-dom';
// import './index.css';
// import * as serviceWorker from './serviceWorker';

// import AppRouter from './RouterCom/AppRouter';
// import { createStore } from 'redux';
// import {Provider} from "react-redux"
// import rootReducer from './redux/rootReducer';

// const store = createStore(rootReducer)
// store.subscribe(()=>{
//     console.log(store.getState());
// })

// ReactDOM.render(
//     <Provider store={store}>
//         <AppRouter />
//     </Provider>

// , document.getElementById('root'));
// serviceWorker.unregister();
