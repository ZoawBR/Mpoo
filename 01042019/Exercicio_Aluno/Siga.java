package exercicio;

public class Siga {
	public static void calcularMedia(Aluno aluno){
		//Questionamento 02:
		//colcoar as medias numa lista
		//ordenar a lista
		//pegar os dois primeiros elementos
		
		if (aluno.getVa1() >= aluno.getVa2()){
			if (aluno.getVa1() >= aluno.getVa3()){
				if (aluno.getVa2() >= aluno.getVa3()) {
					aluno.setMedia((aluno.getVa1() + aluno.getVa2())/2);
				}else{
					aluno.setMedia((aluno.getVa1() + aluno.getVa3())/2);
				}
			}
		}
		else{
			if(aluno.getVa1() >= aluno.getVa3()){
				aluno.setMedia((aluno.getVa1() + aluno.getVa2())/2);
			}else{
				aluno.setMedia((aluno.getVa2() + aluno.getVa3())/2);
			}
		}
	}
	
	public static void situacaoAprovacao(double nota){
		if (nota >= 7){
			System.out.println("ESTÁ APROVADO!!");
		}else{
			System.out.println("PRECISA FAZER A FINAL!!");
		}
	}
	
}
