class person{
    constructor(public name : string, public age : number){

    }
}
let person1 = new person('mikel',21)
console.log(person1);

class student extends person{
    constructor(name : string, age : number, public rollno : number){
        super(name,age);
    }
}
let student1 = new student('Monika',21,10)
console.log(student1)





