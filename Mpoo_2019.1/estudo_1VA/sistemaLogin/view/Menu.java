package view;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Menu extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JButton cadastrar, login, sair;
	
	public Menu() {
		setTitle("Menu");
		setSize(250, 75);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		cadastrar = new JButton("Cadastrar");
		login = new JButton("Logar");
		sair = new JButton("Sair");
		
		add(cadastrar);
		add(login);
		add(sair);
		
		setVisible(true);
	}

	public JButton getCadastrar() {
		return cadastrar;
	}

	public JButton getLogin() {
		return login;
	}

	public JButton getSair() {
		return sair;
	}
}
