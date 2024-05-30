import React from 'react'
import { useState } from 'react';
 import { useDispatch } from 'react-redux';
import {SET_TODO} from './TodoSlice.jsx'


function AddForm() {
    let [task,setTask] = useState("");
    let dispatch = useDispatch();

    let handle=(e)=>{
           e.preventDefault();
           console.log(task);
 //dispatch ke andr ham reduser pass krenge or reducer ke andr hame state or action pass kr na padta
 //lekin hame state pass krne ki jarurt nhi hame sirf action pass krna hoga jo action ke payload me jake save ho jayega          
           dispatch(SET_TODO(task))//dispatch  mtlb usk kaam ko trigger krr do or jo action bola hai wo krr do
           setTask("");
    }

    return (
        <div>
            <form action="#" onSubmit={handle}>
                <input type="text"
                placeholder='Enter you task'
                value={task}
                onChange={(e)=>setTask(e.target.value)}
                />
                <button>Add Task</button>

            </form>
        </div>
    )
}

export default AddForm
