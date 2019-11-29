//Named Functions
function add(num1,num2)
{
console.log('sum=',num1+num2);
}
add(10,20);


//Function Expression
var sub= function(num1,num2)
{
var subvalue = num1-num2;
return subvalue;
}
var value = sub(10,20);
console.log('value',value);

//self invoke function
console.log('hello');
(function (num1,num2)
{
    console.log('value=',num1*num2)
}) (10,20)

//Flat Arrow Function
var div1 = (num1,num2) =>
{
    console.log('value1=',num1/num2);
}
    div1(10,5);

    //Flat Arrow function with one parameter
    var num = num1 =>
{
    console.log('value2=',num1);
}
    num(5);

//Flat arrow function with one line of code
var div3 = num1 => console.log(num1);
var value = div3(10)

//Named Functions
//
greeting('monika');
function greeting(msg)
{
    console.log('hello',msg)
}


//
greet ('Dinga')
var greet = function(msg)
{
    console.log('Hi',msg);
}




//
greets = ('dingi');
var greets = (msg) =>
{
    console.log('haii',msg)
}



