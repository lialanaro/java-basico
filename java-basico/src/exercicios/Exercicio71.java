package exercicios;

import javax.swing.JOptionPane;

/**
 * Programa para exibir a tabuada do valor escolhido pelo usuario
 * @author Nathalia Lanaro
 * @since 10/02/2021
 */
public class Exercicio71 {

	/*
	 * M�todo principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando as variaveis
		int tabuada;
		String resultado;
		double calculoDaTabuada;

		// incializando a vari�vel de tabuada para entrar no looping
		tabuada = -1;

		// recebendo o valor do usuario entre 1 e 10
		while ((tabuada <= 0) || (tabuada > 10)) {
			tabuada = Integer.parseInt(JOptionPane.showInputDialog("Informe um numero"));
		}

		// valorizando o cabe�alho do resultado
		resultado = "Tabuada do " + tabuada + "\n";

		// la�o de repeti��o para calcular a tabuada
		for (int i = 0; i < 11; i++) {
			calculoDaTabuada = tabuada * i;
			resultado += tabuada + " x " + i + " = " + calculoDaTabuada + "\n";
		}

		// exibindo o resultado para o usuario
		JOptionPane.showMessageDialog(null, resultado);

	}

}