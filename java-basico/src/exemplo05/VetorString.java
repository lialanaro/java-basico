/**
 * 
 */
package exemplo05;

import javax.swing.JOptionPane;

/**
 * @author nlanaro
 *
 */
public class VetorString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String vetor[];

		// inicializando e declarando o vetor
		vetor = new String[5];

		// capturando valores
		// recebendo valores do usuario
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = (JOptionPane.showInputDialog("Informe um nome "));
		}
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}

	}

}
