package review;

import java.util.Scanner;

public class whileReview {

	public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	int count = 0,n;
	double sum = 0;
	System.out.println("정수를 입력하고 마지막에 0을 입력하세요.");
	
	while((n = scn.nextInt()) != 0) {
		sum += n;
		count++;
	}
	System.out.println("입력한 정수의 개수는" + count + "입니다.");
	System.out.println("입력한 정수의 평균은" + (sum/count) + "입니다.");
	scn.close();
	}
}
