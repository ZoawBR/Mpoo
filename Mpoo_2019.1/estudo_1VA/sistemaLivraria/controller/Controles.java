package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import model.BaseDados;
import model.Cliente;
import model.Estoque;
import model.Livro;
import model.Transacao;
import view.TelaCadastro;
import view.TelaConsulta;
import view.TelaMenu;
import view.TelaVenda;

public class Controles implements ActionListener{
	
	TelaMenu tm;
	TelaCadastro tca;
	TelaConsulta tco;
	TelaVenda tv;
	
	public Controles(TelaMenu menu, TelaCadastro cad, TelaConsulta con, TelaVenda vend) {
		this.tca = cad;
		this.tm = menu;
		this.tco = con;
		this.tv = vend;
		
		tm.getCadButton().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				tca.setVisible(true);
			}
		});
		
		tm.getVenButton().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				tv.setVisible(true);
			}
		} );
		
		tm.getCons().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				tco.setVisible(true);
				String entrada = Estoque.exibirLivro();
				tco.getInfoArea().append(entrada);;
			}
		});
		
		tm.getSair().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		tca.getRadioCliente().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (tca.getRadioCliente().isSelected()) {
					tca.getLivroPanel().setVisible(false);
					tca.getClientePanel().setVisible(true);
				}else {
					tca.getLivroPanel().setVisible(true);
					tca.getClientePanel().setVisible(false);
				}
			}
		});
		
		tca.getRadioLivro().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (tca.getRadioLivro().isSelected()) {
					tca.getLivroPanel().setVisible(true);
					tca.getClientePanel().setVisible(false);
				}else {
					tca.getLivroPanel().setVisible(false);
					tca.getClientePanel().setVisible(true);
				}
			}
		});
		
		tca.getAddCl().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Cliente cliente = new Cliente(tca.getNomeField().getText(), tca.getCpfField().getText());

				if (BaseDados.getClientes().add(cliente)) {
					JOptionPane.showMessageDialog(null, "Cliente Cadastrado");
				}else {
					JOptionPane.showMessageDialog(null, "Cliente Não Cadastrado");
					cliente = null;
				}
			}
		});
		
		tca.getAddLi().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Livro livro = new Livro();
				livro.setAutor(tca.getAutorField().getText());
				livro.setEditora(tca.getEditoraField().getText());
				livro.setIsbn(tca.getIsbnField().getText());
				livro.setTitulo(tca.getTituloField().getText());
				if(Estoque.addLivro(livro)) {
					JOptionPane.showMessageDialog(null, "Livro cadastrado com sucesso");
				}else {
					JOptionPane.showMessageDialog(null, "Erro ao cadastrar o livro");
				}
			}
		});
		
		tv.getConf().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Cliente cliente = null;
				for (Cliente x: BaseDados.getClientes()) {
					if (x.getCpf().equals(tv.getCpfField().getText())) {
						cliente = x;
					}
				}
				Livro livro = Estoque.buscarLivro(tv.getTituloField().getText());
				if (Transacao.venda(cliente, livro)){
					JOptionPane.showMessageDialog(null, "Livro Vendido");
				}else{
					JOptionPane.showMessageDialog(null, "Livro não foi Vendido");

				}
			}
		});
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
