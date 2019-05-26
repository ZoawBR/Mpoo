package view;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class TelaCadastro extends TelaAbstrata{

	JRadioButton RadioLivro, RadioCliente;
	JLabel obrigatorio, obrigatorio1;
	ButtonGroup grupoRadio;
	JPanel livroPanel, clientePanel;
	
	JLabel isbnLabel, tituloLabel, autorLabel, editoraLabel;
	JTextField isbnField, tituloField, autorField, editoraField;
	
	JLabel nomeLabel, cpfLabel;
	JTextField nomeField, cpfField;
	JButton addCl,addLi;
	
	public TelaCadastro() {
		setSize(150,320);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		isbnLabel = new JLabel("ISBN   ");
		tituloLabel = new JLabel("Titulo    ");
		autorLabel = new JLabel("Autor    ");
		editoraLabel = new JLabel("Editora ");
		nomeLabel = new JLabel("Nome    ");
		cpfLabel = new JLabel("   CPF   ");
		
		isbnField = new JTextField(10);
		tituloField = new JTextField(10);
		autorField = new JTextField(10);
		editoraField = new JTextField(10);
		nomeField = new JTextField(10);
		cpfField = new JTextField(10);
		
		addCl = new JButton("Add");
		addLi = new JButton("Add");
		
		obrigatorio = new JLabel("Todos os campos são obrigatorios");
		obrigatorio.setFont(new Font("Arial", 0, 8));
		obrigatorio1 = new JLabel("Todos os campos são obrigatorios");
		obrigatorio1.setFont(new Font("Arial", 0, 8));
		
		RadioLivro = new JRadioButton("Livro", true);
		RadioCliente = new JRadioButton("Cliente");
		grupoRadio = new ButtonGroup();
		grupoRadio.add(RadioLivro);
		grupoRadio.add(RadioCliente);
		
		livroPanel = new JPanel();
		livroPanel.setLayout(new FlowLayout());
		livroPanel.setPreferredSize((new Dimension(150, 320)));
		livroPanel.add(isbnLabel);
		livroPanel.add(isbnField);
		livroPanel.add(tituloLabel);
		livroPanel.add(tituloField);
		livroPanel.add(autorLabel);
		livroPanel.add(autorField);
		livroPanel.add(editoraLabel);
		livroPanel.add(editoraField);
		livroPanel.add(obrigatorio);
		livroPanel.add(addLi);
		
		clientePanel = new JPanel();
		clientePanel.setLayout(new FlowLayout());
		clientePanel.setPreferredSize((new Dimension(150, 320)));
		clientePanel.add(nomeLabel);
		clientePanel.add(nomeField);
		clientePanel.add(cpfLabel);
		clientePanel.add(cpfField);
		clientePanel.add(obrigatorio1);
		clientePanel.add(addCl);
		
		add(RadioLivro);
		add(RadioCliente);
		add(livroPanel);
		add(clientePanel).setVisible(false);
		
		setVisible(false);
	}

	public JRadioButton getRadioLivro() {
		return RadioLivro;
	}

	public JPanel getLivroPanel() {
		return livroPanel;
	}

	public JPanel getClientePanel() {
		return clientePanel;
	}

	public JRadioButton getRadioCliente() {
		return RadioCliente;
	}

	public ButtonGroup getGrupoRadio() {
		return grupoRadio;
	}

	public JTextField getIsbnField() {
		return isbnField;
	}

	public JTextField getTituloField() {
		return tituloField;
	}

	public JTextField getAutorField() {
		return autorField;
	}

	public JTextField getEditoraField() {
		return editoraField;
	}

	public JTextField getNomeField() {
		return nomeField;
	}

	public JTextField getCpfField() {
		return cpfField;
	}

	public JButton getAddCl() {
		return addCl;
	}

	public JButton getAddLi() {
		return addLi;
	}
	
}
