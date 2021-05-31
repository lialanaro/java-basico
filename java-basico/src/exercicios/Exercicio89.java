package exercicios;

import javax.swing.JOptionPane;

/**
 * programa ir� capturar 20 notas e dizer a m�dia delas e quantos alunos est�o
 * acima da m�dia.
 * 
 * @author Nathalia Lanaro
 * @since 11/02/2021
 */
public class Exercicio89 {

	/*
	 * m�todo principal para executar a classe.
	 */
	public static void main(String[] args) {
		// declarando vetor e variavies
		double vetor[];
		double nota = 0;
		double media = 0;
		double mediaAcima = 0;

		// inicializando o vetor
		vetor = new double[20];

		// iniciando o la�o para pegar as notas dos alunos e somando as notas na
		// variavel auxiliar
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota do aluno:"));
			nota += vetor[i];
		}
		// calculando a media das notas
		media = nota / 20;

		// verificando quantas notas est�o acima da m�dia geral da sala
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] > media) {

				mediaAcima = mediaAcima + 1;
			}
		}
		// imprimindo no console a m�dia dos alunos e a quantos alunos est�o com nota
		// acima da m�dia
		System.out.println("A media da turma �: " + media);
		System.out.println("Alunos com a nota acima da m�dia: " + mediaAcima);
	}

}
