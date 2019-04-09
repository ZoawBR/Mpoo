package login;

public class App {
	
	public static void main(String[] args) {
		//objeto versus objeto anonimo
		Usuario usuario = new Usuario("eu", "123123");
		BaseDados.getUsuarios().add(usuario);
		
		Usuario usuario1 = new Usuario("eu", "123123");
		BaseDados.getUsuarios().add(usuario1);
	
		BaseDados.getUsuarios().add(new Usuario("aaa", "aaaaa"));
		BaseDados.getUsuarios().add(new Usuario("bbb", "bbbbb"));
		BaseDados.getUsuarios().add(new Usuario("ccc", "ccccc"));
		//objeto anonimo
		//BaseDados.addUsuario(new Usuario("eu", "tu"));
		
		for(Usuario user:BaseDados.getUsuarios()){
			System.out.println("LOGIN: "+user.getLogin());
			System.out.println("SENHA: "+user.getSenha());
		}
		if (Validador.validarUsuario(new Usuario("eu", "123123")))
			System.out.println("True");
	}
}
