package Exercicio;

public class Acao {
	
	public static boolean retirarCasca(Fruta fruta){
		if (fruta != null){
			if (fruta.isCasca()){
				fruta.setCasca(false);
			return true;
			}
			
		}
		
		return false;
	}
	
	public static boolean retirarCaroco(Fruta fruta){
		if (fruta != null){
			while (fruta.getCaroco() > 0){
				fruta.setCaroco(fruta.getCaroco() - 1);
			
			}
			return true;
			
		}else{
			return false;
		}
	}
	
	public static void comerFruta(Fruta fruta){
		if (retirarCasca(fruta)){
			retirarCaroco(fruta);
		}
		fruta = null;
		System.gc();
	}
}
