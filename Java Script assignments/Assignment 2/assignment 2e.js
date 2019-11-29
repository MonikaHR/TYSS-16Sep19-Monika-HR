var flag = 0;
function prime(no)
{
for (var i=2; i<no; i++)
{
if(no % i == 0)
{
flag = 1;
}
}
if(flag === 1)
{
console.log(no+"no is not prime");
}
else
console.log(no+'no is prime');
}
 prime(5);


console.log('==================================')
var flag = 0;
var prime =  function (no)
{
for (var i=2; i<no; i++)
{
if(no % i == 0)
{
flag = 1;
}
}
if(flag === 1)
{
console.log(no+"no is not prime");
}
else
console.log(no+'no is prime');
}
 prime(8);


console.log('==================================')
 var flag = 0;
(function (no)
{
for (var i=2; i<no; i++)
{
if(no % i == 0)
{
flag = 1;
}
}
if(flag === 1)
{
console.log(no+"no is not prime");
}
else
console.log(no+'no is prime');
}) (6);


console.log('==================================')
var flag = 0;
var prime = no =>
{
for (var i=2; i<no; i++)
{
if(no % i == 0)
{
flag = 1;
}
}
if(flag === 1)
{
console.log(no+"no is not prime");
}
else
console.log(no+'no is prime');
}
 prime(11);

