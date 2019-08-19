package SemMVC;

public class App {

	public static void main(String[] args) {
		
		Fruta fruta = new Fruta("Goiaba", true);
		System.out.println(fruta.getNome());
		System.out.println(fruta.isClimaterica());
	}

}
