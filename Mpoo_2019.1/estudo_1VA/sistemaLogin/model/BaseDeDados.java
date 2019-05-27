package model;

import java.util.ArrayList;

public class BaseDeDados {
	private static ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
	
	public static boolean adicionarUsuario(Usuario user) {
		for (Usuario u : usuarios) {
			if (u.getCpf().equals(user.getCpf())){
				return false;
			}
		}
		usuarios.add(user);
		return true;
	}
	
	public static String exibirMensagem(int tipo) {
		if (tipo == 0)
			return "Usuario Adicionado com Sucesso";
		else if (tipo == 1)
			return "Erro ao adicionar usuário:já existe na base!";
		else if (tipo == 2)
			return "Usuario Logado";
		else if (tipo == 3)
			return "Erro.Dados errados!";
		
		return "INVALIDO";
	}

	public static ArrayList<Usuario> getUsuarios() {
		return usuarios;
	}

	public static void setUsuarios(ArrayList<Usuario> usuarios) {
		BaseDeDados.usuarios = usuarios;
	}
	
}
