package mpoo25032019_validacao;

public class BaseDados {
	
	//static? faz com que os atributos perte;am a classe, e n'ao aos seus objetos.
	public	static Usuario usuario1 = new Usuario("zegatão@gatones.com", "696.696.696.96", "gatinho");
	private static Usuario usuario2 = new Usuario("fulano@gatones.com", "000.000.000.00", "gatinho123");
	
	public static Usuario getUsuario2() {
		return usuario2;
	}
	
}
