package model;

import java.util.ArrayList;

import aula4.Usuario;

public class BaseDeDados {
	public static ArrayList<ModelUsuario> users = new ArrayList<ModelUsuario>();
	
	public static boolean isUsuario(ModelUsuario usuario) {
//		users.contains(buscarUsuario(usuario));
		for (ModelUsuario user:users) {
			if (user.getLogin().equalsIgnoreCase(usuario.getLogin())&&
				user.getSenha().equals(usuario.getSenha()))
				return true;
		}			
		return false;
	}
}
