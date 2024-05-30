import { createSlice,nanoid } from '@reduxjs/toolkit';

// first we have to intilialize intial state

let initialState={
    todos:[{id:"abc",task:"Eat",isDone: false}],
}

// ab create slice se ham pani slice ko create krenge jani jo bundle tha
// reducers and action melke jo bundle bangea for todos

 export let setTodo = createSlice({
    name:"todo",
    initialState,
    reducers:{
        SET_TODO:(state,action)=>{
            // state ke andr hamri complete state hogi jise ham access krr ste or ishi ke andr hamra wo todos wala object bhi hoga
            let newTodo={
              id: nanoid(),
              task:action.payload,
            //   yha ahme assume krna haii ki task bhej diya hoga ab yha ayega kese wo ham components me pass karayenge taab
            //   hame yha assume krna haii ki action ke andr action aa gya hoga or payload bhi aa gya hoga
  //jabh ame action ko define krenge to ham object ko define nhi krenge like case ,type wo redux toolkit automatic hi krr deta          
              isDone:false,
            }           
            
            //ab newTodo object ko ham todo array ke andr push krr denge
            state.todos.push(newTodo);//direct mutation
 //yha ek cheez gorr krne wali hia ki state variable ke andr hamne direct todo pass krr diya hamne dubara usko 
//  destrutor nhi kran pada like [...todos,newTodo]             
        },
        DELETE:(state,action)=>{
          state.todos=  state.todos.filter((todo)=>todo.id!=action.payload)
        },
           MARK_ASDONE:(state,action)=>{
            state.todos=state.todos.map((todo)=>{
                if(todo.id===action.payload){
                    return { ...todo, isDone: true }; 
                                }
            return todo; // Return the unchanged todos as well

            });
           }
    }
 })

export const {SET_TODO,DELETE,MARK_ASDONE}=setTodo.actions;
//jo hamre reducer function hote haii uske liye toolkit hamre liye automatic action generate krr deta hai
//isse ham bata rhe ki delete set_todo ke liye kya action create hone chahiye jiise redux toolkit ushe automatice generate krr paye

 export default setTodo.reducer;//ishe hamre jo individual reducre haii wo export ho jate jisse ham
//  baadd me unhe kahi bhi use krr skte
