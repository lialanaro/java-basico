package exercicios;

import javax.swing.JOptionPane;

/**
 * calcular a quantidade em litros de regrigerante comprada
 * 
 * @author Nathalia Lanaro
 * @since 05/02/2021
 *
 */
public class Exercicio32 {

	/*
	 * método principal para executar o programa
	 */
	public static void main(String[] args) {
		// variaveis
		double qlata, qgarrafa, qgarrafaL, lata, garrafa, garrafadois, res;

		// capturando informações do usuario
		qlata = Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade de latas de 350ml compradas:"));
		qgarrafa = Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade de garrafa 600ml compradas:"));
		qgarrafaL = Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade de garrafa 2L compradas:"));
		
		//atribuindo valores e realizando os calculos
		lata = qlata * 0.35;
		garrafa = qgarrafa * 0.6;
		garrafadois = qgarrafaL*2;
		
		res = lata+garrafa+garrafadois;
		
		//apresentando na tela
		JOptionPane.showMessageDialog(null, "A quantidad em litros é: "+res);
		
				

	}

}
