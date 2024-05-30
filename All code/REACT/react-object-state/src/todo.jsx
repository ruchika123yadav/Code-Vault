import { useState } from "react"
import {v4 as uuidv4} from 'uuid'

export default function Todo(){
    let [todo,setodo]= useState([{task:"Sample task",id:uuidv4(),isDone:false}])
    let [inp,setinput]=useState("");

      let Addtask = () => {
         setodo((prev)=>{
            return [...prev,{task:inp,id:uuidv4(),isDone:false}];
})
        setinput("");
      }

       let UpdateTodo = (event)=>{
        setinput(event.target.value)
        
       }
       let Delete = (id)=>{
        setodo(todo.filter((todos) =>todos.id!=id))  // ham yha kuch change nhi krr rhe haii
         
       }

       let UppercaseAll = ( )=>{
      setodo ( (prev) => prev.map((todos)=> {
            return {
                ...todos,
                task:todos.task.toUpperCase()    // lekin yha ham change krr rhe har ek arr ke element ko
            }
         }
         )) 
       }

       
     

       let UpdateOne = (id)=>{
      setodo ( (prev) => prev.map((event)=> {
        if(event.id==id){
            return {
                ...event,
                task:event.task.toUpperCase()
            }
            }
            else{
                return event
            }
         }
         )) 
       }

       let markDone=(id)=>{
        setodo ( (prev) => prev.map((event)=> {
            if(event.id==id){
                return {
                    ...event,isDone:true
                     
                }
                }
                else{
                    return event
                }
             }
             )) 
       }

    return (
        <div>
            <input type="text" placeholder="Add a Task" value={inp}  onChange={UpdateTodo}/><br /><br />
            <button onClick={Addtask}>Add</button><br />
            <br />
            <h2>Task Todo</h2>
            <hr />
            <ul>
            {todo.map((todos)=> 
                 <li key={todos.id}>
                <span style={todos.isDone? {textDecorationLine:"line-through"}:{}}>
                    {todos.task}</span>
                    {/* yha direct delete me value pass nhi krii */}
                    <button onClick={() =>Delete(todos.id)}>Delete</button>
                    <button onClick={()=> UpdateOne(todos.id)}>Update</button>
                    <button onClick={()=> markDone(todos.id)}>Mark as done</button>
                    </li>
         )   }
            </ul>
            <br /><br />
            <button onClick={UppercaseAll} >Upper Case All</button>
             

        </div>
    )
}