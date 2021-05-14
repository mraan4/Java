package staticClass;

public class ColorPointTest {

	public static void main(String[] args) {
		ColorPoint cp = new ColorPoint(4, 5, "red");
		cp.showColorPoint();
		Point p = new Point();
		p = cp;
	
	}

}
