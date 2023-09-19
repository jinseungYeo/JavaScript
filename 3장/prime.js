// 소수 판단 스크립트
// 정수를 입력 받는다. 프롬포트
// 소수는 1을 제외한 자기 자신으로 나누어 떨어지는수.
// 나누어 떨어진다 = 나머지가 0이다.

const number = parseInt(prompt("자연수를 입력하세요."));
let isPrime = true;

if (number === 1){
    document.write(`${number}은 소수도 합성수도 아닙니다.`);
} else if (number === 2){
    isPrime = true;
} else {//1,2가 아닌 나머지값을 입력하면
    for (let i = 2; i < number; i++){//입력받은수까지 반복하면서
        if (number % i === 0){
            isPrime = false;
            break;// 나머지가 0 이면 반복을 멈춘다
        }
    }
}

if (isPrime){
    document.write(`${number}는 소수입니다.`);
} else {
    document.write(`${number}는 소수가 아닙니다.`);
}