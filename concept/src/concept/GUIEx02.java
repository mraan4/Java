package concept;
import javax.swing.*;
import java.awt.*;
public class GUIEx02 extends JFrame {
	public GUIEx02() {
		setTitle("FlowLayout ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane = getContentPane();
		
		contentPane.setLayout(new FlowLayout(FlowLayout.LEFT,30,40));
		contentPane.add(new JButton("ADD"));
		contentPane.add(new JButton("Sub"));
		contentPane.add(new JButton("Mul"));
		contentPane.add(new JButton("Div"));
		contentPane.add(new JButton("Calculate"));
		setSize(300,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		GUIEx02 f1 = new GUIEx02();

	}

}
