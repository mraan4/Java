import java.util.Scanner;

public class TwoNumber {

	public static void main(String[] args) {
		//�� ������ �Է¹޾� ��Ģ������ ����� ����ϴ� ���α׷�

		
		Scanner sc = new Scanner(System.in);
		int a,b;
		
		System.out.print("ù ��° ���� : ");
		a = sc.nextInt();
		System.out.print("�� ��° ���� :");
		b = sc.nextInt();
		
		System.out.printf("%d + %d = %d/n", a, b, a+b);
		System.out.printf("%d - %d = %d/n", a, b, a-b);
		System.out.printf("%d * %d = %d/n", a, b, a*b);
		System.out.printf("%d / %d = %.2f/n", a, b, (double)a/b);
	}

}
