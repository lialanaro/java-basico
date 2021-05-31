package exercicios;

import javax.swing.JOptionPane;

/**
 * programa irá ler um vetor de 20 números e guardar em um vetor e a seguir
 * pedir mais um, caso o numero exista no vetor ele irá gerar um novo vetor sem
 * esse numero
 * 
 * @author Nathalia Lanaro
 * @since 15/02/2021
 */
public class Exercicio97 {

	/*
	 * método principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando vetor
		int num[];
		// declarando um boolean para fazer valiação
		boolean teste = false;
		// declarando variavies
		int j = 0;
		int valor;
		String vetor = "";

		// incializando vetor
		num = new int[4];

		// for para capturar valores do usuário
		for (int i = 0; i < num.length; i++) {
			num[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe um número"));
		}

		// capturando o valor procurado pelo usuário
		valor = Integer.parseInt(JOptionPane.showInputDialog("informe um valor a ser procurado no vetor"));

		// for para verificar se tem um valor igual
		for (int i = 0; i < num.length; i++) {
			if (num[i] == valor) {
				teste = true;
				j = i;
			}
		}

		// se o boolean recebe um numero repetido ele cria um novo vetor com um indice a
		// menos
		if (teste) {
			int vetor2[];
			vetor2 = new int[3];

			// for para copiar os mesmo indices e adicionar o novo numero
			for (int i = 0; i < j; i++) {
				vetor2[i] = num[i];
			}

			for (int i = j + 1; i < num.length; i++) {
				vetor2[i - 1] = num[i];
			}

			// for para apresentar mensagem
			for (int i = 0; i < vetor2.length; i++) {
				vetor += "valor:" + vetor2[i] + "\n";
			}
		}
		// caso o numero nao tenha no vetor
		else {
			JOptionPane.showMessageDialog(null, "O vetor  não contem o número");
		}

		JOptionPane.showInternalMessageDialog(null, vetor);

	}

}
