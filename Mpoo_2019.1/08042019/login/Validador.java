package login;

public class Validador {
	public static boolean validarUsuario(Usuario usuario){
		//como varrer um ArrayList: 
		//for (IP)
		//foreach
		
		//for (IP)
//		for (int i = 0; i < BaseDados.getUsuarios().size(); i++){
//			if(usuario.getLogin().equalsIgnoreCase(BaseDados.bscUsuario().get(i).getLogin()) 
//				&& usuario.getSenha().equalsIgnoreCase(BaseDados.getUsuarios().get(i).getSenha())){
//				return true;
//			}
//		}
//		return false;
		
		//foreach
		//user = BaseDados.getUsuarios().get(i)
		for(Usuario user:BaseDados.bscUsuario()){
			if(usuario.getLogin().equalsIgnoreCase(user.getLogin()) 
					&& usuario.getSenha().equals(user.getSenha())){
				return true;
			}
		}
		return false;
	}
}
