package operator;

import java.util.Scanner;

public class Conditional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a,b;
		System.out.print("첫 번쨰 정수 :");
		a = sc.nextInt();
		System.out.print("두 번째 정수 :");
		b = sc.nextInt();
		
		System.out.printf("(%d < %d)?1 : 2 => %d",a, b, ((a<b)?1:2));
		//삼항 연산자  ?: => (조건식)?true:false
		sc.close();
	}

}
