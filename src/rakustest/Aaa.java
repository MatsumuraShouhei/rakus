package rakustest;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class Aaa extends JFrame{
	public Aaa() {
		
		JButton btnNewButton = new JButton("New button");
		getContentPane().add(btnNewButton, BorderLayout.WEST);
		
		JTextArea textArea = new JTextArea();
		getContentPane().add(textArea, BorderLayout.CENTER);
	}
	
	public static void main(String[] args) {
		
	}

}
