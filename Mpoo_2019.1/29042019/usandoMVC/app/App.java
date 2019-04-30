package app;

import model.ModelFichaAtendimento;
import view.ViewTela;

public class App {
	public static void main(String[] args) {
//		BaseDeDados.users.add(new ModelUsuario("ze", "peixe"));
//		BaseDeDados.users.add(new ModelUsuario("inacio", "123"));
//
//		// criação das instancias de MVC	
//		ViewTelaLogin telalogin = new ViewTelaLogin();
//		ViewTelaLogado telaSistema = new ViewTelaLogado();
//		ControllerControladorTelaLogin controladortela = new ControllerControladorTelaLogin(telalogin, telaSistema);
		
		
		ViewTela tela = new ViewTela();
		ModelFichaAtendimento ficha = new ModelFichaAtendimento(tela);
		ficha.addObserver(tela);
		for (int i=0; i <=10; i++) {
			ficha.setNumero(i);
			try {
				Thread.sleep(1000);	
			}catch(InterruptedException e) {
				
			}
		}
	}
}
