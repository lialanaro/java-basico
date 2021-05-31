package exemplo05;

import javax.swing.JOptionPane;

/**
 * programa para demonstrar soma com vetor
 * 
 * @author Nathalia Lanaro
 * @since 11/02/2021
 *
 */
public class SomaVetor {

	/*
	 * método principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando o vetor
		int vetor[];
		//declarando variavel auxiliar para somar o vetor
		int soma=0;
		
		// iniciando vetor
		vetor = new int[5];

		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor"));
		}
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}
		//somando vetor com auxilio do comando for
		for (int i = 0; i < vetor.length; i++) {
			soma+= vetor [i]; //soma = soma + vetor[i]
			
		}
		
		//exibindo na tela
		System.out.println(soma);
	}

}