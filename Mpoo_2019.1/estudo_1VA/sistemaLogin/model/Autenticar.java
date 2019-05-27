package model;

public class Autenticar {
	public static boolean autenticarUsuario(Pessoa pessoa) {
		for (Usuario u: BaseDeDados.getUsuarios()) {
			if (pessoa.getCpf().equalsIgnoreCase(u.getCpf())) {
				return true;
			}
		}
		return false;
	}
	
	public static boolean autenticarUsuario(String cpf) {
		for (Usuario u: BaseDeDados.getUsuarios()) {
			if (cpf.equalsIgnoreCase(u.getCpf()))
				return true;
		}
		return false;
		
	}
}
