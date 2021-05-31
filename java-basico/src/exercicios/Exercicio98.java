package exercicios;

import javax.swing.JOptionPane;

/**
 * O programa ir� ler dois vetores de 15 n�meros cada, ent�o verificar a
 * quantidade de vezes que v1 e v2 possuem os mesmos numeros e nas mesma
 * posi��es
 * 
 * @author Nathalia Lanaro
 * @since 15/02/2021
 */
public class Exercicio98 {

	/*
	 * M�todo principal de execu��o da classe
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

		// For para capturar os valores do primeiro vetor do usu�rio
		for (int i = 0; i < V1.length; i++) {
			V1[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor do vetor 1"));
		}

		// for p capturar o segundo vetor do usuario
		for (int i = 0; i < V2.length; i++) {
			V2[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor do vetor 2"));
		}

		// verificando se os numeros s�o iguais e as posi��es
		for (int i = 0; i < V2.length; i++) {
			if (V1[i] == V2[i]) {
				num++;
			}
		}
		// imprimindo o resultado
		System.out.println("Os numeros repetidos s�o: " + num);

	}

}