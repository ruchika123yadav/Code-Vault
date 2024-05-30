// // FOR LOOPS (similar like java and c )

// for(let i = 1; i<=5;i++){
//     console.log(i)
// }

// // // for reverse the numbers
// // // for(let i = 5; i<=1;i--){
// // //     console.log(i)
// // // }

// // // for printintg odd numbers
// console.log("here")
// for(let i = 1; i<=15;i=i+2){
//     console.log(i)
// }

// // // for even numbers
// for(let i = 2; i<=10;i=i+2){
//     console.log(i)
// }

// // // INFINITE LOOPS

// console.log("yup")
// // // MULTIPLICATION TABLE
// for(let i =1; i<=10;i++){
//     console.log("5 X",i,"=",5*i)

// }

// // NESTED LOOP
// // for(let i = 1; i<=3;i++){
// //     console.log("Outer loop")
// //     for(let j=1;i<=3;j++){
// //         console.log(j)
// //     }
// // }

// // FAV MOVIE
 
// let fruits = [ "mango","apple","banana","litchi","orange"]
// fruits.push("guava")
// for(let i =0;i<fruits.length;i++){
//     console.log(i,fruits[i])
// }
 

// // FOR OF LOOPS
// for(i of fruits){
//     console.log(i)
// }

// for(i of "RuchikaYadav"){   // ham i ki jagah kuch bhi likh skte haii
//     console.log(i)
// }

// // FOR TRAVERSING NESTED ARRAY
// let heroes = [ ["Ironman","Thor","spiderman"],["superman","wonder","flax"]]

// for(let i=0;i<heroes.length;i++){
//     console.log(i,heroes[i]);
//     for(let j=0;j<heroes[i].length;j++){
//         console.log(heroes[i][j]);
//      }
// }

// // IN FOR OF IN NESTED ARRAY
// for(i of heroes){
//     console.log(i);
//     for(j of i){
//         console.log(j);
//     }
// }

// PRACTICE PROBLEM ###############
// let arr=[1,2,3,4,5,-6,7,8];
// let n = 8;
// for(i=0;i<n;i++){
//     if(arr[i]>=0){
//         console.log(arr[i])
//     }
// }

// 2 ###

// let arrr=[1,2,3,4,5,-6,7,8];
// let n =6 ;
// for(i=(arrr.length -1);i>((arrr.length -1)-n);i--){
//     if(arrr[i]>=0){
//         console.log(arrr[i])
//     }
// }

// 3 #####
//  let str =prompt("Enter the string");
//  if(str.length==0){
//     console.log("String is empty")
//  }
//  else{
//     console.log("String is not empty")
//  }

// 
// 4 ####

// let n =3
// let strr="RUCHIKA";
// if(strr[n]==strr[n].toLowerCase()){
//     console.log("Yes")
// }
// else{
//     console.log("NO")
// }
// console.log(strr)

// 6######
let b = 8
let a =[1,2,3,4,6,7,8];
for(i=0;i<a.length;i++){
    // if(a.indexOf(b)!=-1)
    if(a[i]==b){
        console.log("Yes,Present")
    }

 
}

 