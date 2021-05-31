package exemplo05;

import javax.swing.JOptionPane;

/**
 * programa com vetor usuario informando seu tamanho
 * 
 * @author Nathalia Lanaro
 * @since 11/02/2021
 *
 */
public class VetorTamanhoDinamico {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// declarando o vetor
		int vetor[];
		// variavel auxiliar informada pelo usuario
		int tamanho;

		// usuario informando o tamanho do vetor
		tamanho = Integer.parseInt(JOptionPane.showInputDialog("Informe o tamanho do vetor"));

		// iniciando vetor
		vetor = new int[tamanho];

		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor"));
		}
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}

	}

}
