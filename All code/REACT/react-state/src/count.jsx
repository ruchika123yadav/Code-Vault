
import { useState } from "react"
// export default function Count(){
//     let count=0;
//     function inCount(){
//         count+=1;
//         console.log(count);
//     }



//     return (
//         <div>
//         <h3>Count {count}</h3>
//         <button onClick={inCount}> Click me</button>
//         </div>
//     )
// }

// SET FUNCTIONN USEEEEE#####################
export default function Count(){
    // let arr = useState(10);
    // console.log(arr)
    // let [stateVariable,setStateVariable]=useState(0);

    let [count,setCount]=useState(10);
     function incCount(){
        setCount(count+1)  //this method actually rerender the valuee
        console.log(count);
     }
    
    return (
        <div>
       <h3>Count {count}</h3>
        <button onClick={incCount}> Click me</button>
        </div>
    )
}