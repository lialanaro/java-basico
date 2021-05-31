
package exemplo01;

import javax.swing.JOptionPane;

/**
 * programa para demonstrar conversao de string para double
 * 
 * @author nlanaro
 * @since 05/02/2021
 */
public class ConverterDadosDouble {

	/*
	 * metodo principal para executar o programa
	 */
	public static void main(String[] args) {
		// declarando variaveis
		double valor1;
		double valor2;
		double resultado;

		// atribuindo valores na variavel pelo usuário
		valor1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o primeiro numero"));
		valor2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o segundo numero"));

		// efetuando o calculo de divisao
		resultado = valor1 / valor2;

		// exibindo o valor da divisao no console
		System.out.println("o resultado da divisão é " + resultado);
	}

}
