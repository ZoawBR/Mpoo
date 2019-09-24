package sistemaBanco;

public class App {

	public static void main(String[] args) {
		
		ContaPoupanca clientePoupanca = new ContaPoupanca("José", 200.00, 1);
		
		System.out.println("Nome: " + clientePoupanca.getNomeCliente());
		System.out.println("Saldo Pessoal: " + clientePoupanca.getSaldo());
		System.out.println("Saldo Poupança: " + clientePoupanca.getSaldoConta());
		System.out.println("Digito Verificador: " + clientePoupanca.getDigitoVerificador());
		
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		
		ContaCorrente clienteCorrente = new ContaCorrente("Ana", 400, 200);
		
		System.out.println("Nome: " + clienteCorrente.getNomeCliente());
		System.out.println("Saldo Pessoal: " + clienteCorrente.getSaldo());
		System.out.println("Saldo Corrente: " + clienteCorrente.getSaldoCorrente());
	
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		
		clientePoupanca.depositar(100);
		System.out.println("Saldo Pessoal: " + clientePoupanca.getSaldo());
		System.out.println("Saldo Poupança: " + clientePoupanca.getSaldoConta());
		System.out.println("");
		clientePoupanca.sacar(50);
		System.out.println("Saldo Pessoal: " + clientePoupanca.getSaldo());
		System.out.println("Saldo Poupança: " + clientePoupanca.getSaldoConta());
		
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		
		Banco.transferenciaDePara(clientePoupanca, clienteCorrente, 25, 1);
						
		System.out.println("Saldo Pessoal: " + clientePoupanca.getSaldo());
		System.out.println("Saldo Poupança: " + clientePoupanca.getSaldoConta());
		System.out.println("");
		System.out.println("Saldo Pessoal: " + clienteCorrente.getSaldo());
		System.out.println("Saldo Corrente: " + clienteCorrente.getSaldoCorrente());
		
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		
		Banco.transferenciaDePara(clienteCorrente, clientePoupanca, 200);
						
		System.out.println("Saldo Pessoal: " + clientePoupanca.getSaldo());
		System.out.println("Saldo Poupança: " + clientePoupanca.getSaldoConta());
		System.out.println("");
		System.out.println("Saldo Pessoal: " + clienteCorrente.getSaldo());
		System.out.println("Saldo Corrente: " + clienteCorrente.getSaldoCorrente());
	}

}
