 var v1 = 0;
 var v2 = 1;
 var v3;
function fib(no)
 {
 for(var i=0; i<=no; i++)
 {
v3 = v1 + v2;
 v1 = v2;
v2 = v3;
console.log("fibonacci series of"+no+"is="+v3);
 }
 }
 fib(5);
           
   
console.log('===============');
var v1 = 0;
var v2 = 1;
var v3;
var   fib =  function(no)
 {
 for(var i=0; i<=no; i++)
 {
 v3 = v1 + v2;
 v1 = v2;
v2 = v3;
 console.log("fibonacci series of"+no+"is="+v3);
  }
 }
fib(7);
          
           
         
   
console.log('===============');
var v1 = 0;
var v2 = 1;
var v3;
(function(no)
 {
 for(var i=0; i<=no; i++)
 {
 v3 = v1 + v2;
 v1 = v2;
v2 = v3;
console.log("fibonacci series of"+no+"is="+v3);
  }
  }) (3);
                 
   
   
   

console.log('===============');
var v1 = 0;
    var v2 = 1;
    var v3;
    var fib = no =>
    {
    for(var i=0; i<=no; i++)
    {
        v3 = v1 + v2;
        v1 = v2;
        v2 = v3;
        
   console.log("fibonacci series of"+no+"is="+v3);
    }
   }
   fib(5);
    
   