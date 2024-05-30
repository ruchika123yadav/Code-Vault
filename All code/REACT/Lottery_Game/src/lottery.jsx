// rfce
import { useState } from "react";
import { Sum, genTicket } from "./helper";
import './lottery.css';
import Ticket from './ticket.jsx';

export default function Lottery({n=3,winningSum=15}){
  let [ticket,setTicket] = useState(genTicket(n));
  let isWin=Sum(ticket)===winningSum;

  let buyTick=()=>{
    setTicket(genTicket(n)) 
  }          
    return (
      <div>
            <h1>Lottery Game</h1>
        <div className="lottery">        
              <Ticket ticket={ticket}/>
               </div>
<br/>  
            <button onClick={buyTick}>Buy new ticket</button>
            <h3>{isWin && "Congratulations you won Lottery"} </h3>
        </div>
    )
}