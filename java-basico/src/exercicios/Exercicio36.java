package exercicios;

import javax.swing.JOptionPane;

/**
 * ler um valor e dizer se � maior que dez ou n�o
 * @author Nathalia Lanaro
 * @since 09/02/2021
 *
 */
public class Exercicio36 {

	/*
	 *M�todo principal para executar a classe
	 */
	public static void main(String[] args) {
		//declarando variavel
		int numero;
		
		//capturando informa��o do usu�rio
		numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero:"));
		
		//verificando se o numero � maior ou menos que dez e mostrando na tela
		if (numero > 10) {
			JOptionPane.showMessageDialog(null,"� MAIOR QUE 10");
		} else {
			JOptionPane.showMessageDialog(null,"N�O � MAIOR QUE 10");
		}

	}

}
