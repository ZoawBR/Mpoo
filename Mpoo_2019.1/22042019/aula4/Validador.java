package aula4;

public class Validador {
	
	 public static boolean validarUsuario( Usuario usuario ) {
		  for (Usuario user: BaseDeDados.reatriveUsuario()) {
			 
			 if (usuario.getLogin().equalsIgnoreCase(user.getLogin()) && usuario.getSenha().equals(user.getSenha())) 
				 return true;
		  }
		 
		 return false;  
		 
	 }
	
}
