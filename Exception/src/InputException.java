import java.util.InputMismatchException;
import java.util.Scanner;

public class InputException {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int sum = 0, n;
		System.out.println("3���� ������ �Է��ϼ���.");
		for(int i = 0; i < 3; i++)
		{
			System.out.print(i + ">>");
			try {
				n = scn.nextInt();
			}catch (InputMismatchException e) {
				System.out.println("������ �Է��ϼ���");
				scn.next();
				i--;
				continue;
			}
			sum += n;
		}
		System.out.print("�� =" + sum);
		scn.close();
	}
}
