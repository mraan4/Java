package controlStmtIf;

import java.util.Scanner;

public class CtrlIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int age;
		
		System.out.print("���� : ");
		age = sc.nextInt();
		
		if(age > 19) {
			System.out.println("����� �����Դϴ�.");
		}
		sc.close();

	}

}
