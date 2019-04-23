package aula4;

import java.io.OutputStream;
import java.io.PrintWriter;

public class App {
	
	public static void main(String[] args) {
		OutputStream outputStream = System.out;
		PrintWriter cout = new PrintWriter(outputStream);
		
		
		BaseDeDados.addUsuario(new Usuario("ze1", "313"));
		BaseDeDados.addUsuario(new Usuario("oi", "show"));
		BaseDeDados.addUsuario(new Usuario("ze1", "13"));
		BaseDeDados.addUsuario(new Usuario("ze1", "12"));
		
		// BaseDeDados.addUsuario(new Usuario("ze1", "ze1feliz"));
		
		for ( Usuario u: BaseDeDados.reatriveUsuario()) 
			cout.println("Login: " + u.getLogin() + "\n" + "Senha: " + u.getSenha() + "\n");
		
		
		
		cout.close();
	}
	 
}
