function Book(title, price) {
    // 프로퍼티 초기화
    this.title = title;
    this.price = price;
}

Book.prototype.buy = function() {
    console.log(`${this.title}을 ${this.price}원에 구매했습니다`);
}

const book1 = new Book("JAVA", 10000);
book1.buy();

function Textbook(title, price, major){
    // 기존 생성자 함수 (Book)의 프로퍼티 초기화
    Book.call(this, title, price);
    this.major = major; // 새로운 프로퍼티 정의
}

Textbook.prototype = Object.create(Book.prototype); // 프로토타입 상속

Textbook.prototype.buyTextbook = function(){
    console.log(`${this.major} 전공 서적, ${this.title}을 구매했습니다`);
}

const book2 = new Textbook("알고리즘", 25000, "컴퓨터공학");
book2.buyTextbook();
book2.buy();