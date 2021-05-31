package exercicios;

import javax.swing.JOptionPane;

/**
 * calculo do salario de um vendedor baseado nas vendas efetuadas
 * @author Nathalia Lanaro
 * @since 05/02/2021
 */
public class Exercicio22 {

	/*
	 * método principal para executar o programa
	 */
	public static void main(String[] args) {
		//declaração de variaveis
		double valorTvenda, salario, vcarro, vfinal;
		int ndecarro;
		
		
		//capturando e convertendo informações
		ndecarro = Integer.parseInt(JOptionPane.showInputDialog("Informe o número de carros vendidos"));
		valorTvenda = Double.parseDouble(JOptionPane.showInputDialog("Infome o valor total de suas vendas:"));
		salario = Double.parseDouble(JOptionPane.showInputDialog("Infome o valor do seu salario:"));
		vcarro = Double.parseDouble(JOptionPane.showInputDialog("Infome o valor do carro:"));
		
		
		//calculando
		vfinal = salario + (0.05 * valorTvenda);
		
		//apresentando em tela
		JOptionPane.showMessageDialog(null, "O salário total é: "+vfinal);

	}

}
