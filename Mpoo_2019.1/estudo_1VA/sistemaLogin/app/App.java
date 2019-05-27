package app;

import controller.Controle;
import model.BaseDeDados;
import model.Usuario;
import view.Cadastrar;
import view.Login;
import view.Menu;

public class App {

	public static void main(String[] args) {
		BaseDeDados.adicionarUsuario(new Usuario("ze","12345","000.000.000-00"));
		BaseDeDados.adicionarUsuario(new Usuario("marlinda","abcDE","111.111.111-11"));
		Cadastrar cadastrar = new Cadastrar();
		Login login = new Login();

		Menu menu = new Menu();
	
		Controle cont = new Controle(cadastrar,login,menu);
	}

}
