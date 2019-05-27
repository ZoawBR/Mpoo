package view;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Login extends TelaAbstrata {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JLabel Llogin;
	JTextField FLogin;
	JButton add_entrar;
	
	public Login() {
		super();
		setSize(200, 140);
		setTitle("Login");
		
		Llogin = new JLabel("Login/CPF: ");
		FLogin = new JTextField(10);
		add_entrar = new JButton("entrar");
		
		add(Llogin, 0);
		add(FLogin, 1);
		add(add_entrar,4);
		setVisible(false);

	}

	public JTextField getFLogin() {
		return FLogin;
	}
	public JButton getAdd_entrar() {
		return add_entrar;
	}

}
