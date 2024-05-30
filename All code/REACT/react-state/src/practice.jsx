import { useState } from "react"

export default function product({value,price,arr}){
    let [count,setcount]=useState({a:"Ruchi",b:"Cat"});
    function Click(){
        setcount((plus)=>{
            return   {...plus,a:plus.a+"Ruchika"}
        })
    }
    return (
        <div>
            <h1>Here i am</h1>
        <p>{value}</p>
        <p>{price}</p>
        <p>{arr}</p>
          <p>Value of Count is {count}</p>
        {/* <button onClick={Click}>Count+</button> */}
        </div>
    )
}