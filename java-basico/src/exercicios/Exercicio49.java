package exercicios;

import javax.swing.JOptionPane;

/**
 * ler 3 numeros e informar o menor deles
 * 
 * @author Nathalia Lanaro
 * @since 09/02/2021
 */
public class Exercicio49 {

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
			
		// verificando qual o menor e apresentando na tela
		} else if ((valor1 < valor2) && (valor1 < valor3)) {
			JOptionPane.showMessageDialog(null, "O menor é o valor 1: " + valor1);
		} else if ((valor2 < valor1) && (valor2 < valor3)) {
			JOptionPane.showMessageDialog(null, "O menor é o valor 2: " + valor2);
		} else {
			JOptionPane.showMessageDialog(null, "O menor é o valor 3: " + valor3);

		}
	}

}
