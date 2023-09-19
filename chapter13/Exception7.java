
package chapter13;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * 나이를 입력 받아 출력하시오.
 * 입력받은 나이가 정수가 아닌 경우 예외 처리하시오
 */
public class Exception7 {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		System.out.println("나이를 입력해 하세요:");
		int age = 0;
	try {
	  age = stdIn.nextInt();
	} catch (InputMismatchException e) {
		//e.printStackTrace();
		System.out.print("나이는 정수로 입력하세요.");
	}
	
		System.out.println("당신의 나이는"+age+"세입니다");
	}
	}

