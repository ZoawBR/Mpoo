package aula4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.JOptionPane;

public class BaseDeDados {
	
	
	private static List<Usuario> usuarios = new ArrayList<>();
	
	public static boolean addUsuario( Usuario usuario ) {
		
		if ( reatriveUsuario(usuario.getLogin()) == null ) {
			usuarios.add(usuario);
			Collections.sort(usuarios);
			return true;
		}
		else {
			JOptionPane.showMessageDialog(null, "Já existe");
			return false;
		}
	}

	public static List<Usuario> reatriveUsuario() {
		return usuarios;
	}
	
	public static Usuario reatriveUsuario(String login) {
		
		for ( Usuario usuario: usuarios ) {
			if ( usuario.getLogin().equalsIgnoreCase(login) )
				return usuario;
		}
		
		return null;
	}

	public static boolean removeUsuario( Usuario usuario ) {
		if (reatriveUsuario(usuario.getLogin()) != null)
			return usuarios.remove(reatriveUsuario(usuario.getLogin()));
		else
			return false;
	}
	
	
	public static boolean editUsuario( Usuario usuarioAtual, Usuario usuarioNovo ) {
		
		if (removeUsuario(reatriveUsuario(usuarioAtual.getLogin())))
			if (addUsuario(usuarioNovo))
				return true;
		return false;
	}
	
	
		
}
