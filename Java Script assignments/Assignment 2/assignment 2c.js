function circum(radius)
{
    circumference = 2*Math.PI*radius;
    console.log('circumference of a circle is='+circumference);
}
circum(4);
 
console.log('=========================')
var circum = function(radius)
    {
        circumference = 2*Math.PI*radius;
        console.log('circumference of a circle is='+circumference);
    }
    circum(7);
     

console.log('=========================');
(function(radius)
          {
              circumference = 2*Math.PI*radius;
              console.log('circumference of a circle is='+circumference);
          })
          (2);


console.log('=========================')
var circum = (radius) =>
          {
              circumference = 2*Math.PI*radius;
              console.log('circumference of a circle is='+circumference);
          }
          circum(8);
           
  