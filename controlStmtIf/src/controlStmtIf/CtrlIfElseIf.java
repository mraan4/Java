package controlStmtIf;

import java.util.Scanner;

public class CtrlIfElseIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int score;
		System.out.print("���� �Է� : ");
		score = sc.nextInt();
		
		if(score >= 90) 
			System.out.println("����� ���(grade)�� A�Դϴ�.");
		else if(score >= 80) 
			System.out.println("����� ���(grade)�� B�Դϴ�.");
		else if(score >= 70) 
			System.out.println("����� ���(grade)�� C�Դϴ�.");
		else if(score >= 60) 
			System.out.println("����� ���(grade)�� D�Դϴ�.");
		else
			System.out.println("����� ���(grade)�� F�Դϴ�.");
	}

}
