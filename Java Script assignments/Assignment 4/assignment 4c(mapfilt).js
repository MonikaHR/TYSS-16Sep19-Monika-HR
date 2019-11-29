const item = [ {
    name : 'Earing',
    id : 1,
    price : 5000
},
{
name : 'kajal',
id : 2,
price : 1000
},
{
    name : 'Trimmer',
    id : 3,
    price : 500
},
{
    name : 'shoes',
    id : 4,
    price : 2500
}
]
const updatedItem = item.map(function(item,index)
{
    item.price = item.price +300 
    return item
} )
console.log(updatedItem)
/* const itemsArrow = item.map((value) =>{
    value.price = value.price +300;
    return value 
}) */

const filteredItems = 
item.filter((item)=>item.price>1000)
console.log(filteredItems)

 