package model;

public class Usuario extends Pessoa {
	private String login, senha;
	public Usuario(String login, String senha, String cpf) {
		super();
		this.login = login;
		this.senha = senha;
		setCpf(cpf);
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
	
}
