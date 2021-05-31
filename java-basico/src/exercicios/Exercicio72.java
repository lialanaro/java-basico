package exercicios;

import javax.swing.JOptionPane;

/**
 * o programa irá ler 10 valores e esvrever quantos desses valores são negativos
 * 
 * @author Nathalia Lanaro
 * @since 10/02/2021
 */
public class Exercicio72 {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando variaveis
		int contador, valor;

		// inicalizando variavel de contagem
		contador = 0;

		for (int i = 0; i < 11; i++) {
			valor = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor"));
			if (valor < 0) {
				contador++;
			}
		}
		//exibindo valor em tela
		JOptionPane.showMessageDialog(null, "Numeros negativos digitados" + contador);
	}

}