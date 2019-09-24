package respostaListaRico;

public class Poupanca extends Conta{
	
	private final int dv = 1;
	
	public Poupanca(String nomeCleinte) {
		super(nomeCleinte);
	}

	public int getDv() {
		return dv;
	}

	@Override
	public String toString() {
		return "Poupanca [dv=" + dv + ", toString()=" + super.toString() + "]";
	}
	
}
