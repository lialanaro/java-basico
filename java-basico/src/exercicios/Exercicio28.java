package exercicios;

import javax.swing.JOptionPane;

/**
 * programa irá calcular o valor da conta entre 3 pessoas, duas não podem conter centavos
 * @author Nathalia Lanaro
 * @since 05/02/2021
 * 
 */
public class Exercicio28 {

	/*
	 * método principal para executar o programa
	 */
	public static void main(String[] args) {
		// declarando variaveis
		int valorCarlos,valorAndre;
		double valorFelipe, valorTotalConta,valorDivido;
		
		//recebendo o valor da conta do usuario
		valorTotalConta = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor total da conta?"));
		
		//calculando
		valorDivido = valorTotalConta/3;
		
		//atribuindo valores para cada amigo
		valorCarlos = (int)valorDivido;
		valorAndre = (int)valorDivido;
		valorFelipe = valorTotalConta - (valorCarlos+valorAndre);
		
		//apresentando o resultado
		JOptionPane.showMessageDialog(null, "Valor da conta para Carlos" +valorCarlos+"\n"+
											"Valor da conta para Andre"+valorAndre+"\n"+
											"Valor da conta para Felipe"+valorFelipe);
		

	}

}
