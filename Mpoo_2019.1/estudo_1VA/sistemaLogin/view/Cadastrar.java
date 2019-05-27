package view;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Cadastrar extends TelaAbstrata {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JLabel Llogin, Lcpf;
	JTextField Flogin, Fcpf;
	JButton add_entrar;
	
	public Cadastrar() {
		super();
		this.setSize(190, 160);
		
		this.Llogin = new JLabel("Login: ");
		this.Lcpf = new JLabel("CPF: ");
		this.Flogin = new JTextField(10);
		this.Fcpf = new JTextField(10);
		add_entrar = new JButton("ADD");
		
		add(Llogin,0);
		add(Flogin,1);
		add(Lcpf,2);
		add(Fcpf,3);
		add(add_entrar,6);

		
		setVisible(false);
	}

	public JTextField getFlogin() {
		return Flogin;
	}

	public JTextField getFcpf() {
		return Fcpf;
	}
	public JButton getAdd_entrar() {
		return add_entrar;
	}
}
