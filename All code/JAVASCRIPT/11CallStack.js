function one(){
    return 1;
}

function two(){
    return one() +one();

}

function three(){
    let ans= two() +one()
         console.log(ans);
}
 
three();


// CALLBACK HELL
// h1=document.querySelector('h1')

// setTimeout(()=>{
//     h1.style.color='red';
// },1000);

// setTimeout(()=>{
//     h1.style.color='orange';
// },2000);

// setTimeout(()=>{
//     h1.style.color='green';
// },3000);

// setTimeout(()=>{
//     h1.style.color='purple';
// },4000);


function changecolor(color,delay){
    return new Promise((resolve,reject)=>{
        setTimeout(()=>{
            h1.style.color=color;
            // if(nextColor) nextColor();  // yha hamne condition ishliye lagaye hi kyuki ham fir line 49 comment
            resolve("Color changed")
        },delay);
    });
     
}
// Without PROMISE...............

// changecolor("red",1000)
// changecolor("orange",2000)

// changecolor("purple",3000)  ab kabhi kabhi kya hota hiaaki ham ye chahte hai ki pehle hamra jo upr wala funcitonhai wo shi chale tabhi niche
// wala kam kre other wise niche wala bhi na chale

// changecolor("red",1000,()=>{
//     changecolor("orange",1000,()=>{
//         changecolor("purple",1000 ,()=>{
//             changecolor("yellow",1000);
//         })
//     })
// })


// WITH PROMISE..............
changecolor("red",1000)
.then(()=>{
    console.log("red color was completed")
    return changecolor("orange",1000);
})
.then(()=>{
    console.log("orange color was completed")
    return changecolor("pink",1000);
})
.then(()=>{
    console.log("pink color was completed")
    return changecolor("yellow",1000);
})
.then(()=>{
    console.log("yellow color was completed")
    return changecolor("grey",1000);
})
.catch(()=>{
    console.log("Error")
})







// CALL BACK HELL

// yha to ye call back koi sense nhi bana rha lekin jab hame bada bada data store krte hai tab ye bhoot useful rhta hai

// PREVENTING FROM CLAL BACK WE USE 
// PROMISES

// function saveDb(data,success,failure){
//   let internetSpeed=function saveDb(data,success,failure){
//   let internetSpeed=Math.floor(Math.random()*9) +1;
//   if(internetSpeed>4){
//     success();
//   }
//   else{
//     failure();
//   }
// }
//   if(internetSpeed>4){
//     success();
//   }
//   else{
//     failure();
//   }
// }

// saveDb("Ruchika",()=>{
//     console.log("Your data is saved")
//          saveDb("data2",
//          ()=>{
//            console.log("Data2 is saved")
//            saveDb("data3",()=>{
//             console.log("Data3 is saved")
//            },()=>{
//             console.log("Poor connection..")
//            }),
//            ()=>{
//             console.log("Poor connection..")
//            }
//          })
//          },
//      ()=>{
//         console.log("Poor Internet Connection")
//     }
// )


// PROMISES
function saveDb(data){
      return new Promise((resolve,reject) =>{
        let internetSpeed=Math.floor(Math.random()*9) +1;
        if(internetSpeed>4){
                console.log(resolve("success:data is saved")); // result for THEN 
              } 
              else{
                reject("failure:Poor connection");   // error for CATCH
                //reject error throw krta haiii 
              }
      })
      }
      
saveDb("Ruchi")
.then((result)=>{
    console.log("Data1 is saved")
    console.log("Result of promise",result) // jo bhi result ayeg amtlb jo return krega function wo print hoga
    return saveDb("Data2")
})
    .then((result)=>{
        console.log("Data2 is saved")
        console.log("Result of the Promise",result)
        return saveDb("data3")
    })
    .then((result)=>{
        console.log("Data3 is saved")
        console.log("result of the promise",result);
    })


.catch((error)=>{
    console.log("Promise was rejected")
    console.log("error of promise",error); // agr koi error aya to wo error ki jaa=gah print hoga
})
