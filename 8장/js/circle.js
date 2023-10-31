// 반지름을 입력받아 원의 넓이를 계산하는 함수
function calculateArea(r) {
    return (Math.PI * r ** 2).toFixed(3);
}

// 반지름을 입력받아 원의 둘레를 계산하는 함수
function calculateCircumference(r) {
    return (2 * Math.PI * r).toFixed(3);
}

// 프롬포트로부터 반지름을 입력 받음
const r = parseFloat(prompt("반지름을 입력하세요:"));

// 입력 받은 반지름을 이용하여 넓이와 둘레를 계산
const area = calculateArea(r);
const circumference = calculateCircumference(r);

// 결과를 출력
const resultElement = document.getElementById("result");
resultElement.innerText = `
반지름: ${r},
원의 넓이: ${area},
원의 둘레: ${circumference}`

