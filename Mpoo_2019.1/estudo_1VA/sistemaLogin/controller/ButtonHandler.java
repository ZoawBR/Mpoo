package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import model.Autenticar;
import model.BaseDeDados;
import model.Pessoa;
import model.Usuario;
import view.Login;

public class ButtonHandler implements ActionListener{
	private Login tl;
	public ButtonHandler(Login t){
		this.tl = t;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == tl.getSair()){
			tl.setVisible(false);
		}
		else if(e.getSource() == tl.getAdd_entrar()){
			
			Usuario user = new Usuario(tl.getFLogin().getText(),
			tl.getFsenha().getText(), tl.getFLogin().getText());
			
			if(Autenticar.autenticarUsuario(((Pessoa)user))){//autentitando por cpf
				int cont = 0;
				for(Usuario u:BaseDeDados.getUsuarios()){
					if(u.getSenha().equals(user.getSenha()) && u.getCpf().equals(user.getCpf())){
						JOptionPane.showMessageDialog(null,BaseDeDados.exibirMensagem(2));
						cont++;
						break;
					}
				}
				if(cont == 0)
					JOptionPane.showMessageDialog(null,BaseDeDados.exibirMensagem(3));
			}
			else{//olhar por login
				int cont = 0;
				for(Usuario u:BaseDeDados.getUsuarios()){
					if(u.getSenha().equals(user.getSenha()) && u.getLogin().equals(user.getLogin())){
						JOptionPane.showMessageDialog(null,BaseDeDados.exibirMensagem(2));
						cont++;
						break;
					}
				}
				if(cont == 0)
					JOptionPane.showMessageDialog(null,BaseDeDados.exibirMensagem(3));
			}	
		}	
	}
	
}
