package exercicios;

import javax.swing.JOptionPane;

/**
 * programa irá receber 20 numeros e falar qual é o menor e a sua posição
 * 
 * @author Nathalia Lanaro
 * @since 11/02/2021
 */
public class Exercicio91 {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando vetor
		int vetor[];

		// declarando inicianlizando variavel aux
		int menor = 0, contador = 0;

		// iniciando vetor
		vetor = new int[20];

		// capturando o primeiro valor

		// laço para capturar os valores do usuário
		for (int i = 0; i < vetor.length; i++) {

			vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor"));
			// if para verificar se o numero é positivo
			if (vetor[i] < 0) {
				vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor positivo"));
			}
		}
		menor = vetor[0];
		// laço para verificar qual valor é o menor e um contador para identificar sua
		// posiçao no vetor
		for (int i = 0; i < vetor.length; i++) {
			if (menor >= vetor[i]) {
				menor = vetor[i];
				contador=i + 1;
			}
		}
		// apresentando o resultado em tela
		System.out.println("O numero menor é:  " + menor + "\nE sua primeira ocorrencia está na posição: " + contador);

	}

}
