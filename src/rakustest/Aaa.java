package rakustest;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class Aaa extends JFrame{
	public Aaa() {
		
		JButton btnNewButton = new JButton("ぼたん１");
		getContentPane().add(btnNewButton, BorderLayout.WEST);
		
		JTextArea textArea = new JTextArea();
		getContentPane().add(textArea, BorderLayout.CENTER);
		
		JButton btnNewButton_1 = new JButton("ぼたん２");
		getContentPane().add(btnNewButton_1, BorderLayout.EAST);
	}
	
	public static void main(String[] args) {
		
	}

}
