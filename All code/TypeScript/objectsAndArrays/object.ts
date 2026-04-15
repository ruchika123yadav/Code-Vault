var student={
      name:"Ruchika",
      score:99
};

console.log(student.name);
console.log(student.score);


for(var item in student){
    console.log(item);
    // console.log(student[item]); I don't understand it's reason why its giving and error
}

