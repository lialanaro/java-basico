package exercicios;

import javax.swing.JOptionPane;

/**
 * programa irá calcular o valor das moedas que pedrinho tem no cofrinho
 * 
 * @author Nathalia Lanaro
 * @since 05/02/2021
 * 
 *
 */
public class Exercicio33 {

	/* 
	 * método principal para executar o programa
	 */
	public static void main(String[] args) {
		// variaveis
		 double moeda1, moeda5,moeda10,moeda25,moeda50,moeda100;
		 double vmoeda1, vmoeda5,vmoeda10,vmoeda25,vmoeda50,res;
		 
		 //capturando a quantidade de moedas de cada tipo
		 moeda1 = Double.parseDouble(JOptionPane.showInputDialog("Qual a quantidade de moedas de 1 centavo?"));
		 moeda5 = Double.parseDouble(JOptionPane.showInputDialog("Qual a quantidade de moedas de 5 centavos?"));
		 moeda10 = Double.parseDouble(JOptionPane.showInputDialog("Qual a quantidade de moedas de 10 centavos?"));
		 moeda25= Double.parseDouble(JOptionPane.showInputDialog("Qual a quantidade de moedas de 25 centavos?"));
		 moeda50 = Double.parseDouble(JOptionPane.showInputDialog("Qual a quantidade de moedas de 50 centavos?"));
		 moeda100 = Double.parseDouble(JOptionPane.showInputDialog("Qual a quantidade de moedas de 1 real?"));
		 
		 //realizando os calculos
		 vmoeda1 = moeda1*0.01;
         vmoeda5 = moeda5* 0.05;
         vmoeda10 = moeda10 * 0.10;
         vmoeda25 = moeda25 * 0.25;
         vmoeda50 = moeda50 * 0.50;
         res = vmoeda1+vmoeda5+vmoeda10+vmoeda25+vmoeda50+moeda100;
         
         //apresentando o calculo
         JOptionPane.showMessageDialog(null, "o valor total é R$"+res);
         
         
         

	}

}
