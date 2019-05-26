package view;

import java.awt.FlowLayout;

import javax.swing.JFrame;

public class TelaAbstrata extends JFrame{
	
	public TelaAbstrata() {
		super();
		setSize(450, 75);
		setResizable(false);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setVisible(false);
	}
}
