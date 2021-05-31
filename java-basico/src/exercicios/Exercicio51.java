package exercicios;

import javax.swing.JOptionPane;

/**
 * o programa ir� capturar tres valores do usu�rio e fazer a multiplica��o dos
 * dois menores
 * 
 * @author Nathalia Lanaro
 * @since 09/02/2021
 */
public class Exercicio51 {

	/*
	 * m�todo principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando variaveis
		int valor1, valor2, valor3, res;

		// capturando valores do usuario
		valor1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor 1 "));
		valor2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor 2 "));
		valor3 = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor 3 "));

		// verificando se n�o sao numeros iguais
		if ((valor1 == valor2) || (valor2 == valor3) || (valor1 == valor3)) {
			JOptionPane.showMessageDialog(null, "Informe numeros diferentes");

			// verificando qual � o maior para multiplicar os dois menores
		} else if ((valor1 > valor2) && (valor1 > valor3)) {
			res = valor2 * valor3;
			JOptionPane.showMessageDialog(null,
					"O resultado da multiplica��o � " + "\n" + valor2 + "*" + valor3 + "= " + res);
		} else if ((valor2 > valor1) && (valor2 > valor3)) {
			res = valor3 * valor1;
			JOptionPane.showMessageDialog(null,
					"O resultado da multiplica��o � " + "\n" + valor1 + "*" + valor3 + "= " + res);
		} else {
			res = valor1 * valor2;
			JOptionPane.showMessageDialog(null,
					"O resultado da multiplica��o � " + "\n" + valor1 + "*" + valor2 + "= " + res);

		}
	}

}
