console.log('=============')
var useracnt={
   username : 'Monika',
   pwd : 456,
   adhar : 9088777,
   
 getfulldetails : function(){
  return this.username+''+this.pwd+this.adhar;
}
}
var username=useracnt.username;
console.log('username='+username)
var pwd=useracnt.pwd;
console.log('pwd='+pwd);
var adhar=useracnt.adhar;
console.log('adhar='+adhar);
var fulldetails=useracnt.getfulldetails();
console.log('Fulldetails='+fulldetails);


console.log('=================')
var account={
   name : 'Vani',
   followers : 100,
   following : 10,
   
 getfulldetails : function(){
  return this.name+''+this.followers+this.following;
}
}
var name = account.name;
console.log('name='+name)
var followers = account.followers;
console.log('followers='+followers);
var following = account.following;
console.log('following='+following);
var fulldetails = account.getfulldetails();
console.log('Fulldetails='+fulldetails);


console.log('======================')
    var post={
        name : 'Ramya',
        likes : 50,
       comments : 10,
       
   
}
  
  var name=post.name;
  console.log('name='+name)
  var likes=post.likes;
  console.log('likes='+likes);
  var comments=account.comments;
  console.log('comments='+comments);
  
  

console.log('==============')
    var Employee={
       name : 'Rama',
       id : 150,
       sal : 30000,
    }

  var name=Employee.name;
  console.log('name='+name)
  var id=Employee.id;
  console.log('id='+id);
  var sal =Employee.sal;
  console.log('sal='+sal);
   
   

console.log('==================')
    var Animal={
       name : 'elephant',
        color : 'black',
        weight : 600,
    }

  var name=Animal.name;
  console.log('name='+name)
  var color=Animal.color;
  console.log('color='+color);
  var weight =Animal.weight;
  console.log('weight='+weight);
  
   



