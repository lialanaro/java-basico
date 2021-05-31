/**
 * 
 */
package exercicios;

import javax.swing.JOptionPane;

/**
 * calcular a quantidade de ingredientes para se fazer um refresco
 * 
 * @author Nathalia Lanaro
 * @since 05/02/2021
 *
 */
public class Exercicio34 {

	/*
	 * metodo principal para executar o programa
	 */
	public static void main(String[] args) {
		// variaveis
		double quantidade, agual, sucol;

		quantidade = Double.parseDouble(JOptionPane.showInputDialog("Qual a quantidade de refresco? (em litros)"));
		// atribuindo valores
		agual = quantidade * 0.8;
		sucol = quantidade * 0.2;

		// mostrando em tela
		JOptionPane.showMessageDialog(null,
				"É necessario " + agual + "de agua e  " + sucol + " de suco para fazer o refresco");

	}

}
