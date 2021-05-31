package exercicios;

import javax.swing.JOptionPane;

/**
 * programa vai ler 10 valores e no final escrever o maior e o menor
 * 
 * @author Nathalia Lanaro
 * @since 10/02/2021
 */
public class Exercicio81 {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando variaveis
		double valor, menor = 0, maior = 0;

		valor = Double.parseDouble(JOptionPane.showInputDialog("Informe um valor"));
		maior = valor;
		menor = valor;
		//capturando valor e comparando
		for (int i = 0; i < 10; i++) {
			valor = Double.parseDouble(JOptionPane.showInputDialog("Informe um valor"));
			if (valor>maior) {
				maior = valor;
			}
			//verificando com é maior ou menor
			if (valor < menor) {
				menor = valor;
			}
		}
		//apresentando em tela
		System.out.println("O maior valor é "+maior);
		System.out.println("O menor valor é "+menor);
	}

}