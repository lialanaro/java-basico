package exercicios;

import javax.swing.JOptionPane;

/**
 * o programa irá ler 3 numeros e devolver a ordem descrescente dos 3
 * 
 * @author Nathalia Lanaro
 * @since 09/02/2021
 *
 */
public class Exercicio53 {

	/*
	 * método principal para executar o programa
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

			// verificando qual é o maior e apresentando a ordem decrescente
		} else if ((valor1 > valor2) && (valor1 > valor3) && (valor2 > valor3)) {
			JOptionPane.showMessageDialog(null, "ordem decrescente:" + valor1 + valor2 + valor3);
		} else if ((valor2 > valor1) && (valor2 > valor3) && (valor1 > valor3)) {
			JOptionPane.showMessageDialog(null, "ordem decrescente:" + valor2 + valor1 + valor3);
		} else if ((valor3 > valor2) && (valor3 > valor1) && (valor1 > valor2)) {
			JOptionPane.showMessageDialog(null, "ordem decrescente:" + valor3 + valor1 + valor2);
		} else if ((valor1 > valor2) && (valor1 > valor3) && (valor3 > valor2)) {
			JOptionPane.showMessageDialog(null, "ordem decrescente:" + valor1 + valor3 + valor2);
		} else if ((valor2 > valor1) && (valor2 > valor3) && (valor3 > valor1)) {
			JOptionPane.showMessageDialog(null, "ordem decrescente:" + valor2 + valor3 + valor1);
		} else {
			JOptionPane.showMessageDialog(null, "ordem decrescente:" + valor3 + valor2 + valor1);
		}

	}

}
