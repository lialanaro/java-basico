package exercicios;

import javax.swing.JOptionPane;

/**
 * programa para converter o valor dolar p real
 * 
 * @author Nathalia Lanaro
 * @since 05/04/2021
 */
public class Exercicio20 {

	/*
	 * método principal para executar o programa
	 */
	public static void main(String[] args) {
		// declarando variaveis
		double dolar, real, res;

		// capturando numeros do usuario
		real = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor em DÓLAR"));

		// calculando
		dolar = 6.61;
		res = dolar * real;
		// apresentando na tela
		JOptionPane.showMessageDialog(null,"O valor em real é: " + res);

	}

}
