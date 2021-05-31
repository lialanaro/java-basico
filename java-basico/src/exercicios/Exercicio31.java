package exercicios;

import javax.swing.JOptionPane;

/**
 * programa ir� calcular o custo de uma granja para marcar todos os frangos
 * 
 * @author Nathalia Lanaro
 * @since 05/02/2021
 *
 */
public class Exercicio31 {

	/*
	 * m�todo para executar o programa principal
	 */
	public static void main(String[] args) {
		// declarando variaveis
		double quantidade, chipid, chipcomida, res;

		// capturando valores do usuario
		quantidade = Double
				.parseDouble(JOptionPane.showInputDialog("Informe a quantidade de frangos a serem marcados"));

		// realizando os calculos
		chipid = quantidade * 4;
		chipcomida = (quantidade * 3.50) * 2;
		res = chipid + chipcomida;

		// apresentando na tela
		JOptionPane.showMessageDialog(null, "O valor para se marcar " + quantidade + "  frangos � " + res);

	}

}
