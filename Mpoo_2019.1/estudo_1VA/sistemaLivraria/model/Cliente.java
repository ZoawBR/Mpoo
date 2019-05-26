package model;

import java.util.ArrayList;

public class Cliente extends Pessoa{	
	private int matricula;
	private ArrayList<Livro> livrosComprados = new ArrayList<Livro>();
	
	public Cliente(String nome, String cpf) {
		this.setCpf(cpf);
		this.setNome(nome);
		BaseDados.getClientes().add(this);
	}

	public int getMatricula() {
		return matricula;
	}

	public ArrayList<Livro> getLivrosComprados() {
		return livrosComprados;
	}
	
}
