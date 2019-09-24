package respostaListaRico;

public class AppBanco {
	// Polimorfismo de objeto: classe especializada se passar por classe generelizada
	public static boolean transferir(Conta contaOrigem, Conta contaDestino, double valor) {
		if (contaOrigem != null & contaDestino != null) {
			
			if (contaOrigem instanceof Corrente) {
				valor +=0.5;
			}
			if (contaOrigem.sacar(valor)) {
				
//				((Poupanca) contaDestino).getDv(); PODE CAUSAR ERRO DE POLIMORFISMO DE OBJETO
//				Conta destino pode ser corrente
				if (contaDestino instanceof Poupanca) {
					if (((Poupanca) contaDestino).getDv() == 1){
						valor+=0.1;
					}
				}
				
				contaDestino.depositar(valor);
				return true;
			}
		}
		
		return false;

	}

	public static void main(String[] args) {
		Corrente corrente = new Corrente("Ze");
		System.out.println(corrente.toString());
		corrente.depositar(1000.1);
		System.out.println(corrente.toString());
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		Poupanca poupanca = new Poupanca("Maria");
		System.out.println(poupanca.toString());
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		transferir(corrente, poupanca, 800);
		System.out.println(poupanca.toString());
		System.out.println(corrente.toString());


	}



}
