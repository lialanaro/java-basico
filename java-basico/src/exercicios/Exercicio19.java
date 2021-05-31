package exercicios;

import javax.swing.JOptionPane;

/**
 * programa que le o salario mensal do usuario e o percentual de ajuste e
 * calcular o valor do novo salario
 * 
 * @author Nathalia Lanaro
 * @since 05/02/2021
 *
 */
public class Exercicio19 {

	/*
	 * m�todo principal para executar o programa
	 */
	public static void main(String[] args) {
		// declarando variaveis
		double salario, reajuste, resultado;

		// capturando informa��es do usuario e convertendo
		salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do seu sal�rio:"));
		reajuste = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do reajuste:"));

		// calculos
		reajuste = reajuste / 100;
		resultado = salario * reajuste;
		resultado = resultado + salario;

		// apresentando o resultado em tela
		JOptionPane.showMessageDialog(null, "O sal�rio ajustado �: " + resultado);

	}

}
