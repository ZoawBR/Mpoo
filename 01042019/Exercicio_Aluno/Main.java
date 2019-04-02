package exercicio;

public class Main {
	public static void main(String[] args) {
		Aluno aluno = new Aluno("fulano", 1);
		aluno.setVa1(5);
		aluno.setVa2(5);
		aluno.setVa3(5);
		
		Siga.calcularMedia(aluno);
		Siga.situacaoAprovacao(aluno.getMedia());
	}
}
