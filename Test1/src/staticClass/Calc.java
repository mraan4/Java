package staticClass;

public class Calc extends Calculator{
	public int add(int a, int b) {
		return a + b;
	}
	public int sub(int a, int b) {
		return a - b;
	}
	public double avg(int[] a) {
		double sum = 0;
		for(int i = 0; i<a.length; i++) {
			sum += a[i];
		}
		return sum/a.length;
	}

	public static void main(String[] args) {
		Calc c = new Calc();
		System.out.println(c.add(1, 2));
		System.out.println(c.sub(1, 2));
		System.out.println(c.avg(new int[] {1,2,3,4}));
	}

}
