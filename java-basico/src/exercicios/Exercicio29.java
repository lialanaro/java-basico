package exercicios;

import javax.swing.JOptionPane;

/**
 * programa irá calcular a quantidade de ingredietes a ser utilizado baseado na
 * quantidade de sanduiches que o usuario informar
 * 
 * @author Nathalia Lanaro
 * @since 05/02/2021
 *
 */
public class Exercicio29 {

	/*
	 * método principal para executar o programa
	 */
	public static void main(String[] args) {
		// declarando variaveis
		double vqueijo, vpresunto, vcarne;
		int quantidade;

		// capturando quantidade de sanduiches a serem feitas
		quantidade = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de sanduiches: "));

		//calculo
		vqueijo = quantidade * 0.1;
		vpresunto = quantidade * 0.05;
		vcarne = quantidade * 0.1;
		
		//apresentando os valores para o usuário
		JOptionPane.showMessageDialog(null, "Quantidade de queijo " + vqueijo + "Kg" + "\n"+
				 							"Quantidade de presunto " + vpresunto + "Kg" + "\n"+
				 							 "Quantidade de carne " + vcarne + "Kg" + "\n");

	}

}
