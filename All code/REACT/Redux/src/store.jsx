import { configureStore } from '@reduxjs/toolkit'// give a toolkit to design the app 

import TodoReducer from './TodoSlice.jsx';

// ye function hamre store create krke deta haiii
 export let store = configureStore({
    reducer:TodoReducer,
    
    //phele ham reducer ko likhenge uske baad iske andr pass krenge
 });

 export default {store};