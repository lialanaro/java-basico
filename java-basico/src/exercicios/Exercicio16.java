package exercicios;

import javax.swing.JOptionPane;

/**
 * programa para ler as dimensoes de um retangulo e calcular sua area
 * 
 * @author Nathalia Lanaro
 * @since 05/02/2021
 *
 */
public class Exercicio16 {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {
		// declarando variaveis
		double base, altura, area;

		// capturando dados e convertendo
		base = Double.parseDouble(JOptionPane.showInputDialog("Digite a base do Retangulo:"));
		altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a Altura do Retangulo:"));

		// realizando calculo
		area = base * altura;

		// mostrando na tela
		JOptionPane.showMessageDialog(null, "O área do rentângulo é: " + area);

	}

}
