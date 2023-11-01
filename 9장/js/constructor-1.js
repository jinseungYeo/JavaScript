// 생성자 함수 정의하기(만들기)
function Book(title, page, done = false) {
    this.title = title;
    this.page = page;
    this.done = done;
    this.finish = function () {
        return this.done ? '완독' : '읽는중';
    }
}

// 생성자 함수를 사용하여 객체 만들기
const book1 = new Book("모던 자바스크립트", 650, false);
const book2 = new Book("JAVA", 650, true);

document.write(`<h2>생성자 함수로 객체 만들기</h2>`);
document.write(`${book1.title}, ${book1.page}, ${book1.finish()}<br>`);
document.write(`${book2.title}, ${book2.page}, ${book2.finish()}<br>`);

// 클래스 만들기
class Book2 {
    constructor(title, page, done = false) {
        this.title = title;
        this.page = page;
        this.done = done;
    }

    finish() {
        return this.done ? '완독' : '읽는중';
    }
}

const book3 = new Book2("모던 자바스크립트", 650, false);
const book4 = new Book2("JAVA", 650, true);

document.write(`<hr><h2>클래스로 객체 만들기</h2>`);
document.write(`${book3.title}, ${book3.page}, ${book3.finish()}<br>`);
document.write(`${book4.title}, ${book4.page}, ${book4.finish()}<br>`);
