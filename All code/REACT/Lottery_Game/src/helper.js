// these functions are normal function jinko code me khi bhi use kiya jaa skta haii bs yee react specific nhi haii

function genTicket(n){
 let arr = new Array(n)
 for(let i=0;i<n;i++){
    arr[i]=Math.floor(Math.random()*10);
 }
 return arr;
}

function Sum(arr){ // jarurui nhi tikcket ka hi sum nikale 
    //kisi ka bhi nikaal skte ishliye argument me arr diya instead of ticket
     return  arr.reduce((sum,curr)=> sum+curr,0) //sum is start from 0
}

export {genTicket};
export {Sum};