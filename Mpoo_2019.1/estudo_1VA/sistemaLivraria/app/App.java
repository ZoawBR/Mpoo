package app;

import controller.Controles;
import view.TelaCadastro;
import view.TelaConsulta;
import view.TelaMenu;
import view.TelaVenda;

public class App {

	public static void main(String[] args) {
		TelaMenu menu = new TelaMenu();
		TelaCadastro cad = new TelaCadastro();
		TelaConsulta con = new TelaConsulta();
		TelaVenda venda = new TelaVenda();
		Controles cont = new Controles(menu, cad, con, venda);
	}

}
