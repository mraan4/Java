public class Circle{
	public static void main(String[] args) {
		final double PI = 3.14;
		double redius = 10.2;
		double CircleArea = PI * redius * redius;
		double CircleCir = 2 * PI * redius;
		
		System.out.printf("���� ������ = %.2f",redius);
		System.out.printf("���� ���� = %.2f", CircleArea);
		System.out.printf("���� �ѷ� = %.2f", CircleCir);
	}
}