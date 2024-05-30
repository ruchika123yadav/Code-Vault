import './product.css'

export default function Product({title,price}){
    let feature =["RUchika","Yadav","OM","Yadav"];
    let list = feature.map((features)=>{
            return <li>{features}</li>
    })
    let style ={height:'300px',
    backgroundColor:'red',
}
let discount = price>2000;
let give = discount?<p>You give a discount of 20%</p>:" "
    return (
        <div style={style}>
           <h1>{title}</h1>
           <p>{price}</p>
            <ul>{list}</ul> 
            {give}
        </div>
    )
}