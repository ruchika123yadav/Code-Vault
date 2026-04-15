interface tree{
    id:number;
}

let e1:tree;

let e2={
    id:123,
    name:"Ruchika"
}

e1=e2;//becaise id ia already present inside the e2 and name is additionally added so no problem in that case
// e2=e1; 

//WE CAN ONLY ASSIGN THE DATA OF THE FIRST VARIABLE TO THE SECOND VARIABLE IF 
// THE VARIABLE DATA OR TYPE MEMBERS ARE CONTAINED WITHIN THE TYPE OF THE SECOND VARIABLE

