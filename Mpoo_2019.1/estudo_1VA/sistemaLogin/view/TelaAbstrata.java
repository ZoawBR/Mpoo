package view;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public abstract class TelaAbstrata extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JLabel Lsenha;
	JTextField Fsenha;
	JButton sair;
	
	public TelaAbstrata() {
		setSize(194,150);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		Lsenha = new JLabel("Senha: ");
		Fsenha = new JTextField(10);
		sair = new JButton("Sair");
		
		add(Lsenha);
		add(Fsenha);
		add(sair);
		
		setVisible(false);
	}

	public JLabel getLsenha() {
		return Lsenha;
	}

	public JTextField getFsenha() {
		return Fsenha;
	}

	public JButton getSair() {
		return sair;
	}

}
