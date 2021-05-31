package exercicios;

import javax.swing.JOptionPane;

/**
 * programa para ler 20 numeros informados pelo usuário e retornar o maior
 * numero e a posição dele no vetor
 * 
 * @author Nathalia Lanaro
 * @since 11/02/2021
 */
public class Exercicio90 {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando vetor
		int vetor[];

		// declarando inicianlizando variavel aux
		int maior = 0, contador = 0;

		// iniciando vetor
		vetor = new int[20];

		// laço para capturar os valores do usuário
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor"));
			// if para verificar se o numero é positivo
			if (vetor[i] < 0) {
				vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor positivo"));
			}
		}
		// laço para verificar qual valor é maior e um contador para identificar sua
		// posiçao no vetor
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] > maior) {
				maior = vetor[i];
				contador++;
			}
		}
		// apresentando o resultado em tela
		System.out.println("O numero maior é:  " + maior + "\nE sua primeira ocorrencia está na posição: " + contador);

	}

}
