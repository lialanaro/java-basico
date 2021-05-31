package exercicios;

import javax.swing.JOptionPane;

/**
 * programa para ler 20 numeros e imprimir a ordem inversa
 * 
 * @author Nathalia Lanaro
 * @since 12/02/2021
 *
 */
public class Exercicio94 {

	/*
	 * método principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando o vetor
		int vetorA[];
		int vetorB[];
		int vetorSoma[];
		// declarando variavel
		int N;
		
		//capturando o tamanho do vetor
		N = Integer.parseInt(JOptionPane.showInputDialog("Informe o tamanho do vetor"));

		// iniciando o vetor
		vetorA = new int[N];
		vetorB = new int[N];
		vetorSoma = new int[N];

		// for para capturar os valores do vetor A
		for (int i = 0; i < vetorA.length; i++) {
			vetorA[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor para vetor A"));

		}
		// for para capturar os valores do vetor B
		for (int i = 0; i < vetorB.length; i++) {
			vetorB[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor para vetor B"));

		}
		// for para somar os vetores
		for (int i = 0; i < vetorSoma.length; i++) {
			vetorSoma[i] = vetorA[i] + vetorB[i];
		}
		//apresentando o resultado
		for (int i = 0; i < vetorSoma.length; i++) {
			System.out.println("resultado da soma do vetor A + vetor B "+vetorSoma[i]);
		}

	}

}
