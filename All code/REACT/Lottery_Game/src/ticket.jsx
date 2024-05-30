import React from 'react'
import TicketNum from './ticketNum'
import './ticket.css';

function Ticket({ticket}) {
  return (
    <div className='ticket'>
      {/* <TicketNum num={ticket[0]}/>  lein ye krke bhi ham hard ocode hi to krr rhe ishliye hamm map ka use krenge
      <TicketNum num={ticket[1]}/>  */}
       {ticket.map((num,idx)=>(
        <TicketNum num={num} key={idx} />//basically ham arr de rhe to key bhi deni hogi to uniquely identiy ham uuid ka bhi use  krr skte lekin idhar hamne index hi simplepass krr diya
       ))}

    </div>
  )
}


export default Ticket
