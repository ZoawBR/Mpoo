package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import model.BaseDeDados;
import model.ModelUsuario;
import view.ViewMensagem;
import view.ViewTelaLogado;
import view.ViewTelaLogin;

//com classe interna anonima e tratamento na prorpia classe

public class ControllerControladorTelaLogin implements ActionListener{

	private ViewTelaLogin telaLogin;
	private ViewTelaLogado telaSistema;

	public ControllerControladorTelaLogin(ViewTelaLogin telaLogin, ViewTelaLogado telaSistema) {
		this.telaLogin = telaLogin;
		this.telaSistema = telaSistema;
		control();
	}
	
	public void control() {
		telaLogin.getEntrarButton().addActionListener(this);
		
		// anonima
		telaLogin.getSairButton().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		telaSistema.getSairButton().addActionListener(this);;
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
//		JOptionPane.showMessageDialog(null, "pressionando OK!!");
		if (e.getSource()==telaLogin.getEntrarButton()) {
			if (BaseDeDados.isUsuario(new ModelUsuario(telaLogin.getLoginText().getText(), telaLogin.getSenhaText().getText()))) {
				telaLogin.setVisible(false);
				telaSistema.setVisible(true);
		}else {
				JOptionPane.showMessageDialog(null, "Não Entrou");
			}
		}
		else if (e.getSource()==telaSistema.getSairButton()) {
			telaLogin.setVisible(true);
			telaSistema.setVisible(false);
		}
	}
	

	
}
