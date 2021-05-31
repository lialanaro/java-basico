package exercicios;

import javax.swing.JOptionPane;

/**
 * O programa irá ler dois vetores de 15 números cada, então verificar a
 * quantidade de vezes que v1 e v2 possuem os mesmos numeros e nas mesma
 * posições
 * 
 * @author Nathalia Lanaro
 * @since 15/02/2021
 */
public class Exercicio98 {

	/*
	 * Método principal de execução da classe
	 */
	public static void main(String[] args) {
		// declarando vetores
		int V1[];
		int V2[];
		// declarando auxiliar e inicializando
		int num = 0;

		// iniciando vetores
		V1 = new int[15];
		V2 = new int[15];

		// For para capturar os valores do primeiro vetor do usuário
		for (int i = 0; i < V1.length; i++) {
			V1[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor do vetor 1"));
		}

		// for p capturar o segundo vetor do usuario
		for (int i = 0; i < V2.length; i++) {
			V2[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor do vetor 2"));
		}

		// verificando se os numeros são iguais e as posições
		for (int i = 0; i < V2.length; i++) {
			if (V1[i] == V2[i]) {
				num++;
			}
		}
		// imprimindo o resultado
		System.out.println("Os numeros repetidos são: " + num);

	}

}