package staticClass;

public class Calc {
	public static int abc(int a) {
		return (a>0)?a:-a;
	}
	public static int max(int a,int b) {
		return (a>b)?a:b;
	}
	public static int min(int a,int b) {
		return (a>b)?b:a;
	}
	public static void main(String[] args) {
		System.out.println(Calc.abc(-5));
		System.out.println(Calc.max(8, 10));
		System.out.println(Calc.min(-5, 8));
	}

}
