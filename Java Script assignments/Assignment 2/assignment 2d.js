function sum()
{
    var array = [10,20,30,40];
  var  res = 0;
      for(var i=0; i<array.length; i++)
      {
          res = res+array[i];
         }
   console.log("total "+res) ;  
  } sum();


console.log('================================')
var sum = function()
{
    var array = [10,20,30,40];
  var  res = 0;
      for(var i=0; i<array.length; i++)
      {
          res = res+array[i];
         }
   console.log("total "+res) ;  
  }
   sum();


console.log('================================');
(function()
{
    var array = [10,20,30,40];
  var  res = 0;
      for(var i=0; i<array.length; i++)
      {
          res = res+array[i];
         }
   console.log("total "+res) ;  
  }) ();


console.log('================================')
var sum = () =>
{
    var array = [10,20,30,40];
  var  res = 0;
      for(var i=0; i<array.length; i++)
      {
          res = res+array[i];
         }
   console.log("total "+res) ;  
  } 
 sum();

