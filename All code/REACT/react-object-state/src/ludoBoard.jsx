
// import { useState } from "react";
// export default function Ludo(){
// let [moves,setmoves]=useState({blue:0,pink:0,red:0,orange:0});
// let [arr,setarr]=useState(["I am best"]);
// function blueinc(){
//     setmoves((prev)=>{
//         return {...prev,blue:prev.blue+1};

import { useState } from "react"

   
//     });
// }
// function Arr(){
//     setarr((prev)=>{
//         return [...prev,"Blue moves"];

        
//     });
// }
// function pinkinc(){
//     setmoves((prev)=>{
//         return {...prev,pink:prev.pink+1};
        
//     });
// }
// // agr ham aishe krenge to hame har ek ke liye function banan hoga or har ek ke liye
// // array bhi define krna hoga inc. count ke liye
// // 
// // let [blcount,setcount]=useState(0);
// // function inc(){
// //     setcount(blcount+1);

// // }  

//     return (
//         <div>
//             <p>Blue Moves= {moves.blue}</p>
//             <button style={{backgroundColor:'blue'}} onClick={blueinc}>Blue+</button>
//             <p>Pink Moves= {moves.pink} </p>
//             <button style={{backgroundColor:'pink'}} onClick={pinkinc} >Yellow+</button>
//             <p>Red Moves= {arr}</p>
//             <button style={{backgroundColor:'red'}} onClick={Arr}>Red+</button>
//             <p>Orange Moves=</p>
//             <button style={{backgroundColor:'orange'}}>Orange+</button>
//         </div>
//     )
// }

import {v4 as uuidv4} from 'uuid';
export default function Todo(){
    let [todo,setTodo]= useState([{task:"sample",id:uuidv4(),isDone:false}])
    let [inp,setinp]=useState("");

     let AddTask = ()=>{
          setTodo((prev)=>{
            return [...prev,{task:inp,id:uuidv4(),isDone:false}]
          });
          setinp("");
     }
     let updateTodo =(event)=>{
        setinp(event.target.value)
     }

let Delete =(id)=>{
    setTodo(todo.filter((todos)=> todos.id!=id));
}

let updateOne =(id)=>{
    setTodo((prev)=>{ prev.map((event)=>{
        if(event.id==id){
            return {
                ...prev,task:event.task.toUpperCase()
            }
        }
    })
        
    })
}
let MarkDone =(id)=>{
    setTodo((prev)=>{
        prev.map((event)=>{
            if(event.id==id){
   return {
    ...event,isDone:true
   }
            }
        })
    })
}

let uppercaseAll =()=>{
    setTodo((prev)=>{ prev.map((event)=>{
         
            return {
                ...event,task:event.task.toUpperCase()
            }
        
    })
        
    })
}

    return (
        <div>
          <input type="text" placeholder="Enter any task" value={inp} onChange={updateTodo} />
          <button onClick={AddTask}>Add</button>
          <h2>task Todo</h2>
         <ul>
            {todo.map((todos)=>
            <li key={todos.key}>
           <span></span>
           <button onClick={()=>Delete(todos.id)}>Delete</button>
           <button onClick={()=>updateOne(todos.id)}></button>
           <button onClick={()=>MarkDone(todos.id)}></button>

            </li>
          )  }
         </ul>
         <button onClick={uppercaseAll}></button>
                                
                                <li>
                                    <di>
                                        <p><a href="www.google.com">Go to this link to go google link </a></p>
                                    </di>
                                </li>
         </div>
    )
  
}

