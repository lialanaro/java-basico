package exercicios;

import javax.swing.JOptionPane;

/**
 * programa ira calcular o valor arrecadado com a venda de camisetas
 * @author Nathalia Lanaro
 * @since 05/02/2021
 *
 */
public class Exercicio27 {

	/*
	 * método principal para executar o programa
	 */
	public static void main(String[] args) {
		// declarando variaveis
		double camisaP, camisaM, camisaG,res;
		
		//capturando valores e convertendo
		camisaP = Double.parseDouble(JOptionPane.showInputDialog("Infome o numero de Camisetas P compradas: "));
		camisaM = Double.parseDouble(JOptionPane.showInputDialog("Infome o numero de Camisetas M compradas: "));
		camisaG = Double.parseDouble(JOptionPane.showInputDialog("Infome o numero de Camisetas G compradas: "));
		
		//Calculos
		res = (camisaP* 10) + (camisaM*12) + (camisaG *15);
		
		//apresentando em tela 
		JOptionPane.showMessageDialog(null, "O valor arrecado é R$"+res);

	}

}
