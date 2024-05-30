import { useState } from "react"

export default function Like(){
    let [like,setLike]=useState(false);
    let [click,setClick]=useState(0);
    function Liked(){
        setLike(!like);
         setClick((currVal)=>{
            return currVal+1;
         });

         setClick((currVal)=>{
            return currVal+1;
         });
         
          
          // aihe ishe agr do baar like de to value twice baar increase
        //  nhi hongii because ye asynchrounous function hai uskeliye hame
        // arrow function ka use krna hoga tabhi ham jjo chate hai
        // ki 2 baar agr call kiya to do baar badkar value ayee

        // console.log(like.toString())
    }
    
    return (
        <div>
            {/* <p onClick={Liked}> 
             <p>Click {click}</p> */}
            {/* {like?<i className=" fa-3x fa-solid fa-heart"></i> :<i className="fa-3x fa-regular fa-heart"></i> } */}

            {/* </p> */}
     <h3>Increase Count {click}</h3>
            <button onClick={Liked}>Click!</button>
        </div>
    )
}
