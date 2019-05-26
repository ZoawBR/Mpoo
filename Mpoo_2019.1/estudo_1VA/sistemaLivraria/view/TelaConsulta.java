package view;

import java.awt.FlowLayout;

import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class TelaConsulta extends TelaAbstrata{
	
	JTextArea infoArea;
	String entrada;
	public TelaConsulta() {
		super();
		setSize(200, 160);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLayout(new FlowLayout());
		infoArea = new JTextArea("Dados do Estoque: ", 6, 15);
		infoArea.setEditable(false);
		infoArea.setText(entrada);
		JScrollPane scroll = new JScrollPane(infoArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		add(scroll);

	}
	public JTextArea getInfoArea() {
		return infoArea;
	}
	public void setInfoArea(JTextArea infoArea) {
		this.infoArea = infoArea;
	}
	public String getEntrada() {
		return entrada;
	}
	public void setEntrada(String entrada) {
		this.entrada = entrada;
	}
}
