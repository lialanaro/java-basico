package exercicios;

import javax.swing.JOptionPane;

/**
 * programa irá calcular o valor a ser pago por maças e morangos de acordo com a
 * quantidade
 * 
 * @author nlanaro
 * @since 09/02/2021
 */
public class Exercicio59 {

	/*
	 * método principal para executar o programa
	 */
	public static void main(String[] args) {
		// variaveis
		double kgMorango, kgMaca, valorMorango, valorMaca, total;

		// capturando valores
		kgMorango = Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade de kilos de morango"));
		kgMaca = Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade de kilos de maça"));

		// verificando e realizando o calculo
		if (kgMorango <= 5) {
			valorMorango = kgMorango * 2.50;
		} else {
			valorMorango = kgMorango * 2.20;
		}
		if (kgMaca <= 5) {
			valorMaca = kgMaca * 1.8;
		} else {
			valorMaca = kgMaca * 1.5;
		}
		
		//fazendo o total
		total = valorMorango + valorMaca;
		
		//aplicando o desconto
		if ((kgMorango + kgMaca > 8) || (total > 25)) {
			 total = total - (total*0.1);

		}
		
		//apresentando resultado
		JOptionPane.showMessageDialog(null, "o valor total é R$"+total);
	}

}
