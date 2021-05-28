package concept;
import java.awt.*;
import java.awt.event.*;

import javax.accessibility.AccessibleIcon;
import javax.swing.*;

public class GUIEx03 extends JFrame{
	public GUIEx03() {
		setTitle("�̺�Ʈ ������");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("Action");
		btn.addActionListener(new MyActionListener());
		c.add(btn);
		setSize(250,120);
		setVisible(true);
	}

	public static void main(String[] args) {
		new GUIEx03();

	}
}
class MyActionListener implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource();
		if(b.getText().equals("Action"))
			b.setText("�׼�");
		else
			b.setText("Action");
	}
}
