package sistemaBanco;

public class Conta {
	
	private String nomeCliente;
	private double saldo;
	
	public Conta(String nomeCliente) {
		this.nomeCliente = nomeCliente;
		saldo = 0.00;
	}
	
	public Conta(String nomeCliente, double saldo) {
		this.nomeCliente = nomeCliente;
		this.saldo = saldo;
	}
	
	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	
}
