package exercicios;

import javax.swing.JOptionPane;

/**
 * programa para capturar 10 valores em uma matriz, ler um numero, multiplicar
 * os numeros da matriz e imprimir a resposta em outra matriz
 * 
 * @author Nathalia Lanaro
 * @since 11/02/2021
 *
 */
public class Exercicio92 {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando vetores
		int vetorA[];
		int vetorM[];
		// declarando variavel auxiliar
		int X;

		// inicializano vetores
		vetorA = new int[10];
		vetorM = new int[10];

		// for para capturar os valores do vetorA
		for (int i = 0; i < vetorA.length; i++) {
			vetorA[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor:"));
		}
		// capturando a variavel x para a multiplicação
		X = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor para multiplicação"));

		// for para multiplicar os numeros do vetor A pela variavel X e armazenando a
		// resposta no vetor M
		for (int i = 0; i < vetorA.length; i++) {
			vetorM[i] = vetorA[i] * X;
		}
		// for para imprimir o vetor M na tela mostrando os resultados da multiplicação
		for (int i = 0; i < vetorM.length; i++) {
			System.out.println("o resultado da multiplicação é: " + vetorM[i]);
		}

	}

}
