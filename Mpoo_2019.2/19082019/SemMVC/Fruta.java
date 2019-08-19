package SemMVC;

public class Fruta {
	
	private	String nome = null;
	private boolean isClimaterica = false;
	
	public Fruta(String nome, boolean isClimaterica){
		this.nome = nome;
		this.isClimaterica = isClimaterica;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean isClimaterica() {
		return isClimaterica;
	}

	public void setClimaterica(boolean isClimaterica) {
		this.isClimaterica = isClimaterica;
	}
	
	
}
