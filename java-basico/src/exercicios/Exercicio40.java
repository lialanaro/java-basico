package exercicios;

import javax.swing.JOptionPane;

/**
 * o programa irá calcular a idade de uma pessoa e exibir a mensagem se ela já
 * pode votar ou não
 * 
 * @author Nathalia Lanaro
 * @since 09/02/2021
 *
 */
public class Exercicio40 {

	/*
	 * método principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando variaveis
		int anoNasceu, anoAtual, votar;

		// capturando dados do usuário
		anoAtual = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano atual:"));
		anoNasceu = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano em que você nasceu:"));

		// verificando se a pessoa tem 16 anos ou não 
		votar = anoAtual - anoNasceu;
		
		//apresetando na tela os possiveis resultados
		if (votar >= 16) {
			JOptionPane.showMessageDialog(null, "Pode votar!");
		}else {
			JOptionPane.showMessageDialog(null, "Não pode votar");
		}

	}

}
