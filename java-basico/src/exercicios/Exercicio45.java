package exercicios;

import javax.swing.JOptionPane;

/**
 * o programa ir� calcular o salario final do vendedor com todas as respectivas
 * taxas.
 * 
 * @author Nathalia Lanaro
 * @since 09/02/2021
 *
 */
public class Exercicio45 {

	/*
	 * m�todo principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando variaveis
		double salarioFixo, valorVenda, salario1, salario2, salario3, comissao;

		// capturando informa��es
		salarioFixo = Double.parseDouble(JOptionPane.showInputDialog("Informe seu sal�rio fixo:"));
		valorVenda = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor total de suas vendas:"));

		// verificando as condi��es para realizar com calculo
		if (valorVenda > 1500) {
			comissao = valorVenda - 1500;
			salario1 = comissao * 0.05;
			salario2 = 1500 * 0.03;
			salario3 = salarioFixo + salario1 + salario2;
			JOptionPane.showMessageDialog(null, "Sal�rio total � R$: " + salario3);
		} else {
			salario1 = valorVenda * 0.03;
			salario2 = salarioFixo + salario1;
			JOptionPane.showMessageDialog(null, "Sal�rio total � R$: "+ salario2);
		}

	}

}
