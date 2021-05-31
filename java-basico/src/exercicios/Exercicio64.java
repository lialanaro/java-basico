package exercicios;

import javax.swing.JOptionPane;

/**
 * @author Nathalia Lanaro
 * @since 10/02/2021
 */
public class Exercicio64 {

	/*
	 * M�todo principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando as vari�veis
		double dividendo, divisor;

		// recebendo o primeiro valor do usuario
		dividendo = Double.parseDouble(JOptionPane.showInputDialog("Informe o primeiro valor"));

		// inicializando a variavel divisor
		divisor = 0;

		// recebendo o segundo valor do usuario - tem que ser diferente de zero
		while (divisor == 0) {
			divisor = Double.parseDouble(JOptionPane.showInputDialog("Informe o segundo valor"));
		}

		// exibindo o resultado da divis�o para o usuario
		JOptionPane.showMessageDialog(null, "O resultado da divis�o �: " + (dividendo / divisor));

	}

}
