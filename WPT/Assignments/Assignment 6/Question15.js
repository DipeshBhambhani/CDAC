var master = [10, 20, 30, 40, 50];
let a = master.filter((num) => {
    if (num % 2 === 0) {
        return num;
    }
}).map(val => val * 2).reduce((total,count)=>{
    return total+count;
})
console.log(a);

