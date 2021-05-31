
package exercicios;

import javax.swing.JOptionPane;

/**
 * programa para receber dois valores e mostrar o resultado da subtração em tela
 * 
 * @author Nathalia Lanaro
 * @since 05/02/2021
 */
public class Exercicio10 {

	/*
	 * método principal para executar o programa
	 */
	public static void main(String[] args) {

		// criando variaveis
		int valor1, valor2, res;

		// convertendo valores e pedindo ao usuario que digite
		valor1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro valor:"));
		valor2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo valor:"));

		// realizando o calculo
		res = valor1 - valor2;

		// exibindo o resultado em tela
		JOptionPane.showMessageDialog(null, " O resultado da subtração é: " + res);

	}

}
