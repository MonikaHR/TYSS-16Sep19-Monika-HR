const hobbies1 = ['Sleeping','Cricket','Eating','Coding','Roaming'];
console.log(typeof hobbies1);
const isArrayOrNot = Array.isArray(hobbies1);
console.log('Hobbies array or not',isArrayOrNot)
const hasCricket = hobbies1.includes('cricket')
hobbies1.push('Guitar','Volleyball')
console.log('After push method',hobbies1)
hobbies1.pop()
console.log('After pop method',hobbies1)
hobbies1.unshift('Numismatics','Singing')
console.log('After unshift method',hobbies1)
hobbies1.shift()
console.log('After shift method',hobbies1)


const hobbies2 = ['Sleeping','Cricket','Eating','Coding','Roaming'];
hobbies2.splice(1,2,'BirdWatching')
console.log('After Splice method',hobbies2)
const afterslice = hobbies2.slice(2,4)           
console.log('After Slice method',afterslice)
const indexOfCoding = hobbies2.indexOf('coding',1)
console.log('Index of Coding',indexOfCoding)
const stringHobbies = hobbies2.join('-')
console.log(stringHobbies)


const numbers = [100,200,300,400]
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

const nums4 = numbers.filter(value => value>200)
console.log('After filter arrow method',nums4)

