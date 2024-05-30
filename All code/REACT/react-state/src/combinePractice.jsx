import Product from './practice.jsx';

export default function Combine(){
    let arrr=["Rchika","is","best"];
    let list = arrr.map((val)=> <li>{val}</li>)
    return (
        <div>
            <Product
            value="Ruchika Yadav"
            price="Ki kimat hi nhii"
            arr={list}
            />
        </div>
    )
}