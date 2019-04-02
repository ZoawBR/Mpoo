package exercicio;

import java.util.ArrayList;

public class Aluno {

	private	String nome;
	private int matricula;
	private double va1, va2, va3, media; 

	
	// Questionamento 01: Como usar agregação em VA?
	
	public Aluno(String nome, int matricula) {
		this.nome = nome;
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public double getVa1() {
		return va1;
	}

	public void setVa1(double va1) {
		this.va1 = va1;
	}

	public double getVa2() {
		return va2;
	}

	public void setVa2(double va2) {
		this.va2 = va2;
	}

	public double getVa3() {
		return va3;
	}

	public void setVa3(double va3) {
		this.va3 = va3;
	}

	public double getMedia() {
		return media;
	}

	public void setMedia(double media) {
		this.media = media;
	}
}
