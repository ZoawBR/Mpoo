package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import model.BaseDeDados;
import model.Usuario;
import view.Cadastrar;
import view.Login;
import view.Menu;

public class Controle implements ActionListener {

	private Cadastrar TC;
	private Login TL;
	private Menu TM;
	
	public Controle(Cadastrar TC, Login TL, Menu TM) {
		this.TC = TC;
		this.TL = TL;
		this.TM = TM;
		//MENU
		this.TM.getCadastrar().addActionListener(this);
		this.TM.getLogin().addActionListener(this);
		this.TM.getSair().addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
		//LOGIN
		this.TL.getAdd_entrar().addActionListener(new ButtonHandler(TL));
		this.TL.getSair().addActionListener(new ButtonHandler(TL));
		//CADASTRAR
		this.TC.getAdd_entrar().addActionListener(new  ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				Usuario aux = new Usuario(TC.getFlogin().getText(), TC.getFsenha().getText(), TC.getFcpf().getText());
				if(aux.validarCPF(aux.getCpf())) {
					if (BaseDeDados.adicionarUsuario(aux))
						for (Usuario u : BaseDeDados.getUsuarios())
							System.out.println(u.getLogin());

				}else
					System.out.println("CPF Invalido!");
			}
		});
		
		this.TC.getSair().addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
				TC.setVisible(false);
				
			}
		});;
	}
	
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == TM.getCadastrar()) {
			TC.setVisible(true);
		}else if(e.getSource() == TM.getLogin()) {
			this.TL.setVisible(true);
		}
	}
	
}
