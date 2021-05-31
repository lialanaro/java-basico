package exercicios;

import javax.swing.JOptionPane;

/**
 * converter graus celcius em Fahrenheit
 * 
 * @author Nathalia Lanaro
 * @since 05/02/2021
 *
 */
public class Exercicio30 {

	/*
	 * método principal para executar o programa
	 */
	public static void main(String[] args) {
		// declarando variaveis
		double celcius, Fahrenheit;

		// capturando o valor a ser convertido
		celcius = Double.parseDouble(JOptionPane.showInputDialog("Informe a temperatura em ºC"));

		// calculo
		Fahrenheit = (celcius * 9 / 5) + 32;

		// apresentando resultado ao usuario
		JOptionPane.showMessageDialog(null, "A temperatura em Fahrenheit é: " + Fahrenheit + "ºF");

	}

}
