package staticClass;

public interface PhoneInterface {
	final int TIMEOUT = 10000;
	void sendCall();
	void receuveCall();
	default void printLogo() {
		System.out.println("** Phone **");
	}
}
