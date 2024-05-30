import React from 'react'
import { useDispatch, useSelector } from 'react-redux'//ye hamra toolkit se nhi aa rha ye react library se hi aa rha
import AddForm from './AddForm.jsx';
import { DELETE } from './TodoSlice.jsx';
import { MARK_ASDONE } from './TodoSlice.jsx';

// ab hame use krna hoga useSelectore jo ki hamare store ke state variable ko acces krne me mada krta
// jese useState state variable ko access krne me adad krta hai
function Todo() {

    const todo = useSelector((state) => state.todos); //ye todos intial state li hai mene
    console.log(todo);
    let dispatch = useDispatch();
   let deleteTodo=(id) => {
        dispatch(DELETE(id))
    }
    let markDone=(id)=>{
        dispatch(MARK_ASDONE(id))
    }

    return (
        <div>
            <h1>Todo</h1>
            <AddForm /><br />
            {todo.map((todo) =>
                <li key={todo.id}                >
                   <span style={todo.isDone?{textDecorationLine:'line-through'}:{}} >
                    {todo.task}
                   </span> 
                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    <button onClick={() => deleteTodo(todo.id)}>DELETE</button>
                    &nbsp;&nbsp;<button onClick={()=> markDone(todo.id)}>Mark as Done</button>
                </li>
            )}

        </div>
    )
}

export default Todo
