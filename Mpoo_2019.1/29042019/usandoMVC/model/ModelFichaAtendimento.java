package model;

import java.util.Observable;

import view.ViewTela;

public class ModelFichaAtendimento extends Observable {
	
	private int numero;
	ViewTela tela;
	
	
	public ModelFichaAtendimento(ViewTela tela) {
		super();
		this.tela = tela;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
//		tela.label.setText(this.numero+"");
		//QUESTIONAMENTO: E se eu tivesse 1000 telas?
		//RESPOSTA: Padrão Observer
		setChanged();
		notifyObservers(this.numero);
	}
}
