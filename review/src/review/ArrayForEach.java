package review;

public class ArrayForEach {

	public static void main(String[] args) {
		int[] n = {1,2,3,4,5}; //int n[] = {1,2,3,4,5};
		int sum = 0;
		for(int i : n) {
			sum += i;
			System.out.print(i + " ");
		}
		System.out.println("= " + sum);
		String f[] = {"���", "��", "ü��", "�ٳ���", "����"};
		for(String s : f) {
			System.out.println(s);
		}
	}
}