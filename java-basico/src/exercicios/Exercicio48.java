package exercicios;

import javax.swing.JOptionPane;

/**
 * programa irá ler 3 valores e escrever o maior deles
 * 
 * @author Nathalia Lanaro
 * @since 09/02/2021
 *
 */
public class Exercicio48 {

	/*
	 * método que executa a classe principal
	 */
	public static void main(String[] args) {
		// declarando variaveis
		int valor1, valor2, valor3;

		// capturando valores do usuario
		valor1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor 1 "));
		valor2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor 2 "));
		valor3 = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor 3 "));

		// verificando se não sao numeros iguais
		if ((valor1 == valor2) || (valor2 == valor3) || (valor1 == valor3)) {
			JOptionPane.showMessageDialog(null, "Informe numeros diferentes");

			// verificando qual o maior e apresentando na tela
		} else if ((valor1 > valor2) && (valor1 > valor3)) {
			JOptionPane.showMessageDialog(null, "O maior é o valor 1: " + valor1);
		} else if ((valor2 > valor1) && (valor2 > valor3)) {
			JOptionPane.showMessageDialog(null, "O maior é o valor 2: " + valor2);
		} else {
			JOptionPane.showMessageDialog(null, "O maior é o valor 3: " + valor3);

		}
	}

}
