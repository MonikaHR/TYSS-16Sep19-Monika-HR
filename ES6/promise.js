const message = new Promise(function(resolve,reject){
    if(30>20)
    {
    resolve('Success')
    }
    else{
        reject('Failed')
    }
})
message.then(function(msg){
    console.log('Success Message',msg)
}).catch(function(err){
    console.log('Failure Message',err)
})


const employee = new Promise(function(resolve,reject){
    if(30>20)
    {
    resolve([{
        name : 'Billgates',
        age :67
    },{
    name : 'Monika',
    age : 21
     }])
    }
    else{
        reject('Failed')
    }
})
employee.then(function(data){
    console.log('Employee details',data)
}).catch(function(err){
    console.log('Failure Message',err)
})


//closures
function outerFunction(counter){
 function innerFunction(){
        let count;
        count = counter + 10
        return count
    }
    return innerFunction
}
let innerFunc = outerFunction(20)
let counter = innerFunc()
console.log('Counter value',counter)














