const person  = {
    name : 'Sundara',
    age : 100,
    color : 'white',
    adress : {
        city : 'Mandya',
        state : 'Karnataka',
        pincode : 56789
    },
    hobbies : ['Coding','Bird Watching','Singing']
}
console.log('Javascript person object',person)              //to convert js to JSON object
const jsonObject = JSON.stringify(person)
console.log('JSON person Object',jsonObject)                                    
const javascriptObject = JSON.parse(jsonObject)             //to convert JSON to js
console.log('Javascript object',javascriptObject)   

localStorage.setItem('email','monikargowda912@gmail.com')        //Local Storage
const emailID= localStorage.getItem('emaila')
console.log('emailID',emailID)
localStorage.clear()




