package exercicios;

import javax.swing.JOptionPane;

/**
 * o programa irá ler os dados do usuario sobre o estoque e irá devolver se pode
 * ou nao efetuar a compra de acordo com as instruções do exercio
 * 
 * @author Nathalia Lanaro
 * @since 09/02/2021
 */
public class Exercicio47 {

	/*
	 * método principal para executar o programa
	 */
	public static void main(String[] args) {
		// declarando variaveis
		double qtdeAtual, qtdeMax, qtdeMin, qtdeMedia;
		
		//capturando informaçoes do usuario
		qtdeAtual = Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade do produto atual em estoque: "));
		qtdeMin = Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade minima em estoque "));
		qtdeMax = Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade maxima em estoque "));
		
		//realizando os calculos como instruidos no exercicio
		qtdeMedia = ((qtdeMax + qtdeMin)/2);
		
		//verificando se pode ou nao realizar a comprar
		if (qtdeAtual>=qtdeMedia) {
			JOptionPane.showMessageDialog(null, "Não efetuar compra");
		} else {
			JOptionPane.showMessageDialog(null, "Efetuar compra");
		}
	}

}
