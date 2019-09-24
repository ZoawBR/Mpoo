package sistemaBanco;

public class ContaCorrente extends Conta{
	
	private double saldoCorrente;
	
	public ContaCorrente(String nomeCliente) {
		super(nomeCliente);
	}
	
	public ContaCorrente(String nomeCliente ,double saldo, double saldoCorrente) {
		super(nomeCliente, saldo);
		this.saldoCorrente = saldoCorrente;
	}

	public double getSaldoCorrente() {
		return saldoCorrente;
	}

	public void setSaldoCorrente(double saldoCorrente) {
		this.saldoCorrente = saldoCorrente;
	}
	

}
