package chapter13;


import java.util.Scanner;
import java.util.InputMismatchException;

public class ExceptionTset03 {

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        try {
            System.out.print("첫 번째 수 입력 : ");
            int num1 = Integer.parseInt(stdin.next());

            System.out.print("두 번째 수 입력 : ");
            int num2 = stdin.nextInt();

            System.out.println(num1 / num2);
        } catch (NumberFormatException e) {
            System.out.println("첫 번째 수는 숫자만 입력하시오.");
        } catch (InputMismatchException e) {
            System.out.println("두 번째 수는 숫자만 입력하시오.");
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다.");
            System.out.println("해당 예외: " + e);
        } catch (Exception e) {
            System.out.println("예외가 발생했습니다");
        } finally {
            System.out.println("프로그램 종료");
        }

        stdin.close(); 
    }
}
