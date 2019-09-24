package view;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class ViewTela extends JFrame implements Observer {
	public JLabel label;
	public ViewTela() {
		super("Logado");
		setSize(100,150);
		setDefaultCloseOperation(EXIT_ON_CLOSE); 
		setResizable(false);
		setLocationRelativeTo(null); 
		setLayout(null);
		
		label = new JLabel("0");
		label.setFont(new Font("Verdana", Font.BOLD + Font.ITALIC, 70));
		label.setForeground(Color.CYAN);
		
		add(label);

		setVisible(true);
	}
	@Override
	public void update(Observable arg0, Object arg1) {
		label.setText(arg1+"");
		
	}
	
}
