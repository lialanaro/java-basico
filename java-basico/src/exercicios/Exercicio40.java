package exercicios;

import javax.swing.JOptionPane;

/**
 * o programa ir� calcular a idade de uma pessoa e exibir a mensagem se ela j�
 * pode votar ou n�o
 * 
 * @author Nathalia Lanaro
 * @since 09/02/2021
 *
 */
public class Exercicio40 {

	/*
	 * m�todo principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando variaveis
		int anoNasceu, anoAtual, votar;

		// capturando dados do usu�rio
		anoAtual = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano atual:"));
		anoNasceu = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano em que voc� nasceu:"));

		// verificando se a pessoa tem 16 anos ou n�o 
		votar = anoAtual - anoNasceu;
		
		//apresetando na tela os possiveis resultados
		if (votar >= 16) {
			JOptionPane.showMessageDialog(null, "Pode votar!");
		}else {
			JOptionPane.showMessageDialog(null, "N�o pode votar");
		}

	}

}
