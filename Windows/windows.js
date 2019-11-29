console.log('window object',window)
console.log('This Keyword',this)
console.log(this === window) 

//window.alert('Welcome to javascript class')                     ////alert method
//alert('Welcome to Test yantra')

//let confirmDelete = confirm('Are you sure you want to delete')        ///confrim method
//console.log('confrim Delete',confirmDelete)

//let username = prompt('What is your name','Monika')                  ///Prompt method
//console.log('User Name',username)

const person = {                                         ////This keyword
  firstName : 'Monika',
    age : 26,
    lastName : 'Gowda',
    getName : function(){
        console.log('This Keyword',this)
        return this.firstName+''+this.lastName
    }

}
let fullName  = person.getName()
console.log('Full Name',fullName)