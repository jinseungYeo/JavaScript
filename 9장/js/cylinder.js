//생성자 함수 만들기
function Cylinder(cylinderDiameter,cylinderheight){
    this.diameter = cylinderDiameter;
    this.height = cylinderheight;

    this.getVolume = function(){
        let radius = this.diameter /2;
        return (Math.PI*radius*radius*this.height).toFixed(2);

    };
}

const button = document.querySelector("button");
const result = document.querySelector("#result");

button.addEventListener("click",function(event){
    event.preventDefault();
    const diameter = document.querySelector("#cyl-diameter").value;
    const height = document.querySelector("#cyl-height").value;

    if(diameter === "" || height ===""){
        result.innerText = `지름값과 높잇값을 입력하세요`;
    }
    else{
        let cylinder = new Cylinder(parseInt(diameter),parseInt(height));
        result.innerText = `원기둥의 부피는 ${cylinder.getVolume()}입니다`;
    }
});