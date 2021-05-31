package exercicios;

import javax.swing.JOptionPane;

/**
 * programa para ler 10 valores e apresenta-los em ordem crescente
 * 
 * @author Nathalia Lanaro
 * @since 12/02/2021
 */
public class Exercicio95 {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando vetor
		int vetor[];
		int aux = 0;
		// inicializando vetor
		vetor = new int[10];

		// for para capturar os valores
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor" + i));
		}
		// ordenação
		for (int i = 0; i < vetor.length; i++) {
			for (int j = 0; j < vetor.length - 1; j++) {
				if (vetor[j] > vetor[j + 1]) {
					aux = vetor[j];
					vetor[j] = vetor[j + 1];
					vetor[j + 1] = aux;
				}

			}
		}
		//for para imprimir resultado na tela
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
			
		}

	}

}
