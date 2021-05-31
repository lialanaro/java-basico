package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para receber dois valores
 * @author Nathalia Lanaro
 * @since 10/02/2021
 */
public class Exercicio65 {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando variaveis
		double nota1, nota2;
		// inicializando a variavel com menos 1
		nota1 = -1;
		nota2 = -1;

		while ((nota1 < 0) || (nota1 > 10)) {

			nota1 = Double.parseDouble(JOptionPane.showInputDialog("Entre com a primeira nota"));

		}
		while ((nota2 < 0) || (nota2 > 10)) {

			nota2 = Double.parseDouble(JOptionPane.showInputDialog("Entre com a segunda nota"));

		}
		
		JOptionPane.showMessageDialog(null, "A média é " + (((nota1 + nota2) / 2)));

	}

}
