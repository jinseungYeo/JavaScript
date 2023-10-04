const bttn  = document.querySelector("button");
//const btn = document.querySelector("#toggle-box button")
bttn.onclick = () => { //버튼을 누르면
    document.body.classList.toggle("dark");//문서 바디에 dark 스타일을 적용하라
} 