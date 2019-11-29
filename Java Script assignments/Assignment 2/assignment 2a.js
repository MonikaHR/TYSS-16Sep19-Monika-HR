console.log('============================')    
function fact(num)
{
    var i, fact=1;
    for(i=1; i <=num; i++)
    {
        fact=fact*i;
         }
    console.log('Factorial of a Number'+num+'is='+fact);
     } fact(5);


console.log('============================')    
var fact1 = function (num1)
    {
        var i, fact=1;
        for(i=1; i<=num1;  i++)
        {
            fact=fact*i;
            
             }
        console.log('Factorial of a Number'+num1+'is='+fact);
         } 
         fact1(6);
 

console.log('============================');  
      (function (num2)
         {
             var i, fact=1;
             for(i=1; i<=num2; i++)
             {
                 fact=fact*i;
                     }
             console.log('Factorial of a Number'+num2+'is='+fact);
              } )
              (3);

console.log('============================')    
var fact2 = (num3) =>
 {
 var i, fact=1;
 for(i=1; i<=num3; i++)
{
 fact=fact*i;
  }
 console.log('Factorial of a Number'+num3+'is='+fact);
 } 
fact2(7);
      
             

