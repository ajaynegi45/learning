"use strict";

// 48679 streaks     30026


// Distraction is the death of the art but boredom is the birthplace of it

/*

TODO: Array
indexing start from 0
array use shallow copy
Javascript array are resizeable and contain mix types of different data types
*/

// There are two type by which we can use array
const arr1 = [1,2,3,4,5,6,7,8,9];
const arr = new Array(1,2,3,4,5,6,7,8,9,);

arr1.push(34) // add new value at last
arr1.pop() // simply remove last element from array
arr1.unshift(647) // add item into 1st place
arr1.shift() // remove 1st element


arr1.includes(7) // check whether the pass element present in list or not
arr1.indexOf(2)  // find the index of pass value

const arr2 = arr1.join() // convert array into string

const twoArr = [...arr,...arr1] // Join two or more array into Single array
console.log(twoArr)

console.log(arr1) // Print all elements in arr1


console.log(Array.isArray(arr1)) // check whether it is array or not
console.log(Array.from("AJAY NEGI")) // Make array with pass value

// Spice slice important Topic in Array




// TODO: CONTROL FLOW
const userEmail = []

if (userEmail) {
    console.log("Got user email");
} else {
    console.log("Don't have user email");
}

// falsy values

// false, 0, -0, BigInt 0n, "", null, undefined, NaN

//truthy values
// "0", 'false', " ", [], {}, function(){}

// if (userEmail.length === 0) {
//     console.log("Array is empty");
// }

const emptyObj = {}

if (Object.keys(emptyObj).length === 0) {
    console.log("Object is empty");
}

// Nullish Coalescing Operator (??): null undefined

let val1;
// val1 = 5 ?? 10
// val1 = null ?? 10
// val1 = undefined ?? 15
val1 = null ?? 10 ?? 20



console.log(val1);

// Terniary Operator

// condition ? true : false

const iceTeaPrice = 100
iceTeaPrice <= 80 ? console.log("less than 80") : console.log("more than 80")


















//TODO: Object

// we can create object by two ways Constructor and Literals
// constructor follow singleton rules and literals don't follow singleton it makes new copy

// Constructor Object

const consObject = new Object();
// Provide Singleton feature baaki everything same as literals object

// literals Object
const sys = Symbol("Gyan Sagar Public School");

const userObject = {
    name: "Ajay Negi", // internally both key and Value saved in string format like "name" : "Ajay Negi"
    [sys] : "Bhartiyam Public School",
    age : 19,
    lastLoggedIn : ["Monday","Tuesday","Friday"]
}

// we can access them using dot
console.log(userObject.name); // but this is wrong approach

console.log(userObject["name"]) // this is the Correct approach
console.log(userObject[sys]) // this is the Correct approach
console.log(userObject["age"]) // this is the Correct approach
console.log(userObject["lastLoggedIn"]) // this is the Correct approach

// Override any value
userObject.name = "Harsh Negi";


userObject.greeting = function () {
    console.log(`Hello ${this.name}`);
}

console.log(userObject.greeting())

Object.freeze(userObject) // Now you freeze your object from overriding

console.log(userObject)



// Object inside Object
const userObj = {
    fullName: {
        userFullName: {
            firstName : "Ajay",
            lastName: "Negi"
        }
    }
}

console.log(userObj.fullName?.userFullName.firstName); // ? use for protecting. what is fullName is not exist

// (1+1==2) ? "Pass" : "Fail"


// join two or more Object in one Object
const newObject = Object.assign({},userObject,userObj); // here empty curly bracket is for

console.log(newObject)

// more easy way is
const newObj = {...userObj,...userObject};
console.log(newObj);


console.log(Object.keys(userObject));
console.log(Object.values(userObject));

console.log(userObject.hasOwnProperty("name"))

// https://api.github.com/users/ajaynegi45













// TODO: FUNCTION

function myName() {
    console.log("Ajay Negi");
}
myName();

// Creating a function with input value is parameter and when passing those value at the time of calling is called arguments

// Here ... is rest operator, but sometimes it called as spread operator.
function firstName(...name) {
    return name;
}
console.log(firstName("Ajay Negi","Aman Singh","Abhishek Kumar","Abhinav"))


// Passing an object into Function
const user = {  // Object which we are going to pass
    username: "hitesh",
    prices: 199
}
function handleObject(anyobject){  // Function which is going to take an object input
    console.log(`Username is ${anyobject.username} and price is ${anyobject.price}`);
}

// handleObject(user) "Directly passing object into function"
handleObject({
    username: "sam",
    price: 399
})


// Passing array into function
const myNewArray = [200, 400, 100, 600]
function returnSecondValue(getArray){
    return getArray[1]
}
console.log(returnSecondValue(myNewArray));

// Directly passing array into function
console.log(returnSecondValue([200, 400, 500, 1000]));



const myFunction= function (num) { // This is another way of using function using this is called expression
    return num + num;
}

console.log(myFunction(20))












//TODO: Arrow function and this
function chai1(){
    console.log("chai1: ")
    console.log(this) //undefined
}












//
// const chai = () =>{
//     console.log(this)
// }
//
// chai();
chai1()
//
// console.log(this)


// function Implicit return in arrow function

// There are two ways to use arrow function
const fun = (num1, num2) => num1 + num2
const fun1 = (num1, num2) => (num1 + num2)
console.log(fun(34,45));

/*
    " Internal working of above code is:  "
    const fun = function (num1 , num2) => {
        return num1 + num2;
    }
    console.log(fun(34,45));
*/











// TODO: IIFE (Immediately Invoked Function Expression) is a function that is called immediately after it is defined.
// ()(); "first () is for code. () second is invoked, here we can pass the argument and ; is use to stop the process   "

(
    function () {
        console.log("DB CONNECTED")
    }
)();










// TODO: Control flow or logical flow

let temperature = 12;
if(temperature>10){
    console.log(`temperature: ${temperature}`);
}

if(temperature>10) console.log(`temperature: ${temperature}`);













//TODO: for of

// ["", "", ""]
// [{}, {}, {}]

const arr12 = [1, 2, 3, 4, 5]

for (const num of arr) {
    //console.log(num);
}

const greetings = "Hello world!"
for (const greet of greetings) {
    //console.log(`Each char is ${greet}`)
}





//TODO: MAP
const map = new Map()
map.set('IN', "India")
map.set('USA', "United States of America")
map.set('Fr', "France")
map.set('IN', "India")

// console.log(map);

for (const [key, value] of map) {
    // console.log(key, ':-', value);
}

const myObject = {
    game1: 'NFS',
    game2: 'Spiderman'
}

// for (const [key, value] of myObject) {
//     console.log(key, ':-', value);

// }





//TODO: forEach
const coding = ["js", "ruby", "java", "python", "cpp"]

// coding.forEach( function (val){
//     console.log(val);
// } )

// coding.forEach( (item) => {
//     console.log(item);
// } )

// function printMe(item){
//     console.log(item);
// }

// coding.forEach(printMe)

// coding.forEach( (item, index, arr)=> {
//     console.log(item, index, arr);
// } )

const myCoding = [
    {
        languageName: "javascript",
        languageFileName: "js"
    },
    {
        languageName: "java",
        languageFileName: "java"
    },
    {
        languageName: "python",
        languageFileName: "py"
    },
]

myCoding.forEach( (item) => {

    console.log(item.languageName);
} )






//TODO: Filter
// const coding = ["js", "ruby", "java", "python", "cpp"]

// const values = coding.forEach( (item) => {
//     //console.log(item);
//     return item
// } )

// console.log(values);

const myNums = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

// const newNums = myNums.filter( (num) => {
//     return num > 4
// } )

// const newNums = []

// myNums.forEach( (num) => {
//     if (num > 4) {
//         newNums.push(num)
//     }
// } )

// console.log(newNums);


const books = [
    { title: 'Book One',    genre: 'Fiction',       publish: 1981,   edition: 2004 },
    { title: 'Book Two',    genre: 'Non-Fiction',   publish: 1992,   edition: 2008 },
    { title: 'Book Three',  genre: 'History',       publish: 1999,   edition: 2007 },
    { title: 'Book Four',   genre: 'Non-Fiction',   publish: 1989,   edition: 2010 },
    { title: 'Book Five',   genre: 'Science',       publish: 2009,   edition: 2014 },
    { title: 'Book Six',    genre: 'Fiction',       publish: 1987,   edition: 2010 },
    { title: 'Book Seven',  genre: 'History',       publish: 1986,   edition: 1996 },
    { title: 'Book Eight',  genre: 'Science',       publish: 2011,   edition: 2016 },
    { title: 'Book Nine',   genre: 'Non-Fiction',   publish: 1981,   edition: 1989 },
];

let userBooks = books.filter( (bk) => bk.genre === 'History')


userBooks = books.filter( (bk) => {
    return bk.publish >= 1995 && bk.genre === "History"
})
console.log(userBooks);






const myNumers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

// const newNums = myNumers.map( (num) => { return num + 10})

const newNums = myNumers
    .map((num) => num * 10 )
    .map( (num) => num + 1)
    .filter( (num) => num >= 40)

console.log(newNums);






// TODO: DOM

/*
h1.innerHTML  // It provide all details with inner code and text.
h1.innerText  // It only provide visible text
h1.textContent // It provide all text with is hide or visible with code
*/

document.querySelector('h2') // It provide 1st h1 tag
document.querySelector('#id') // It is for id
document.querySelector('.className') // IT is for class
document.querySelector('input[type="password"]') // to select input


// To create a div element
const div = document.createElement('div');
div.className = "divClass";
div.id = "divId";
div.setAttribute("title","divTitle");
div.style.backgroundColor = "red";

// Add text in div element first way
div.innerText = "Add your Text";

// Add text in div element second way
const addText = document.createTextNode("Add your Text");
div.appendChild(addText);

// It will append it to the main code and div will show in page
document.body.appendChild(div)















function addLanguage(langName){
    const li = document.createElement('li');
    li.innerHTML = `${langName}`
    document.querySelector('.language').appendChild(li)
}
addLanguage("python")
addLanguage("typescript")

function addOptiLanguage(langName){
    const li = document.createElement('li');
    li.appendChild(document.createTextNode(langName))
    document.querySelector('.language').appendChild(li)
}
addOptiLanguage('golang')

// Edit the content
const secondLang = document.querySelector("li:nth-child(2)")
console.log(secondLang);
//secondLang.innerHTML = "Mojo"
const newli = document.createElement('li')
newli.textContent = "Mojo"
secondLang.replaceWith(newli)

//edit
const firstLang = document.querySelector("li:first-child")
firstLang.outerHTML = '<li>TypeScript</li>'

//remove
const lastLang = document.querySelector('li:last-child')
lastLang.remove()
















