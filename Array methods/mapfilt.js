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
    price : 4000
},
{
    name : 'shoes',
    id : 4,
    price : 2500
}
]

const price1 = item.map(function(value,index)
{
    let newValue = value + 300
    return newValue
})
console.log('After map method',price1)

const price2 = item.map(value => value+300)
console.log('After Map arrow function',price2)

const price3 = item.filter(function(value,index){
    if(value > 1000){
        return true
    } else {
        return false
    }
})
console.log('After filters method',price3)

const price4 = item.filter(value => value>1000)
console.log('After filter arrow method',price4)


 