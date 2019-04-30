package view;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ViewTelaLogado extends JFrame {
			
	JLabel EntrouLabel;
	JButton SairButton;
	JPanel panel;
	
	public ViewTelaLogado() {
		super("Logado");
		setSize(100,100);
		setResizable(false);
		setLocationRelativeTo(null); 
		setUndecorated(true);
			
		EntrouLabel = new JLabel("Entrou");
		SairButton = new JButton("Sair");
		
		panel = new JPanel();
		panel.setBackground(Color.BLUE);
		panel.add(SairButton);
		
		add(EntrouLabel, BorderLayout.NORTH);
		add(SairButton, BorderLayout.CENTER);
					
	}

	public JButton getSairButton() {
		return SairButton;
	}

}
