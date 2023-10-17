//버튼요소 가져오기
const orderBtn = document.querySelector("#order");
//주문 정보 역역 가져오기
const orderInfo = document.querySelector("#orderInfo");
//책제목 요소 가져오기
const title = document.querySelector("h2"); //("#container > h2");
//버튼을 클릭하면
orderBtn,addEventListener("click",() =>{
//새로운 p 요소 만들기
let newP=document.createElement("p")
//새로운 텍스트 만들기 - title의 텍스트 부분만 가지고 와서 텍스트 노드로 생성
let textNode = document.createTextNode(title.innerText);

//텍스트 노드를 p요소로 추가
newP.appendChild(textNode);
//p 요소를 orderInfo 영역에 추가
newP.style.fontSize="0.8";
newP.style.clolor="blue";
orderInfo.appendChild(newP);



});{once : true};
