const myPromis= new Promise((resolve,reject)=>{
setTimeout(()=>{
    resolve("Msg printed after 3 seconds");
},3000);
});
myPromis.then((msg)=>{
console.log(msg)
})

    
