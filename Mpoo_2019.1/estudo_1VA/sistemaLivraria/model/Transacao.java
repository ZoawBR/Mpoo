package model;

import java.util.ArrayList;

public class Transacao {
	private static ArrayList<String> historicoCompras = new ArrayList<String>();
	
	public static boolean venda(Cliente cliente, Livro livro) {
		if (Estoque.quantidadeLivro(livro)>= 1) {
			historicoCompras.add(livro.getTitulo());
			Estoque.removerLivro(livro);
			return true;
		}
		return false;
	}
	public static String exibirTransicoes() {
		String conc = "";
		for (String livro : historicoCompras) {
			conc += livro;
		}
		return conc;
	}
}
