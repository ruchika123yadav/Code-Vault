import { useState } from "react"


export default function FormComment() {
    const[data,setData] = useState({
        name:"",
        remarks:"",
        rating:4
        ,
    })

    let Add=(event)=>{
        setData((info)=>{
            return {...info,[event.target.name]:event.target.value}
        })
    }

    let handle=(event)=>{
        event.preventDefault();
        setData({
            name:"",
            remarks:"",
            rating:"4",
        })
    }

    return (
        <div>
            <h2>Give a Comment!</h2>
            <form action="#" onSubmit={handle}>
                <input type="text" onChange={Add} placeholder="Enter your name" value={data.name}  name="name"/>
                <br /> <br />
                <textarea name="remarks" onChange={Add}  id="" value={data.remarks}></textarea >
                <br /> <br />

                <input type="number"  value={data.rating}  onChange={Add}  placeholder="Rating"  min={1} max={10}/>
                <br /> <br />

                <button>Add Comment</button>

            </form>
        </div>
    )

}