import Price from './microPrice.jsx';
import './micro.css';

 export default function Card({title,index}){
    let desc=[["Hi it is best","bes hai best"],["Hi it is best","bes hai best"],
    ["Hi it is best","bes hai best"],["Hi it is best","bes hai best"]]
    return (
        <div className='card'>
       <h3>{title}</h3>
           <p >{desc[index][0]}</p>
           <p>{desc[index][1]}</p>
        <Price index={index}/>
        </div>
    )
 }