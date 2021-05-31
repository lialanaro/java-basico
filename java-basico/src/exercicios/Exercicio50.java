package exercicios;

import javax.swing.JOptionPane;

/**
 * ler 3 numeros e fazer a soma dos dois maiores
 * 
 * @author Nathalia Lanaro
 * @since 09/02/2021
 */
public class Exercicio50 {

	/*
	 * método principal para executar o programa
	 */
	public static void main(String[] args) {
		// declarando variaveis
		int valor1, valor2, valor3,res;

		// capturando valores do usuario
		valor1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor 1 "));
		valor2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor 2 "));
		valor3 = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor 3 "));

		// verificando se não sao numeros iguais
		if ((valor1 == valor2) || (valor2 == valor3) || (valor1 == valor3)) {
			JOptionPane.showMessageDialog(null, "Informe numeros diferentes");
			//verificando quais os maiores e realizando a soma 
		} else if ((valor1<valor2) && (valor1<valor3)) {
			res = valor2+valor3;
			JOptionPane.showMessageDialog(null, "A soma dos maiores é "+ valor2 + "+" +valor3+ "="+res);
		}else if ((valor2<valor3) && (valor2<valor1)) {
			res = valor3 + valor1;
			JOptionPane.showMessageDialog(null, "A soma dos maiores é "+ valor1 + "+" +valor3+ "="+res);
		} else {
			res = valor1+valor2;
			JOptionPane.showMessageDialog(null, "A soma dos maiores é "+ valor2 + "+" +valor1+ "="+res);
		}

	}

}
