function showData(name,age){
    alert(`안녕하세요? ${name}님.나이가 ${age}살이군요.`);
}


function getData(callback) {
let username = prompt("이름을 입력하세요.");
let userage = prompt("나이를 입력하세요.") ;
callback(username,userage);
}
getData(showData)