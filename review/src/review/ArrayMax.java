package review;

import java.util.Scanner;

public class ArrayMax {

	public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	int max = -2147483648;
	int min = 2147483647;
	int sum = 0;
	double avg;
	
	int intArray[] = new int[5];
	
	for(int i = 0; i < intArray.length; i++) {
		intArray[i] = scn.nextInt();
		sum += intArray[i];
		if(intArray[i] > max)
		max = intArray[i];
		if(intArray[i] < min)
			min = intArray[i];
		}
	avg = (double)sum / intArray.length;
	System.out.print("�迭�� ���� = ");
	for(int i = 0; i < intArray.length; i++)
		System.out.print(" " + intArray[i]);
	
	System.out.println();
	System.out.println("�� = " + sum + " ��� = " + avg);
	System.out.println("�Է��� ���� �ִ밪�� " + max +", �ּҰ��� = " + min + "�Դϴ�.");
	scn.close();
	
	}

}
