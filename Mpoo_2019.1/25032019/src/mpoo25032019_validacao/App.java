package mpoo25032019_validacao;

public class App {
	
	public static void main(String[] args) {
		Usuario usuario2 = new Usuario("fulano@gatones.com", "000.000.000.00", "gatinho123");
		Validador.validarUsuario(usuario2);
		System.out.println(usuario2.getEmail());
		System.out.println(usuario2.getCpf());
		System.out.println(usuario2.getSenha());
	}
}
