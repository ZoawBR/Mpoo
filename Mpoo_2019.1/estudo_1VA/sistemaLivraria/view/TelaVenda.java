package view;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TelaVenda extends TelaAbstrata {
	
	JTextField tituloField, autorField, cpfField;
	JLabel tituloLabel, autorLabel, cpfLabel;
	JButton conf;
	
	public TelaVenda() {
		setSize(180, 150);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		tituloLabel = new JLabel("Titulo");
 		autorLabel = new JLabel("Autor");
		cpfLabel = new JLabel("CPF");
		tituloField = new JTextField(10);
		autorField = new JTextField(10);
		cpfField = new JTextField(10);
		conf = new JButton("Confirmar");
		
		add(tituloLabel);
		add(tituloField);
		add(autorLabel);
		add(autorField);
		add(cpfLabel);
		add(cpfField);
		add(conf);
		setVisible(false);
	}

	public JTextField getTituloField() {
		return tituloField;
	}

	public JTextField getAutorField() {
		return autorField;
	}

	public JTextField getCpfField() {
		return cpfField;
	}

	public JButton getConf() {
		return conf;
	}
}
