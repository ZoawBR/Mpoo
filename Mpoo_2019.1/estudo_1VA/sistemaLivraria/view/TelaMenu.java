package view;

import javax.swing.JButton;

public class TelaMenu extends TelaAbstrata {

	JButton cadButton, venButton, cons, sair;
	
	public TelaMenu() {
		cadButton = new JButton("Realizar Cadastro");
		venButton = new JButton("Realizar Venda");
		cons = new JButton("Consultar");
		sair = new JButton("Sair");
		
		add(cadButton);
		add(venButton);
		add(cons);
		add(sair);
		setVisible(true);
	}

	public JButton getCadButton() {
		return cadButton;
	}

	public JButton getVenButton() {
		return venButton;
	}

	public JButton getCons() {
		return cons;
	}

	public JButton getSair() {
		return sair;
	}
}
