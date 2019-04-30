package view;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ViewTelaLogin extends JFrame {
	
	int HEIGHT = 200; 
	int WIDTH = 200;
	int MULT = 1;
	static boolean telaloginset = true;
	

	JLabel loginLabel, senhaLabel;
	
	JTextField loginText, senhaText;
	
	JButton sairButton, entrarButton;
	
	public ViewTelaLogin(){
		super("Ado Ado Ado quem ler é viado");
		sairButton = new JButton("SAIR");
		entrarButton = new JButton("ENTRAR");
		
		loginLabel = new JLabel("Login: ");
		senhaLabel = new JLabel("Senha: ");

		loginText = new JTextField(10);
		senhaText = new JTextField(10);

		
		setSize(WIDTH*MULT, HEIGHT*MULT);
		setDefaultCloseOperation(EXIT_ON_CLOSE); 
		setLocationRelativeTo(null); 
		setLayout(new FlowLayout());
		
		
		add(loginLabel);
		add(loginText);
		add(senhaLabel);
		add(senhaText);
		add(entrarButton);
		add(sairButton);
		
		setVisible(true); 			
	}

	public static void setTelalogin(boolean telalogin) {
		telaloginset = telalogin;
	}
	
	public JTextField getLoginText() {
		return loginText;
	}

	public JTextField getSenhaText() {
		return senhaText;
	}

	public JButton getSairButton() {
		return sairButton;
	}

	public JButton getEntrarButton() {
		return entrarButton;
	}

}

