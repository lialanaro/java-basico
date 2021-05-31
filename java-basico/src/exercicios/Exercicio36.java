package exercicios;

import javax.swing.JOptionPane;

/**
 * ler um valor e dizer se é maior que dez ou não
 * @author Nathalia Lanaro
 * @since 09/02/2021
 *
 */
public class Exercicio36 {

	/*
	 *Método principal para executar a classe
	 */
	public static void main(String[] args) {
		//declarando variavel
		int numero;
		
		//capturando informação do usuário
		numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero:"));
		
		//verificando se o numero é maior ou menos que dez e mostrando na tela
		if (numero > 10) {
			JOptionPane.showMessageDialog(null,"É MAIOR QUE 10");
		} else {
			JOptionPane.showMessageDialog(null,"NÃO É MAIOR QUE 10");
		}

	}

}
