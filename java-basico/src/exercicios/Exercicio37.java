package exercicios;

import javax.swing.JOptionPane;

/**
 * programa ir� verificar se o numero � positivo ou negativo
 * 
 * @author Nathalia Lanaro
 * @since 09/02/2021
 *
 */
public class Exercicio37 {

	/*
	 * m�todo principal que executa a classe
	 */
	public static void main(String[] args) {
		// declarando variavel
		int numero;

		// capturando informa��o do usu�rio
		numero = Integer.parseInt(JOptionPane.showInputDialog("Informe um numero"));

		// verificando se o numero � positivo ou negativo
		if (numero >=0) {
			JOptionPane.showMessageDialog(null, "Positivo");
			
		} else {
			JOptionPane.showMessageDialog(null, "Negativo");
		}

	}

}
