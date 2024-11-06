var cart=[100,200,300,150,2000];

const Final_Amount=cart.reduce((total,num)=>{
    return total+num
})
console.log(Final_Amount);