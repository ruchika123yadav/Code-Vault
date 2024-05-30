
export default function Mess({name,colr}){
let sty= {color : colr}
    return (
        <div >
      <p style={sty}> Hi! my Name is {name}</p>
       
      </div>
    )
}