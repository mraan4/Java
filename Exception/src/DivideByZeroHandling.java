import java.util.Scanner;

public class DivideByZeroHandling {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int dividend, divisor;
		
		System.out.print("������ �Է� : ");
		dividend = scn.nextInt();
		System.out.print("������ �Է� : ");
		divisor = scn.nextInt();
		try {
		System.out.println(dividend + "�� " + divisor + "�� ������ ���� " + dividend/divisor + "�Դϴ�.");
		} catch (ArithmeticException e) {
			System.out.println("0���� ���� �� �����ϴ�.");
		}
		finally {
		scn.close();
		}
	}
}
