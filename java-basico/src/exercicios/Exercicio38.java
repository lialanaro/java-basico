package exercicios;

import javax.swing.JOptionPane;

/**
 * programa que ir� ler o total de ma�as compradas e calcular o custo total da
 * compra, o pre�o das ma�as varia com a quantidade
 * 
 * @author Nathalia Lanaro
 * @since 09/02/2021
 *
 */
public class Exercicio38 {

	/*
	 * m�todo principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando variaveis
		double valor;
		int maca;

		// capturando informa��es do usuario
		maca = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de ma�as compradas:"));

		//verificando se s�o valores validos
		if ((maca == 0) || (maca < 0)) {
			JOptionPane.showMessageDialog(null, "Digite um valor um v�lido!");
		//verificando a quantidade e o pre�o de acordo com o mesmo e apresentando em tela
		} else if (maca >= 12) {
			valor = maca * 1.00;
			JOptionPane.showMessageDialog(null,
					"Voc� comprou " + maca + " Ma�as" + "\n Ent�o o valor total da compra � R$" + valor);
		} else {
			valor = maca * 1.30;
			JOptionPane.showMessageDialog(null,
					"Voc� comprou " + maca + " Ma�as" + "\n Ent�o o valor total da compra � R$" + valor);
		}

	}

}
