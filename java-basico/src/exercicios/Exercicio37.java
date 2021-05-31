package exercicios;

import javax.swing.JOptionPane;

/**
 * programa irá verificar se o numero é positivo ou negativo
 * 
 * @author Nathalia Lanaro
 * @since 09/02/2021
 *
 */
public class Exercicio37 {

	/*
	 * método principal que executa a classe
	 */
	public static void main(String[] args) {
		// declarando variavel
		int numero;

		// capturando informação do usuário
		numero = Integer.parseInt(JOptionPane.showInputDialog("Informe um numero"));

		// verificando se o numero é positivo ou negativo
		if (numero >=0) {
			JOptionPane.showMessageDialog(null, "Positivo");
			
		} else {
			JOptionPane.showMessageDialog(null, "Negativo");
		}

	}

}
