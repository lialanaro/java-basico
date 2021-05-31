package exercicios;

import javax.swing.JOptionPane;

/**
 * receber informações do produto, calcular, apresentar desconto e total
 * 
 * @author Nathalia Lanaro
 * @since 09/02/2021
 *
 */
public class Exercicio61 {

	/*
	 * método principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando variaveis
		String descricao;
		double preco, desconto, total;
		int qtde;

		// recolhendo informaçóes
		descricao = JOptionPane.showInputDialog("Informe o nome do produto");
		qtde = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade"));
		preco = Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade"));

		// calculo
		total = qtde * preco;
		// verificando as condições
		if (qtde <= 5) {
			desconto = 0.02;

		} else if ((qtde > 5) && (qtde <= 10)) {
			desconto =0.03;

		}else {
			desconto = 0.05;
		}
		JOptionPane.showMessageDialog(null, "O valor total é R$"+total+
				"\nO desconto é:R$"+(total*desconto)+ "\nValor total com desconto R$"+(total-(total*desconto)));
	}
 

}
