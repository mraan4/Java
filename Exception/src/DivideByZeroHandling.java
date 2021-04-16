import java.util.Scanner;

public class DivideByZeroHandling {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int dividend, divisor;
		
		System.out.print("나뉨수 입력 : ");
		dividend = scn.nextInt();
		System.out.print("나눔수 입력 : ");
		divisor = scn.nextInt();
		try {
		System.out.println(dividend + "를 " + divisor + "로 나누면 몫은 " + dividend/divisor + "입니다.");
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		}
		finally {
		scn.close();
		}
	}
}
