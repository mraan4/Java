import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String name;
		System.out.print("����� �̸��� : ");
		name = sc.next();
		
		String city;
		System.out.print("����� ���ô� : ");
		city = sc.next();
		
		int age;
		System.out.print("����� ���̴� : ");
		age = sc.nextInt();
		
		double weight;
		System.out.print("����� ü���� : ");
		weight = sc.nextDouble();
		
		boolean single;
		System.out.print("����� ��ȥ�� : ");
		single = sc.nextBoolean();
		
		System.out.println("����� �̸���" + name +"�̰�" + city+ "�� ���");
		
		sc.close();
		

	}

}
