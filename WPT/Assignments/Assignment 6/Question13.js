function f1(){
    console.log("Before Returned");
    return (()=>{
        console.log("After Returned");
    })
}
const A=f1();
console.log(A);