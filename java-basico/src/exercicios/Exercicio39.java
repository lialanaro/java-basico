package exercicios;

import javax.swing.JOptionPane;

/**
 * programa que irá ler duas notas simples e escrever se o aluno foi aprovado ou
 * não
 * 
 * @author Nathalia Lanaro
 * @since 09/02/2021
 *
 */
public class Exercicio39 {

	/*
	 * método principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando variaveis
		double prova1, prova2, resultado;

		// capturando informacoes
		prova1 = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota da primeira avaliação"));
		prova2 = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota da segunda avaliação"));

		//calculo
		resultado = (prova1 + prova2) / 2;

		// verificando se o aluno digitou numeros negativos
		if ((prova1 < 0) || (prova2 < 0)) {
			JOptionPane.showMessageDialog(null, "Informe um valor válido");

		} else if (resultado >= 6) { // verificando a média foi maior ou igual a 6
			JOptionPane.showMessageDialog(null, "Aprovado!sua média foi: " + resultado);

		} else {
			JOptionPane.showMessageDialog(null, "Reprovado :( sua média foi: " + resultado);
		}

	}

}
