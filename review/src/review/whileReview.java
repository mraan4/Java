package review;

import java.util.Scanner;

public class whileReview {

	public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	int count = 0,n;
	double sum = 0;
	System.out.println("������ �Է��ϰ� �������� 0�� �Է��ϼ���.");
	
	while((n = scn.nextInt()) != 0) {
		sum += n;
		count++;
	}
	System.out.println("�Է��� ������ ������" + count + "�Դϴ�.");
	System.out.println("�Է��� ������ �����" + (sum/count) + "�Դϴ�.");
	scn.close();
	}
}
