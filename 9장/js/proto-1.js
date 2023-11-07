//함수 밖에서 프로토 타입을 사용해 함수의 메서드를 정의함
//프로퍼티는 함수 안에, 메서즈는 프로토 타입을 사용해 정의함.
function newBook(title, page, done){
    this.title = title;
    this.page = page;
    this.done = done;
}

newBook.prototype.finish = function () {
    let str;
    this.done === false ? (str = `읽는중`) : (str = `완독`) ;
    return str;
}

const nbook1 = new newBook("자바스크립트", 650, false);
const nbook2 = new newBook("JAVA", 750, false);
