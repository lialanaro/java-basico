package exercicios;

import javax.swing.JOptionPane;

/**
 * programa para exibir a divisao de dois valores recebidos do usu�rio
 * 
 * @author Nathalia Lanaro
 * @since 05/02/2021
 *
 */
public class Exercicio12 {

	/*
	 * m�todo principal para executar o programa
	 */
	public static void main(String[] args) {
		// criando variaveis
		double valor1, valor2, res;

		// convertendo valores e pedindo ao usuario que digite
		valor1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o primeiro valor:"));
		valor2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o segundo valor:"));

		// realizando o calculo
		res = valor1 / valor2;

		// exibindo o resultado em tela
		JOptionPane.showMessageDialog(null, " O resultado da Divis�o �: " + res);

	}

}
