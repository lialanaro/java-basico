package exercicios;

import javax.swing.JOptionPane;

/**
 * programa para ler 10 numeros, apos ler o numero calcular e escrever quantas
 * vezes numero aparece no vetor
 * 
 * @author Nathalia Lanaro
 * @since 15/02/2021
 *
 */
public class Exercicio99 {

	/*
	 * método do principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando vetor
		int vetor[];

		// declarando variaveis
		int valor;
		int quantidade = 0;

		// inicializando o vetor
		vetor = new int[10];

		// capturando valores do usuario
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe um numero"));
		}

		// capturando o valor procurado
		valor = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor procurado"));

		// verificando se tem o numero
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] == valor) {
				quantidade++;
			}
		}
		//imprimindo na tela
		System.out.println("o numero aparece "+quantidade+" vez(es)");
	}

}
