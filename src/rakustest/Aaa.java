package rakustest;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class Aaa extends JFrame{
	public Aaa() {
		
		JButton btnNewButton = new JButton("テストボタン");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		getContentPane().add(btnNewButton, BorderLayout.WEST);
		
		JTextArea textArea = new JTextArea();
		getContentPane().add(textArea, BorderLayout.CENTER);
		
		JButton btnNewButton_1 = new JButton("ボタン");
		getContentPane().add(btnNewButton_1, BorderLayout.EAST);
	}
	
	public static void main(String[] args) {
		
	}

}
