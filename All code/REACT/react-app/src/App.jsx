 
import './App.css'
import Combine from './combine.jsx'
import Join from './join.jsx'
import Event from './EventListners.jsx'
import Product from './product.jsx'

function T(){
  return <h2>Ruchika Yadav</h2>
}

function App() {
   
  return ( 
  <>
    {/* <Join/> */}
           <Product title="Ruchika" price={200}/>
    {/* <Event/> */}
    {/* <Combine/> */}

  </>
  ); 
  //render bhi to karana thaa
  //  because app is our main component ishliye hame iske ander render karaya
  //ishme jab div me multiple function render kara rhe ho tab () lagana jaruri haii wrna ushe lagage ki tum kuch return hi nhi kara rhe
  
}

export default App
