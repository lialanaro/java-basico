package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para exibir a tabuada do 8
 * 
 * @author Nathalia Lanaro
 * @since 10/02/2021
 */
public class Exercicio70 {

	/*
	 * M�todo principal para executar a classe
	 */
	public static void main(String[] args) {

		// vari�vel auxiliar para exibir o resultado
		String resultado;
		int resultadoTabuada;

		// atruindo a variavel de resultado seu cabe�alho
		resultado = "Tabuada do 8\n";

		// la�o para calcular a tabuada
		for (int i = 0; i < 11; i++) {
			// calculando o valor do resultado
			resultadoTabuada = 8 * i;
			resultado += "8 x " + i + " = " + resultadoTabuada + "\n";
		}

		// exibindo o resultado da tabuada
		JOptionPane.showMessageDialog(null, resultado);

	}

}