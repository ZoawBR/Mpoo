package model;

public class Pessoa implements Validador{
	private String cpf;
	
	public boolean validarCPF(String cpf) {
		if (cpf.length() == 11 || cpf.length() == 14) {
			return true;
		}
		return false;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
}
