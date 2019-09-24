package sistemaBanco;

public class ContaPoupanca  extends Conta{

	private double saldoConta;
	private int digitoVerificador;
	
	public ContaPoupanca(String nomeCliente) {
		super(nomeCliente);
	}
	
	public ContaPoupanca(String nomeCliente ,double saldo, int digitoVerificador ) {
		super(nomeCliente, saldo);
		this.digitoVerificador = digitoVerificador;
	}
	
	public boolean depositar(double valorDeposito) {
		if (getSaldo() >= valorDeposito) {
			saldoConta += valorDeposito;
			setSaldo(getSaldo()-valorDeposito);
			return true;
		}
		
		return false;
	}
	
	public boolean sacar(double valorSaque) {
		if (saldoConta >= valorSaque) {
			saldoConta -= valorSaque;
			setSaldo(getSaldo()+valorSaque);
			return true;
		}
		
		return false;
	}

	public double getSaldoConta() {
		return saldoConta;
	}

	public void setSaldoConta(double saldoConta) {
		this.saldoConta = saldoConta;
	}

	public int getDigitoVerificador() {
		return digitoVerificador;
	}

	public void setDigitoVerificador(int digitoVerificador) {
		this.digitoVerificador = digitoVerificador;
	}
	
	
	
}
