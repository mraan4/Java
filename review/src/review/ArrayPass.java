package review;

import java.util.Scanner;

public class ArrayPass {

	static int sum(int x[]) {
		int hap = 0;
		for(int i = 0; i < x.length; i++)
			hap += x[i];
		return hap;
	}
	static int sum2(int x[][]) {
		int hap = 0;
		for(int i = 0; i < x.length; i++)
			for(int j = 0; j < x[0].length; j++)
			hap += x[i][j];
		return hap;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int intArray[] = new int[5];
		int intArray2[] = new int[3];
		int a[][] = {{1,2}, {2,3}, {3,4}};
		
		for(int i = 0; i < intArray.length; i++)
			intArray[i] = scn.nextInt();
		System.out.println("�迭�� �� = " + sum(intArray));
		for(int i = 0; i < intArray2.length; i++)
			intArray2[i] = scn.nextInt();
		System.out.println("�迭�� �� = " + sum(intArray2));
		
		System.out.println("�迭�� �� = " + sum2(a));
		scn.close();
	}

}
