import Product from './product.jsx';
import Mess from './msg.jsx';

function Combine(){
    let options=["hi=tech","best","durable"]; //these are the arrays
    // now we use the objest to pass them
    // let objects={name:"Ruchi",b:"Ruchika"};

    return (
        <>
        <Product
         titl="Phone"
         price={10000}

        //  adding the arrays
          arr={options} 


        //   printing the objects objects ke liye ye property kar ek para me honi chaihye wrna
        // error show krega mtlb juch visible hi nhi hoga
        //   objects={objects}
          />

       <Product titl="ting tong" price={550000} />
       <Product titl="Shop" price={100} />
       <Mess name="Ruchika" colr="blue"/>
       <Mess name="Om" colr="pink"/>
       <Mess name="yuppp" colr="white"/>
          
       
         
        </>
    )
}
export default Combine;