
public class CtrlFor06 {

	public static void main(String[] args) {
		int i, hap = 0;
		
		for(i = 0; i <= 100; i++) {
			if(i % 7 == 0)
				continue;
			hap += i;
		}
		System.out.println("1���� 100������ �� �߿� 7�� ����� ������ �� = " + hap);
	}

}
