public class Circle{
	public static void main(String[] args) {
		final double PI = 3.14;
		double redius = 10.2;
		double CircleArea = PI * redius * redius;
		double CircleCir = 2 * PI * redius;
		
		System.out.printf("원의 반지름 = %.2f",redius);
		System.out.printf("원의 면적 = %.2f", CircleArea);
		System.out.printf("원의 둘래 = %.2f", CircleCir);
	}
}