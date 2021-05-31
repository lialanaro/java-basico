package exercicios;

import javax.swing.JOptionPane;

/**
 * programa irá capturar 20 notas e dizer a média delas e quantos alunos estão
 * acima da média.
 * 
 * @author Nathalia Lanaro
 * @since 11/02/2021
 */
public class Exercicio89 {

	/*
	 * método principal para executar a classe.
	 */
	public static void main(String[] args) {
		// declarando vetor e variavies
		double vetor[];
		double nota = 0;
		double media = 0;
		double mediaAcima = 0;

		// inicializando o vetor
		vetor = new double[20];

		// iniciando o laço para pegar as notas dos alunos e somando as notas na
		// variavel auxiliar
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota do aluno:"));
			nota += vetor[i];
		}
		// calculando a media das notas
		media = nota / 20;

		// verificando quantas notas estão acima da média geral da sala
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] > media) {

				mediaAcima = mediaAcima + 1;
			}
		}
		// imprimindo no console a média dos alunos e a quantos alunos estão com nota
		// acima da média
		System.out.println("A media da turma é: " + media);
		System.out.println("Alunos com a nota acima da média: " + mediaAcima);
	}

}
