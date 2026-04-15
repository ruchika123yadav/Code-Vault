var product=function(...nums: number[]){
    var result=1;

    for(var i=0;i<nums.length;i++){
        console.log(nums[i]);
         result*=nums[i];
    }
    return result;

}

product(2,3,4,5);