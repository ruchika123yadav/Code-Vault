import { useState } from "react"

 export default function Form(){
//  const [name,setName] = useState("R")

 const [form,setForm] = useState({
  fullName:"",
  Address:"",

 })
  let Change =(event)=>{
    setForm((data)=>{
      return {...data,[event.target.name]:event.target.value}
    })
  };
  
     
 
 let handle=(event)=>{
  event.preventDefault();
  setForm({
    fullName:"",
  Address:"",

  })
  console.log(form)
 };

  return (
    <form action="#" onSubmit={handle}>
      
      <label htmlFor="name">Fullname</label>
    <input type="text"
     placeholder="Enter your Name"
    value= {form.fullName}
  onChange={Change}
  id="name"
  name="fullName"  //jo ham yha pe name de rhe wo hamre statevariable ke name ke equal hona chahiye
    />
    
    <br />
      <label htmlFor="name">Address</label>
    <input type="text"
     placeholder="Enter your Name"
    value= {form.Address}
  onChange={Change}
  id="name"
  name="Address"
    />
    <button>Click me</button>
    
    
    </form>
  )
 }