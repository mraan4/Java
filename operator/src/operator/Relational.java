package operator;

import java.util.Scanner;

public class Relational {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int a,b;
		System.out.print("첫 번쨰 정수 :");
		a = sc.nextInt();
		System.out.print("두 번째 정수 :");
		b = sc.nextInt();
		
		System.out.println(a + "<"+b+"="+(a<b));
		System.out.println(a + "<="+b+"="+(a<=b));
		System.out.println(a + ">"+b+"="+(a>b));
		System.out.println(a + ">="+b+"="+(a>=b));
		System.out.println(a + "=="+b+"="+(a==b));
		System.out.println(a + "!="+b+"="+(a!=b));
	}

}
