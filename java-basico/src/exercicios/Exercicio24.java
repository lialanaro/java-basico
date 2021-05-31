package exercicios;

import javax.swing.JOptionPane;

/**
 * programa para receber 3 notas e calcular a meida final de acordo com a
 * formula dada
 * 
 * @author Nathalia Lanaro
 * @since 05/02/2021
 *
 */
public class Exercicio24 {

	/*
	 * método principa para executar o programa
	 */
	public static void main(String[] args) {
		// declarando variaveis
		double n1, n2, n3, mediafinal;

		// capturando informaçoes e convertendo
		n1 = Double.parseDouble(JOptionPane.showInputDialog("Informe a primeira nota"));
		n2 = Double.parseDouble(JOptionPane.showInputDialog("Informe a segunda nota"));
		n3 = Double.parseDouble(JOptionPane.showInputDialog("Informe a terceira nota"));

		// realizando os calculos
		mediafinal = ((n1 * 2) + (n2 * 3) + (n3 * 5)) / 10;

		// apresentando em tela
		JOptionPane.showMessageDialog(null, "A média final é: " + mediafinal);

	}

}
