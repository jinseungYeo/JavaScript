let mul = (a, b) => a * b;

let num1 = parseInt(prompt("첫 번째 수를 입력하시오"));
let num2 = parseInt(prompt("두 번째 수를 입력하시오"));

let result = mul(num1, num2);

document.write(`<h1>${num1}*${num2}=${result}입니다.</h1>`);
