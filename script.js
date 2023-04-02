/*var hour=new Date();
var time=hour.getHours();
if(time>=0&&time<=13 ){
    console.log("good morning");

} 
else if(time >13&&time<=17){
    console.log("good afternoon");
}else if(time >17 && time<=24){
    console.log("good evening");
}else{
    console.log("invalid input");
}
*/


/*
var a=600000;

switch(true){
    case ((a>5000) && (a<10000)):
        console.log("To buy basic Mobible");
        break;
    case ((a>=10000) && (a<60000)):
        console.log("To buy Anroid Mobible");
        break;
    case (a>=60000):
        console.log("To buy iphone Mobible");
        break;
    default:
        console.log("You can't buy a mobile phone");
        
            
}

*/

/*

function createPerson(name){
    return {
        greeting:function(){
            let msg=`my name is ${name}`;
            console.log(msg);
        }
    };
}

var ajith=createPerson("ajith");
ajith.greeting();
*/
/*
function person(name){
    this.name=name;
    this.greet=function(){
        console.log(`ajith kumar is like that ${this.name}`);
    }
}
const Person1=new person("gopi");
Person1.greet();


const vegtables=[
    {id:1,name:"tomoto",quantity:"1kg"},
    {id:2,name:"cucumber",quantity:"1/5kg"},
    {id:3,name:"carrot",quantity:"3kg"},
    {id:4,name:"poteto",quantity:"2kg"},
    {id:5,name:"beens",quantity:"3kg"},
    
];


var result=vegtables.find((name)=> name.id=="4");

console.log(result);

const a=[1,2,3,4];
const b=[5,6,7,8,99,0];

const result=a.concat(b);
const result1=[...a,...b]

console.log(result1);

const daily=["wakeup","eat","routine"];


for(let index in daily) {
    console.log(daily[index]);
}
daily.forEach(function(routine){
    console.log(routine);
})
const s=[2,4,7,9,1];

s.sort(function(a,b){
    return b-a;
});
console.log(s);


let products=[
    {id:1,title:"Android",cost:7500},
    {id:2,title:"Gaming computer",cost:99500},
    {id:3,title:"Iphone",cost:76500},
    {id:4,title:"Headphone",cost:1500},
];

//lowest price
let lowestprice=products.sort(function(a,b){
    return a.cost-b.cost;

});
console.log(lowestprice);
//title asending

let title=products.sort(function(a,b){
    if(a.title<b.title){
        return -1;
    }
    else if(a.title>b.title){
        return 1;
    }
    return 0;

});
console.log(title);
//filter products less than 8000

let filter=products.filter((item)=>item.cost<8000);
console.log(filter);
//map 
let map=products.map((item)=>item.title+"-"+item.cost);
console.log(map);


const s=[34,65,12,7,987,100];
let sum=0;

for(let value of s){
    sum=value+sum;
}
console.log(sum);

for(let value in s){
    console.log(s[value]);
}

let total=s.reduce((prev,curr)=>prev+curr)
console.log(total);

const s=[34,65,12,7,987,100];
let result=s.sort();
console.log(result);
let result1=s.sort((a,b)=>a-b);
console.log(result1);
*/


//1 array objectv create

const ab1=[{id:1,name:"ajith"},
{id:2,name:"kumar"}, 
{id:3,name:"anbu"}];
console.log(ab1);

let ab2=[];
ab2[0]={id:1,name:"ajith"};
ab2[1]={id:1,name:"ajith"};
ab2[2]={id:3,name:"anbu"};
console.log(ab2);

let ab3=new Array("hello");
console.log(ab3);
let ab4=Array.of("ajith","anbu")
console.log(ab4);

//2 copy
let array=[1,2,3,4,5];
let array2=array.slice();
console.log(array2);

let array3=[];
for(let i=0;i<array.length;i++){
    array3[i]=array[i];
}
console.log(array3);

//3 empty array
array=[];
//array.length=0;
//splice

console.log(array);
//4 type of array


const a=[1,2,3,4];
console.log(typeof a);
//5
console.log(Array.isArray(a));

//6
a.push(55);
console.log(a);
//9
var items=["milk","bread","sugar"]

console.log(items.includes("milk"));

for(let i=0;i<items.length;i++){
    if(items[i]=="milk"){
        console.log("Item is in your list");
        break;
    }else{
        console.log("item doesn't exists");
    }
}

function check(item){
    if(items.indexOf(item)==-1){
        console.log("Item is in your list");
    }else{
        console.log("item doesn't exists");
    }
}
check("milk")

//10
console.log(items.indexOf("milk"));

//console.log(items.splice(1,3));
items.shift()
console.log(items);


//18 flat

var aaa=[1,[2,3],4,5,[3,4,5,6]];

console.log(aaa.flat());

