package exercicios;

import javax.swing.JOptionPane;

/**
 * programa ir� ler dois valores e escrever o maior deles
 * 
 * @author Nathalia Lanaro
 * @since 09/02/2021
 *
 */
public class Exercicio41 {

	/*
	 * m�todo principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando variaveis
		int valor1, valor2;

		// capturando informa��es
		valor1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro valor"));
		valor2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo valor"));
		
		//verificando qual dos numeros � maior e se n�o sao iguais
		if (valor1 == valor2) {
			JOptionPane.showMessageDialog(null,"Digite valores difentes!");
		}else if (valor1>valor2) {
			JOptionPane.showMessageDialog(null, "Valor 1 � maior que Valor 2");
		} else {
			JOptionPane.showMessageDialog(null, "Valor 2 � maior que valor 1");
		}

	}

}
