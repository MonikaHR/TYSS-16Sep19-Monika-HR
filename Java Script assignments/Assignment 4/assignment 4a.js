const fruits = ['Apple','Mango','Grapes','Banana','Orange'];
console.log(typeof fruits);
const isArrayOrNot = Array.isArray(fruits);
console.log('fruits array or not',isArrayOrNot)
const hasMango = fruits.includes('Mango')
fruits.push('Pineapple','Pomegranate')
console.log('After push method',fruits)
fruits.pop()
console.log('After pop method',fruits)
fruits.unshift('Strawberry','jackfruit')
console.log('After unshift method',fruits)
fruits.shift()
console.log('After shift method',fruits)


const fruits1 = ['Apple','Mango','Grapes','Banana','Orange'];
fruits1.splice(1,0,'Guava','watermelon')
console.log('After Splice method',fruits1)
const afterslice = fruits1.slice(2,4)
console.log('After Slice method',fruits1)
console.log('After Slice method',afterslice)
const indexOfBanana = fruits1.indexOf('Banana',1)
console.log('Index of Banana',indexOfBanana)
const stringfruits = fruits1.join('-')
console.log(stringfruits)

const numbers = [350,400,450,500]
const nums1 = numbers.map(function(value,index)
{
    let newValue = value + 50
    return newValue
})
console.log('After map method',nums1)

const nums2 = numbers.map(value => value+50)
console.log('After Map arrow function',nums2)

const nums3 = numbers.filter(function(value,index){
    if(value > 200){
        return true
    } else {
        return false
    }
})
console.log('After filters method',nums3)

const nums4 = numbers.filter(value => value>400)
console.log('After filter arrow method',nums4)


console.log('=====================================================')
const cars = ['BMW','Benz','Lamborgini','Fortuner','Honda']
console.log(typeof cars)
const isArrays = Array.isArray(cars)
console.log('cars array or not',isArrays)
const hasLamborgini = cars.includes('Audi')
console.log('After includes method', hasLamborgini)
cars.push('audi','jagvar')
console.log('After push method',cars)
cars.pop()
console.log('After pop method',cars)
cars.unshift('Audi','Maruti800')
console.log('After unshift method',cars)
cars.shift()
console.log('After shift method',cars)

const cars1 = ['BMW','Benz','Lamborgini','Fortuner','Honda']
cars1.splice(2,0,'Inova','Shiftdesire')
console.log('After Splice method',cars1)
const aterslice = cars1.slice(1,2)
console.log('After Slice method',cars1)
console.log('After Slice method',afterslice)
const IndexofHonda = cars1.indexOf('Honda',1)
console.log('Index of Honda',IndexofHonda)
const stringcars1 = cars1.join('--')
console.log(stringcars1)

const nums = [05,50,60,89]
const numss1 = nums.map(function(value,index)
{
    let newValue = value + 10
    return newValue
})
console.log('After map method',numss1)

const numss2 = nums.map(value => value+50)
console.log('After Map arrow function',numss2)

const numss3 = nums.filter(function(value,index){
    if(value > 50){
        return true
    } else {
        return false
    }
})
console.log('After filters method',numss3)

const numss4 = nums.filter(value => value>200)
console.log('After filter arrow method',numss4)


console.log('=====================================================')
const colors = ['Red','Green','Blue','Pink','Perple']
console.log(typeof colors)
const isArrayy = Array.isArray(colors)
console.log('colors array or not',isArrayy)
const hasGreen = colors.includes('Green')
console.log('After includes method', hasGreen)
colors.push('Violet','Brown')
console.log('After push method',colors)
colors.pop()
console.log('After pop method',colors)
colors.unshift('Darkpink','Black')
console.log('After unshift method',colors)
colors.shift()
console.log('After shift method',colors)

const colors1 = ['Red','Green','Blue','Pink','perple']
colors1.splice(1,0,'Grey','White')
console.log('After Splice method',colors1)
const afterslicee = colors1.slice(2,4)
console.log('After Slice method',colors1)
console.log('After Slice method',afterslicee)
const indexOfPerple = colors1.indexOf('Perple')
console.log('Index of Perple',indexOfPerple)
const stringColors = colors1.join(':')
console.log(stringColors)


const integers = [22,33,44,55]
const numss = integers.map(function(value,index)
{
    let newValue = value + 50
    return newValue
})
console.log('After map method',numss)

const numsss = integers.map(value => value+50)
console.log('After Map arrow function',numsss)

const numssss = integers.filter(function(value,index){
    if(value > 44){
        return true
    } else {
        return false
    }
})
console.log('After filters method',numssss)

const numsssss = integers.filter(value => value>44)
console.log('After filter arrow method',numsssss)


console.log('=======================================')
const names = ['Monika','Nishu','Nesara','Mamatha','Pooja'];
console.log(typeof names);
const isArray2 = Array.isArray(names);
console.log('Names array or not',isArray2)
const hasPooja = names.includes('Pooja')
names.push('Kavitha','Rashmi')
console.log('After push method',names)
names.pop()
console.log('After pop method',names)
names.unshift('Navya','Bhakthi')
console.log('After unshift method',names)
names.shift()
console.log('After shift method',names)

const names1 = ['Monika','Nishu','Nesara','Mamatha','Pooja'];
names1.splice(2,0,'Manju','Rohith')
console.log('After Splice method',names1)
const afterslices = names1.slice(2,4)
console.log('After Slice method',names1)
console.log('After Slice method',afterslices)
const indexOfMamatha = names1.indexOf('Mamatha',2)
console.log('Index of Mamatha',indexOfMamatha)
const stringNames = names1.join('-:')
console.log(stringNames)


const valuee = [2000,4000,5000,7000]
const value1 = valuee.map(function(value,index)
{
    let newValue = value + 50
    return newValue
})
console.log('After map method',value1)

const value2 = valuee.map(value => value+50)
console.log('After Map arrow function',value2)

const value3 = valuee.filter(function(value,index){
    if(value > 1000){
        return true
    } else {
        return false
    }
})
console.log('After filters method',value3)

const value4 = valuee.filter(value => value>1000)
console.log('After filter arrow method',value4)


console.log('==================================================================')
const items = ['Kajal','Lipstick','Shoes','Cloths','Bangles'];
console.log(typeof items);
const isArray5 = Array.isArray(items);
console.log('Hobbies array or not',isArray5)
const hasBangles = items.includes('Bangles')
items.push('Bracelates','Earrings')
console.log('After push method',items)
items.pop()
console.log('After pop method',items)
items.unshift('Watch','Trimmer')
console.log('After unshift method',items)
items.shift()
console.log('After shift method',items)

const items1 = ['Kajal','Lipstick','Shoes','Cloths','Bangles'];
items1.splice(1,0,'Bags','Pen')
console.log('After Splice method',items1)
const afterslice3 = items1.slice(2,4)
console.log('After Slice method',items1)
console.log('After Slice method',afterslice3)
const indexOfShoes = items1.indexOf('Shoes',1)
console.log('Index of Shoes',indexOfShoes)
const stringItems = items1.join('-*')
console.log(stringItems)

const lvalue = [567,456,789,986]
const lvalue1 = lvalue.map(function(value,index)
{
    let newValue = value + 50
    return newValue
})
console.log('After map method',lvalue1)

const lvalue2 = lvalue.map(value => value+50)
console.log('After Map arrow function',lvalue2)

const lvalue3 = lvalue.filter(function(value,index){
    if(value > 200){
        return true
    } else {
        return false
    }
})
console.log('After filters method', lvalue3)

const lvalue4 = lvalue.filter(value => value>200)
console.log('After filter arrow method',lvalue4)


console.log('===================================================')












