package login;

import java.util.ArrayList;

public class BaseDados {
	
	private static ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
	
	//Questionamento 01: Como garantir que haja uma unica base de dados sem uso de seus atributos
	//Resposta: Singleton
	
	// CRUD
	//RF01
	public static boolean addUsuario(Usuario usuario){
		 return usuarios.add(usuario);
//		 Questionamento 02: RN01 só add se o usuario não existir na base
//		 					RN02 só add se existir um usuario valido
 	}						
	
	public static boolean rmvUsuario(Usuario usuario){
		if (bscUsuario(usuario.getLogin()) != null){
			return usuarios.remove(bscUsuario(usuario.getLogin()));
		}
		else{
			return false;
		}
	}
	
	public static ArrayList<Usuario> bscUsuario(){
		return usuarios;
	}
	
	public static Usuario bscUsuario(String login){
		for(Usuario usuario:usuarios){
			if (usuario.getLogin().equalsIgnoreCase(login)){
				return usuario;
			}
		} 
		return null;
	}
	
	public static boolean edtUsuario(Usuario usuarioAtual, Usuario usuarioNovo){
		// não precisa
//		Usuario usuarioTemp;
//		usuarioTemp = bscUsuario(usuarioAtual.getLogin());
		// remove tudo e depois add
		rmvUsuario(bscUsuario(usuarioAtual.getLogin()));
		addUsuario(usuarioNovo);
	}
	
	public static final ArrayList<Usuario> getUsuarios() {
		return usuarios;
	}	
}
