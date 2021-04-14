import java.util.Scanner;

public class ArrayAccess {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int intArray[];
		intArray = new int[5]; //int intArray[] = new int[5];
		int max = -2147483648, min = 2147483647, sum = 0;
		System.out.print("정수 5개 입력 : ");
		for(int i = 0; i<intArray.length; i++) {
			intArray[i] = scn.nextInt();
			sum += intArray[i];
			if(intArray[i] > max)
				max = intArray[i];
			if(intArray[i] < min)
				min = intArray[i];
		}
		System.out.println("입력한 정수의 최대값 = " + max);
		System.out.println("입력한 정수의 최소값 = " + min);
		System.out.println("입력한 값들의 평균값 = " + ((double)sum/intArray.length));
		scn.close();
	}

}
