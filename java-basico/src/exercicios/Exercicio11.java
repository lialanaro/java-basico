
package exercicios;

import javax.swing.JOptionPane;

/**
 * programa que recebe dois valores do usu�rio e recebe a sua multiplica��o
 * 
 * @author Nathalia Lanaro
 * @since 05/02/2021
 *
 */
public class Exercicio11 {

	/*
	 * m�todo principal para executar o programa
	 */
	public static void main(String[] args) {
		// criando variaveis
		int valor1, valor2, res;

		// convertendo valores e pedindo ao usuario que digite
		valor1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro valor:"));
		valor2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo valor:"));

		// realizando o calculo
		res = valor1 * valor2;

		// exibindo o resultado em tela
		JOptionPane.showMessageDialog(null, " O resultado da multiplica��o �: " + res);
	}

}
