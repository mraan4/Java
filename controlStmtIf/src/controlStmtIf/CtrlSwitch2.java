package controlStmtIf;

import java.util.Scanner;

public class CtrlSwitch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int month;
		System.out.print("달(1-12) : ");
		month = sc.nextInt();
		switch(month) {
		case 3:
		case 4:
		case 5:
			System.out.println("봄입니다.");break;
		case 6:
		case 7:
		case 8:
			System.out.println("여름입니다.");break;
		case 9:
		case 10:
		case 11:
			System.out.println("가을입니다.");break;
		case 12:
		case 1:
		case 2:
			System.out.println("겨울입니다.");break;
		default:
			System.out.println("잘못입력 하셨습니다.");break;		
		}

	}

}
