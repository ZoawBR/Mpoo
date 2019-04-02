package Exercicio;

public class Fruta {
	
	private boolean casca;
	private int caroco;
	//private String nome;
	
	public Fruta(boolean casca, int caroco) {
		this.caroco = caroco;
		this.casca = casca;
	}

	public boolean isCasca() {
		return casca;
	}
	
	public int getCaroco() {
		return caroco;
	}

	public void setCaroco(int caroco) {
		this.caroco = caroco;
	}

	public void setCasca(boolean casca) {
		this.casca = casca;
	}
}
