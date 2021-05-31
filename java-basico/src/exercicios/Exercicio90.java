package exercicios;

import javax.swing.JOptionPane;

/**
 * programa para ler 20 numeros informados pelo usu�rio e retornar o maior
 * numero e a posi��o dele no vetor
 * 
 * @author Nathalia Lanaro
 * @since 11/02/2021
 */
public class Exercicio90 {

	/*
	 * M�todo principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando vetor
		int vetor[];

		// declarando inicianlizando variavel aux
		int maior = 0, contador = 0;

		// iniciando vetor
		vetor = new int[20];

		// la�o para capturar os valores do usu�rio
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor"));
			// if para verificar se o numero � positivo
			if (vetor[i] < 0) {
				vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor positivo"));
			}
		}
		// la�o para verificar qual valor � maior e um contador para identificar sua
		// posi�ao no vetor
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] > maior) {
				maior = vetor[i];
				contador++;
			}
		}
		// apresentando o resultado em tela
		System.out.println("O numero maior �:  " + maior + "\nE sua primeira ocorrencia est� na posi��o: " + contador);

	}

}
