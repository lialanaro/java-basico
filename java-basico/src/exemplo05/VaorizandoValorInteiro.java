/**
 * 
 */
package exemplo05;

import javax.swing.JOptionPane;

/**
 * programa para demonstrar como valorizar um vetor inteiro recebido pelo
 * usuario
 * 
 * @author Nathalia Lanaro
 * @since 11/02/2021
 */
public class VaorizandoValorInteiro {

	/*
	 * método principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando vetor

		int vetor[];

		// inicializando e declarando o vetor
		vetor = new int[5];

		// capturando valores
		vetor[0] = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor"));
		vetor[1] = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor"));
		vetor[2] = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor"));
		vetor[3] = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor"));
		vetor[4] = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor"));

		// exibindo no console
		System.out.println(vetor[0]);
		System.out.println(vetor[1]);
		System.out.println(vetor[2]);
		System.out.println(vetor[3]);
		System.out.println(vetor[4]);

	}

}
