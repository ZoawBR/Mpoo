package mpoo25032019_validacao;

public class Validador {
	public static void validarUsuario(Usuario usuario) {
		
		if (usuario.getEmail().equalsIgnoreCase(BaseDados.getUsuario2().getEmail()) && usuario.getSenha().equals(BaseDados.getUsuario2().getSenha())
				|| 
		usuario.getCpf().equalsIgnoreCase(BaseDados.getUsuario2().getCpf()) && usuario.getSenha().equals(BaseDados.getUsuario2().getSenha())
				||
		usuario.getEmail().equalsIgnoreCase(BaseDados.usuario1.getEmail()) && usuario.getSenha().equals(BaseDados.usuario1.getSenha())
				|| 
		usuario.getCpf().equalsIgnoreCase(BaseDados.usuario1.getCpf()) && usuario.getSenha().equals(BaseDados.usuario1.getSenha())) {
		
			System.out.println("Bem vindo, CARALHO!!");
			
		}else {
			System.out.println("Não é bem vindo, CARALHO!!");
		}
	}
}
