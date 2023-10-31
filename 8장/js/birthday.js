const result= document.querySelector("#result");

const firstday = new Date("2001-01-26");

const today = new Date();

let passedTime = today.getTime() - firstday.getTime();

let passedDay = Math.round(passedTime / (1000 * 60 * 60* 24));

result.innerText = passedDay;

