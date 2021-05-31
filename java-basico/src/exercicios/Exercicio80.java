package exercicios;


import javax.swing.JOptionPane;

/**
 * programa irá mostrar o numero total de mercadorias em estoque e o valor de
 * cada mercadoria
 * 
 * @author Nathalia Lanaro
 * @since 10/02/2021
 */
public class Exercicio80 {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando e inicializando variaveis
		double valorTotal=0, preco;
		int  qtde;

		// entrada de dados
		qtde = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade"));

		for (int i = 0; i < qtde; i++) {
			//capturando os valores e somando
			preco = Double.parseDouble(JOptionPane.showInputDialog("Informe o preço"));
			valorTotal +=preco;

		}
		//apresentando na tela
		 System.out.println(valorTotal/qtde);

	}

}