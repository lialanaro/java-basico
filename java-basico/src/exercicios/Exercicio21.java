package exercicios;

import javax.swing.JOptionPane;

/**
 * calcular o valor final de um carro já com taxas e impostos aplicados
 * 
 * @author Nathalia Lanaro
 * @since 05/02/2021
 *
 */
public class Exercicio21 {

	/*
	 * método principal para executar o programa
	 */
	public static void main(String[] args) {
		// declarando variaveis
		double valordefabrica, valorfinal;

		// capturando dados do usuario e fazendo conversao dos mesmos
		valordefabrica = Double.parseDouble(JOptionPane.showInputDialog("Informe o custo de fabrica do carro:"));

		// calculos
		valorfinal = valordefabrica + (0.28 * valordefabrica) + (0.45 * valordefabrica);

		// apresentando em tela
		JOptionPane.showMessageDialog(null, "O valor final do carro é de: R$" + valorfinal);

	}

}
