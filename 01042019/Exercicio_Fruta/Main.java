package Exercicio;

public class Main {
	public static void main(String[] args) {
		
		Fruta fruta = new Fruta(true, 1000);//melancia
		// defina o nome na class fruta
		Fruta fruta2 = new Fruta(true, 0);//coco
		
		Acao.comerFruta(fruta);
		
		System.out.println(fruta);
		System.out.println(fruta.getCaroco());
		System.out.println(fruta.isCasca());

	}
}
