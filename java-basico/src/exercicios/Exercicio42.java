package exercicios;

import javax.swing.JOptionPane;

/**
 * o programa irá ler dois valores e escrever em ordem crescente
 * 
 * @author Nathalia Lanaro
 * @since 09/02/2021
 */
public class Exercicio42 {

	/*
	 * método principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando variaveis
		int valor1, valor2;

		// capturando informações
		valor1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro valor"));
		valor2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo valor"));
		//verificando se sao iguais
		if (valor1 == valor2) {
			JOptionPane.showMessageDialog(null, "Digite valores difentes!");
		//verificando qual é o maior e apresentando ordem crescente
		} else if (valor1 > valor2) {
			JOptionPane.showMessageDialog(null, "Ordem Crescente:"+valor2+", "+valor1);
		} else {
			JOptionPane.showMessageDialog(null, "Ordem Crescente:"+valor1+", "+valor2);
		}

	}

}
