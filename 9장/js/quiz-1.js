//클래스 생성
class pet{
    //프로퍼티 생성.
    constructor(name,color) {
        this.name = name;
        this.color = color;

    }
    //메서드
    run(){
        document.write(`<h1>${this.color} ${this.name}가 달린다</h1>`);
    }
}
const pet1 = new pet("바둑이", "하얀");
pet1.run();



class Cat extends pet{
   constructor(name,color,breed){
    super(name,color);
    this.breed =breed;

}
viewInfo(){
    document.write(`<h1>이름 : ${this.name},품종 : ${this.breed},색깔 : ${this.color}`);
}
}
const bori = new Cat("보리","흰색","페르시안 친칠라");
bori.viewInfo();
bori.run();