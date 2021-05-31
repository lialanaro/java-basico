package exemplo05;

import javax.swing.JOptionPane;

/**
 * programa para demonstrar a utilizacao de vetor do tipo double
 * @author Nathalia Lanaro
 * @since 11/02/2021
 *
 */
public class VetorDouble {

	/*
	 * método principal para executar o programa 
	 */
	public static void main(String[] args) {
		// declarando vetor
		double vetor[];
		
		//iniciando o vetor e informando a quantidade de posições (tamanho)
		vetor = new double [5];
		
		//recendo dados do usuario para valorizar o vetor com for
		for (int i = 0; i < vetor.length; i++) {
			vetor[i]= Double.parseDouble(JOptionPane.showInputDialog("informe um valor"));
		}
		//apresentando na tela
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}		
	}

}
