package exemplo05;

import javax.swing.JOptionPane;

/**
 * programa para buscar valor espeficio com valor string
 * 
 * @author Nathalia Lanaro
 * @since 11/02/2021
 *
 */
public class BuscarValorVetorString {

	/*
	 * método principal para executar o programa
	 */
	public static void main(String[] args) {
		// declrando variavel
		// declarando vetor
		String vetor[];

		// inicializando vetor
		vetor = new String[3];

		// variavel auxiliar para buscar um registro
		String nome = JOptionPane.showInputDialog("Informe o que quer buscar");

		// valorizando o vetor com dados informados pelo usuario
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = JOptionPane.showInputDialog("Informe um nome");
		}

		// varrendo o vetor para verificar os registros armazenados
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i].equals(nome)) {
				System.out.println("Achei o que vc procurava na posição: " + i);
			}
		}
	}

}