package aula4;

public class Destrutor {
	
	public static void destroyer(Object object) {
		object = null;
		System.gc();
	}
	
	
}
