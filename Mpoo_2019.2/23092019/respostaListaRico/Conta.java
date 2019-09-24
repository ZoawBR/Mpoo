package respostaListaRico;

public abstract class Conta {
	
	private String nomeCleinte;
	private double saldo;
	
	public Conta(String nomeCleinte) {
		this.nomeCleinte = nomeCleinte;
		saldo = 0;
	}
	
	public boolean depositar(double valor) {
		if (valor >= 0) {
			this.saldo += valor;
			return true;
		}
		return false;
	}
	
	public boolean sacar(double valor) {
		if (valor <= this.saldo) {
			this.saldo -= valor;
			return true;
		}
		return false;
	}

	public String getNomeCleinte() {
		return nomeCleinte;
	}

	public void setNomeCleinte(String nomeCleinte) {
		this.nomeCleinte = nomeCleinte;
	}

	public double getSaldo() {
		return saldo;
	}

	@Override
	public String toString() {
		return "Conta [nomeCleinte=" + nomeCleinte + ", saldo=" + saldo + "]";
	}
	
	
	
}
