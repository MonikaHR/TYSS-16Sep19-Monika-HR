let myname : string = "Monika";
console.log(myname, typeof myname);
let age = 21;
console.log(age, typeof age);
let mobilenumber : number;
console.log(mobilenumber, typeof mobilenumber);
let adress;
     adress = 'aaaaaa';
  adress =  7788888;
console.log(adress, typeof adress);

let calAge = function () : void {
    console.log('Age is 21');
}
calAge();


class person{
  constructor(public name :string, public age : number){
    
  }

}
let person1 = new person('mikel',21);
console.log(person1);

class student extends person{
  constructor(name : string, age : number, public rollno : number){
      super(name,age);
  }
}
let student1 = new student('Monika',21,10)
console.log(student1)




