import { useEffect, useState } from "react"


export default function Count(){
    // const [count,setCount]= useState(0);
    // const [count2,setCount2]= useState(0);
    
    // function increase(){
    //     setCount(count+1)
    // }
    // function increase2(){
    //     setCount2(count2+1)
    // }
    // useEffect(function print(){
    //     console.log("Hey1 there i am")
    // },[count2])

    const url ="https://official-joke-api.appspot.com/random_joke";

// api ke stah kaam krr rhe to asyn function ka use krenge

const[joke,setJoke]=useState({});
let api= async ()=>{
   let response= await fetch(url);
   let json = await response.json();
   console.log(json)
//    yhi directly setup and punchline define krr diya
   setJoke({setup:json.setup,punchline:json.punchline})
 }

 useEffect(()=>{
    async function first(){
            let response= await fetch(url);
            let json = await response.json();
            console.log(json)
            setJoke({setup:json.setup,punchline:json.punchline})
    }
    first();
},[])

    return (
        <div>
              <h2>Joke!</h2>
              <h3>{joke.setup} </h3>
              <h3>{joke.punchline}</h3>
              <button onClick={api}> ClickSee Joke</button>







            {/* <h2>Count={count}</h2>
            <button onClick={increase}>+1</button>
            <h2>Count={count2}</h2>
            <button onClick={increase2}>+1</button> */}
        </div>
    )
}