import java.util.Scanner;

public class CtrlWhile01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("���� ���� : ");
		int n = sc.nextInt();
		
		int i = 0;
		while(i<=n) {
			System.out.println(i);
			i++;
		}
		
	}

}
