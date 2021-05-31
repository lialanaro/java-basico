package exercicios;

import javax.swing.JOptionPane;

/**
 * o programa ir� ler o come�o e o fim de um jogo de xadrez e ir� apresentar
 * quantas horas de dura��o teve o jogo de xadrez
 * 
 * @author Nathalia Lanaro
 * @since 09/02/2021
 */
public class Exercicio43 {

	/*
	 * m�todo principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando variavies
		double inicioJogo, fimJogo, resultado;

		// capturando informa�oes
		inicioJogo = Double.parseDouble(JOptionPane.showInputDialog("Informe que horas iniciou o jogo:"));
		fimJogo = Double.parseDouble(JOptionPane.showInputDialog("Informe que horas terminou o jogo:"));

		// verificando se o jogo come�ou em um dia e terminou no outro
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
