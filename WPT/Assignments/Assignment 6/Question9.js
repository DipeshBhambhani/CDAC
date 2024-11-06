function add(...nums){
let total=0;
for (var num of  nums){
    total+=num;
}
return total;
}
const total =add(5,10,20,30,40,45);
console.log(total)