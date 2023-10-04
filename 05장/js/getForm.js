//선택 목록을 가져와 selectmenu로 저장.
const selectmenu = document.querySelector("#major");
selectmenu.onchange = () =>{
        //selcetIndex로 선택한 인덱스 번호를 가져와 요소 내용을 변수에 저장
     let selectText = selectmenu.options[selectmenu.selectedIndex].innerText;
     alert(`[${selectText}]를 선택하셨습니다`);
}