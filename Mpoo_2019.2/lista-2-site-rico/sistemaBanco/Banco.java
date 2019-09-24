package sistemaBanco;

public class Banco {
	
	public static boolean transferenciaDePara(ContaPoupanca DE, ContaCorrente PARA, double saldoATransferir , int VERIFICADOR){
		if (DE.getSaldoConta() >= saldoATransferir && DE.getDigitoVerificador() == VERIFICADOR) {
			PARA.setSaldoCorrente(PARA.getSaldoCorrente()+saldoATransferir);
			DE.setSaldoConta(DE.getSaldoConta()-saldoATransferir);
			return true;
		}
		return false;
	}
	
	public static boolean transferenciaDePara(ContaCorrente DE, ContaPoupanca PARA, double saldoATransferir){
		if (DE.getSaldoCorrente() >= saldoATransferir) {
			PARA.setSaldoConta(PARA.getSaldo()+saldoATransferir);
			DE.setSaldoCorrente(DE.getSaldoCorrente()-saldoATransferir);
			return true;
		}
		return false;
	}
	
	public static boolean transferenciaDePara(ContaCorrente DE, ContaCorrente PARA, double saldoATransferir){
		if (DE.getSaldoCorrente() >= saldoATransferir) {
			PARA.setSaldoCorrente(PARA.getSaldoCorrente()+saldoATransferir);
			DE.setSaldoCorrente(DE.getSaldoCorrente()-saldoATransferir);
			return true;
		}
		return false;
	}
	
	public static boolean transferenciaDePara(ContaPoupanca DE, ContaPoupanca PARA, double saldoATransferir, int VERIFICADOR){
		if (DE.getSaldoConta() >= saldoATransferir && DE.getDigitoVerificador() == VERIFICADOR) {
			PARA.setSaldoConta(PARA.getSaldo()+saldoATransferir);
			DE.setSaldoConta(DE.getSaldoConta()-saldoATransferir);
			return true;
		}
		return false;
	}
	
}
