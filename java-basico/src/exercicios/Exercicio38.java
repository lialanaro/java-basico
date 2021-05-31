package exercicios;

import javax.swing.JOptionPane;

/**
 * programa que irá ler o total de maças compradas e calcular o custo total da
 * compra, o preço das maças varia com a quantidade
 * 
 * @author Nathalia Lanaro
 * @since 09/02/2021
 *
 */
public class Exercicio38 {

	/*
	 * método principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando variaveis
		double valor;
		int maca;

		// capturando informações do usuario
		maca = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de maças compradas:"));

		//verificando se são valores validos
		if ((maca == 0) || (maca < 0)) {
			JOptionPane.showMessageDialog(null, "Digite um valor um válido!");
		//verificando a quantidade e o preço de acordo com o mesmo e apresentando em tela
		} else if (maca >= 12) {
			valor = maca * 1.00;
			JOptionPane.showMessageDialog(null,
					"Você comprou " + maca + " Maças" + "\n Então o valor total da compra é R$" + valor);
		} else {
			valor = maca * 1.30;
			JOptionPane.showMessageDialog(null,
					"Você comprou " + maca + " Maças" + "\n Então o valor total da compra é R$" + valor);
		}

	}

}
