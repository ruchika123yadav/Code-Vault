function Click(event){
    console.log("Do Something");
   console.log(event);
}

function Form(event){
    event.preventDefault();
    console.log("Submit form haii ye to")
}

export default function Event(){
    return (
        <div>
{/* //   <button onClick={Click}>Click me!</button>
//   <p onMouseOver={Click}>Ye yes yes</p> */}
  <form action="#" onSubmit={Form}>
    <input type="text" placeholder="Type" />
    {/* <button onClick={Form}>Click</button> */}
    <button  >Click</button>
  </form>
  
        </div>
    )
}

//ye dhyaan rakhnaa kit click function ko call nhi krna sirf uska naam likh dena hai bss
//kyuki agr ushe call krr diya to wo pura ek hi baar me execute ho jayegaa
 