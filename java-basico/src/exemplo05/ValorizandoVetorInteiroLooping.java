package exemplo05;

import javax.swing.JOptionPane;

/**
 * programa para valorizar vetor do tipo inteiro informado pelo usuario usando
 * for
 * 
 * @author Nathalia lanaro
 * @since 11/02/2021
 *
 */
public class ValorizandoVetorInteiroLooping {

	/*
	 * método principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando vetor
		int vetor[];

		// inicializando e definindo o seu tamanho
		vetor = new int[5];
		
		//recebendo valores do usuario
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor "));
		}
		//exibindo
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}
		
	}

}
