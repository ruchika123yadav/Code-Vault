function random(){
    var randomNumber=Math.random();

    if(randomNumber>0.5){
        throw new TypeError("Random type error")
    }else{
         
        throw new RangeError("Random range error")
    }
    }


    try{
        random()
    }catch(error){
        console.log("Error"+error)
    }

    