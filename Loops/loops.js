var brands = ['kingfisher','bisleri','aqua','kinley']
console.log('For of loop');
for(var element of brands){                                //For Of Loop
    console.log('Brand=',element);
}
console.log('======================');

var brands = ['kingfisher','bisleri','aqua','kinley']
console.log('For in loop')
for(var index in brands){                                      //For IN Loop of Arrays
    console.log('Brand=',brands[index]);
}

console.log('=======================');
console.log('For IN loop of objects');
var person = {                                         //For IN loop of objects
    name : 'sundari',
    age : 33,
    color : 'white'
}
for(var key in person)
{
    console.log('value=',person[key]);
}

console.log('=======================');
console.log('For Each method of Array');
var movies = ['sholay','mayabazar','jurassicpark','titanic'];
movies.forEach(function(value,index){
console.log('movie=',value);
console.log('movie Index=',index);
}
)


console.log('=======================');
console.log('For Each method of Objects');
var items = [ {
    item : 'bangles',
    id : 1,
    price : 100
},
{
    item : 'eyeliner',
    id : 2,
    price : 500
},
{
 item : 'watch',
  id : 3,
  price : 5000
},
{
    item : 'bike',
    id : 1,
    price : 1000
}
]
items.forEach(function(item,index){
    console.log('item =',item);
    console.log('index of item=',index);
}
)




