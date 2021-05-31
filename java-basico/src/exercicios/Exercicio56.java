package exercicios;

import javax.swing.JOptionPane;

/**
 * ler 2 valores e dizer se sao iguais, qual é maior se o primeiro ou segundo ou se sao iguais
 * @author Nathalia Lanaro
 * @since 09/02/2021
 *
 */
public class Exercicio56 {

	/*
	 * método principal para executar o programa 
	 */
	public static void main(String[] args) {
		// declarando variavies
		int valor1, valor2;
		
		//capturando valor do usuario
		valor1 = Integer.parseInt(JOptionPane.showInputDialog("Informe um numero:"));
		valor2 = Integer.parseInt(JOptionPane.showInputDialog("Informe um numero:"));
		
		//verificando se é maior/menor/igual
		if (valor1==valor2) {
			JOptionPane.showMessageDialog(null, "Numeros Iguais");
		}else if (valor1>valor2) {
			JOptionPane.showMessageDialog(null, "Primeiro é maior");
		}else {
			JOptionPane.showMessageDialog(null, "Segundo é maior");
		}

	}

}
