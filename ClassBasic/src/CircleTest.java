
public class CircleTest {

	public static void main(String[] args) {
		Circle pizza = new Circle();
		pizza.radius = 20;
		pizza.name = "�ڹ� ����";
		double area = pizza.getArea();
		System.out.println(pizza.name + "�� ������ " + area);
		
		Circle donut = new Circle();
		donut.radius = 5;
		donut.name = "�ڹ� ����";
		area = donut.getArea();
		System.out.println(donut.name + "�� ������ " + area);
	}

}
