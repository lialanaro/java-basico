package exercicios;

import javax.swing.JOptionPane;

/**
 * programa para ler 10 valores e apresenta-los em ordem crescente adicionar
 * mais e coloca-lo na ordem também
 * 
 * @author Nathalia Lanaro
 * @since 12/02/2021
 */
public class Exercicio96 {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando vetor
		int vetor[];
		int aux = 0;
		// inicializando vetor
		vetor = new int[11];

		// for para capturar os valores
		for (int i = 0; i < 10; i++) {
			vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor " + i));
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
		// imprindo na tela
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);

		}
		//pedindo um novo valor
		vetor[10] = Integer.parseInt(JOptionPane.showInputDialog("Informe um novo valor"));

		// colocando o valor na ordem crescente junto com os outros
		for (int i = 0; i < 11; i++) {
			for (int j = 0; j < vetor.length - 1; j++) {
				if (vetor[j] > vetor[j + 1]) {
					aux = vetor[j];
					vetor[j] = vetor[j + 1];
					vetor[j + 1] = aux;
				}

			}
		}
		//imprindo todos novamente 
		System.out.println("-----------------------------------------------------");
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);

		}

	}

}
