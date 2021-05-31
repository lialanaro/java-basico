package exercicios;

import javax.swing.JOptionPane;

/**
 * programa que ir� ler duas notas simples e escrever se o aluno foi aprovado ou
 * n�o
 * 
 * @author Nathalia Lanaro
 * @since 09/02/2021
 *
 */
public class Exercicio39 {

	/*
	 * m�todo principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando variaveis
		double prova1, prova2, resultado;

		// capturando informacoes
		prova1 = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota da primeira avalia��o"));
		prova2 = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota da segunda avalia��o"));

		//calculo
		resultado = (prova1 + prova2) / 2;

		// verificando se o aluno digitou numeros negativos
		if ((prova1 < 0) || (prova2 < 0)) {
			JOptionPane.showMessageDialog(null, "Informe um valor v�lido");

		} else if (resultado >= 6) { // verificando a m�dia foi maior ou igual a 6
			JOptionPane.showMessageDialog(null, "Aprovado!sua m�dia foi: " + resultado);

		} else {
			JOptionPane.showMessageDialog(null, "Reprovado :( sua m�dia foi: " + resultado);
		}

	}

}
