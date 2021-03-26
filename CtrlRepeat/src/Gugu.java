import java.util.Scanner;

public class Gugu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("단을 입력해주세요 : ");
		int a = 0;
		a = sc.nextInt();
		
		for(int i = 1; i <= 9; i++) {
			System.out.printf("%2d * %2d =%2d\n", a,i, a * i);
		}

	}

}
