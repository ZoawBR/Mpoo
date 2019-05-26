package model;

import java.util.ArrayList;

public class Estoque {
	private static ArrayList<Livro> livros = new ArrayList<Livro>();
	
	public static boolean addLivro(Livro livro) {
		if (livros.add(livro)) {
			return true;
		}else {
			livro = null;
			return false;
		}
	}
	
	public static boolean removerLivro(Livro livro) {
		for (Livro buscando : livros) {
			if(buscando.equals(livro)) {
				livros.remove(buscando);
				return true;
			}else {
				return false;
			}	
		}
		return false;
	}
	
	public static boolean existeLivro(Livro livro) {
		for (Livro buscando : livros) {
			if (buscando.equals(livro)) {
				return true;
			}
		}
		return false;
	}
	
	public static Livro buscarLivro(Livro livro) {
		for (Livro buscando : livros) {
			if (buscando.equals(livro)) {
				return buscando;
			}
		}
		return null;
	}
	
	public static Livro buscarLivro(String titulo) {
		for (Livro buscando : livros) {
			if (buscando.getTitulo().equals(titulo)) {
				return buscando;
			}
		}
		return null;
	}
	
	public static int quantidadeLivro(Livro livro) {
		int qnt = 0;
		for (Livro buscando : livros) {
			if (buscando.equals(livro)) {
				qnt++;
			}
		}
		return qnt;
	}
	
	public static String exibirLivro() {
		String conc = "";
		for (Livro livro : livros) {
			conc += "\n"+"Titulo: " + livro.getTitulo() +"\n"+
					"ISBN: " + livro.getIsbn() +"\n"+
					"Autor: " + livro.getAutor() +"\n"+
					"Editora: " + livro.getEditora() + "\n";
				
		}
		return conc;
	}

	public static ArrayList<Livro> getLivros() {
		return livros;
	}
}
