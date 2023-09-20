function multiple(num1,num2){
   // let gop = num1*num2
    //return num1 * gop
;

   return num1*num2;//함수를 호출한 곳으로 돌려줌.
}

//사용자로부터 정수 입력 받기
let number1 =parseInt(prompt("첫번쨰 수 입력하시오"))
let number2 = parseInt(prompt("두번째 수를 입력하시오"))

//함수 호출.
//인수 값을 가지고 호출




//입력 받은 수를 인수로 함수 호출
document.write(`<h1>1부터 ${number1}과${number2}까지 곱은 ${multiple(number1,number2)}입니다.</h1>`);
