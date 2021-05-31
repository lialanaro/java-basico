package exercicios;

import javax.swing.JOptionPane;

/**
 * o programa ira ler 3 notas e calcular a media de aproveitamento
 * 
 * @author Nathalia Lanaro
 * @since 09/02/2021
 *
 */
public class Exercicio62 {

	/*
	 * método principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando variaveis
		double n1, n2, n3, n, total;

		// pegando valores do usuario
		n1 = Double.parseDouble(JOptionPane.showInputDialog("Informe nota 1:"));
		n2 = Double.parseDouble(JOptionPane.showInputDialog("Informe nota 2:"));
		n3 = Double.parseDouble(JOptionPane.showInputDialog("Informe nota 3:"));
		n = Double.parseDouble(JOptionPane.showInputDialog("Informe a média"));
		
		//calculo
		total = ((n1 + (n2 * 2) + (n3 * 3) + n) / 7);
		
		//verificando qual conceito é 
		if (total >= 9) {
			JOptionPane.showMessageDialog(null, "Conceito A");

		} else if ((total >= 7.5) && (total < 9)) {
			JOptionPane.showMessageDialog(null, "Conceito B");
		} else if ((total >= 6) && (total < 7.5)) {
			JOptionPane.showMessageDialog(null, "Conceito C");

		} else {
			JOptionPane.showMessageDialog(null, "Conceito D");
		}
	}

}
