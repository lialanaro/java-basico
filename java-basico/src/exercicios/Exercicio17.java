/**
 * 
 */
package exercicios;

import javax.swing.JOptionPane;

/**
 * programa para ler a idade de uma pessoa em anos e escrevar a idade em dias
 * 
 * @author Nathalia Lanaro
 * @since 05/02/2021
 *
 */
public class Exercicio17 {

	/*
	 * m�todo principal para executar o programa
	 */
	public static void main(String[] args) {
		// declarando variaveis
		int anos, meses, dias, resanos, resmeses, resfinal;

		// capturando informa��es do usu�rio
		anos = Integer.parseInt(JOptionPane.showInputDialog("Informe qual o ano que voc� nasceu:"));
		meses = Integer.parseInt(JOptionPane.showInputDialog("Informe qual o m�s(em numero) que voc� nasceu:"));
		dias = Integer.parseInt(JOptionPane.showInputDialog("Informe qual o dia em que voc� nasceu:"));

		// fazendo os calculos
		anos = 2021 - anos;
		resanos = anos * 365;
		resmeses = meses * 30;
		resfinal = resanos + resmeses + dias;

		// apresentando o resultado em tela
		JOptionPane.showMessageDialog(null, "Sua idade expressa em dias �: " + resfinal);

	}

}
