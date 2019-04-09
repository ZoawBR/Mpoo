package mpoo25032019_validacao;

public class Usuario {

	// atributos e construtores
	// metodos: construtores, diversos, get e set
	
	private String cpf, email, senha;	
	
	
	public Usuario(String cpf,String email ,String senha) {		
		this.cpf = cpf;
		this.email = email;
		this.senha = senha;
	}
	
	public Usuario(String cpf, String senha) {		
		this.cpf = cpf;
		this.senha = senha;
	}
	
	public String getSenha() {
		return this.senha;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return this.cpf;
	}

}
