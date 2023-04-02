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
*/
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