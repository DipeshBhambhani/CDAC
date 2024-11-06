var group=[1,2,3,4,5,6,7,8,9,10];
var even=group.filter((num)=>{
    if(num%2===0){
        return num;
    }
})
console.log(even);
var odd=group.filter((num)=>{
    if(num%2!==0){
        return num;
    }
})
console.log(odd);
