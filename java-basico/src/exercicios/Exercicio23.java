package exercicios;

import javax.swing.JOptionPane;

/**
 * programa para ler a temperatura em graus fahrenheit e escrever o valor correspondente em geaus celcius
 * @author Nathalia Lanaro
 * @since 05/02/2021
 *
 */
public class Exercicio23 {

	/*
	 * método principal para executar o programa
	 */
	public static void main(String[] args) {
		//declarando variaveis
		double celcius, fahreinheit;
		
		//capturando valor do usuario
		fahreinheit = Double.parseDouble(JOptionPane.showInputDialog("Informe a temperatura em Fahreinheit:"));
		
		//calculo
		 celcius = 5 * ((fahreinheit - 32)/9);
		 
		 //apresentando o valor em tela
		 JOptionPane.showMessageDialog(null, "A temperatura correspondente em Celcius é: " + celcius + "ºC");
	}

}
