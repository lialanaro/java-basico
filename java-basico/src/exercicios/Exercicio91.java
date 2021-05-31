package exercicios;

import javax.swing.JOptionPane;

/**
 * programa ir� receber 20 numeros e falar qual � o menor e a sua posi��o
 * 
 * @author Nathalia Lanaro
 * @since 11/02/2021
 */
public class Exercicio91 {

	/*
	 * M�todo principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando vetor
		int vetor[];

		// declarando inicianlizando variavel aux
		int menor = 0, contador = 0;

		// iniciando vetor
		vetor = new int[20];

		// capturando o primeiro valor

		// la�o para capturar os valores do usu�rio
		for (int i = 0; i < vetor.length; i++) {

			vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor"));
			// if para verificar se o numero � positivo
			if (vetor[i] < 0) {
				vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor positivo"));
			}
		}
		menor = vetor[0];
		// la�o para verificar qual valor � o menor e um contador para identificar sua
		// posi�ao no vetor
		for (int i = 0; i < vetor.length; i++) {
			if (menor >= vetor[i]) {
				menor = vetor[i];
				contador=i + 1;
			}
		}
		// apresentando o resultado em tela
		System.out.println("O numero menor �:  " + menor + "\nE sua primeira ocorrencia est� na posi��o: " + contador);

	}

}
