package exercicios;

import javax.swing.JOptionPane;

/**
 * programa para ler 20 numeros e imprimir a ordem inversa
 * 
 * @author Nathalia Lanaro
 * @since 12/02/2021
 *
 */
public class Exercicio93 {

	/*
	 * método principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando o vetor
		int vetor[];

		// iniciando o vetor
		vetor = new int[20];
		
		//for para capturar os valores
		for (int i = 0; i < vetor.length; i++) {
			vetor[i]=Integer.parseInt(JOptionPane.showInputDialog("Informe um valor"));
			
		}
		//for para imprmir o laço  inverso
		for (int i = vetor.length-1;i >=0; i--) {
			System.out.println(vetor[i]);
		}

	}

}
