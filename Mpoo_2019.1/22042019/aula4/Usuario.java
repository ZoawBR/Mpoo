package aula4;

public class Usuario implements Comparable<Usuario>{
	
	private String login;
	private String senha;
	
	public Usuario(String login, String senha) {
		super();
		this.login = login;
		this.senha = senha;
	}	
	
	public String getLogin() {
		return login;
	}
	
	public void setLogin(String login) {
		this.login = login;
	}
	
	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	@Override
	public int compareTo(Usuario usuario) {
		return this.getLogin().compareTo(usuario.getLogin());
	}

	@Override
	public String toString() {
		return "Usuario [login=" + login + ", senha=" + senha + "]";
	}
	
	
	
}
