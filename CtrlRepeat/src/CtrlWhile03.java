import java.util.Scanner;

public class CtrlWhile03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = 0, n = 0, sum = 0;
		double avg;
		
		System.out.print("������ �Է����� �������� 0�� �Է��ϼ��� : ");
		
		while((n = sc.nextInt())!= 0){
		sum += n;
		cnt++;
		}
		avg = (double)sum/cnt;
		System.out.println("sum =" + sum + " average =" + avg);
	}

}
