package staticClass;
class Calcu{
	public int calculate(int x, int y) {
		return x + y;
	}
}
class SamsungPhone extends Calcu implements PhoneInterface{

	public void sendCall() {
		System.out.println("µû¸£¸£¸£¸ª");		
	}

	public void receuveCall() {
		System.out.println("Hello");
	}
	public void flash() {
		System.out.println("¹ÝÂ¦ ¹ÝÂ¦");
	}
	
}
public class InterfaceTest {

	public static void main(String[] args) {
		SamsungPhone s = new SamsungPhone();
		s.printLogo();
		s.sendCall();
		s.receuveCall();
		s.flash();
	}

}
