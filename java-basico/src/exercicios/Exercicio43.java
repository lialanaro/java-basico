package exercicios;

import javax.swing.JOptionPane;

/**
 * o programa irá ler o começo e o fim de um jogo de xadrez e irá apresentar
 * quantas horas de duração teve o jogo de xadrez
 * 
 * @author Nathalia Lanaro
 * @since 09/02/2021
 */
public class Exercicio43 {

	/*
	 * método principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando variavies
		double inicioJogo, fimJogo, resultado;

		// capturando informaçoes
		inicioJogo = Double.parseDouble(JOptionPane.showInputDialog("Informe que horas iniciou o jogo:"));
		fimJogo = Double.parseDouble(JOptionPane.showInputDialog("Informe que horas terminou o jogo:"));

		// verificando se o jogo começou em um dia e terminou no outro
		if (inicioJogo >= fimJogo) {
			//calculando quantas horas durou o jogo
			resultado = fimJogo + (24 - inicioJogo);
			JOptionPane.showMessageDialog(null, "O jogo durou " + resultado + " horas");
		} else {
			resultado = fimJogo - inicioJogo;
			JOptionPane.showMessageDialog(null,"O jogo durou " + resultado + " horas");
		}
	}

}
