/*
 * 작성일:2023.09.08
 * 작성자:여진승 201995052
 * 설명:
 */
abstract class myAnimal {
//추상 메소드: 동물의 소리를 변환하는 메솓,
	abstract class String sound();
	
// 일반 메소드 : 동물의 기본 정보를 츨력하는 메소드
	void displayInfo O() {
		System.out.println("동물의 울음소리입니다");
	}
}

class myCAT extends myAnimal{
	
}


package animaltest;

public class Animaltest {
	public static void main(String[] args) {
		myAnimal cat = new myCat();
	}
}
