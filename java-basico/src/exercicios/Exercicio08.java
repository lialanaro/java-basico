
package exercicios;

import javax.swing.JOptionPane;

/**
 * programa que ir� receber do usu�rio salario e vale refei��o e apresentar no
 * console
 * 
 * @author Nathalia lanaro
 * @since 05/02/2021
 */
public class Exercicio08 {

	/*
	 * m�todo principal para executar o programa
	 */
	public static void main(String[] args) {
		// criando variaveis
		double salario, valerefeicao;

		// convertendo e pedindo para o usu�rio digitar
		salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o seu sal�rio"));
		valerefeicao = Double.parseDouble(JOptionPane.showInputDialog("Informe o seu vale refei��o"));

		// mostrando no console
		System.out.println("o seu sal�rio �: " + salario);
		System.out.println("o seu vale refei��i �: " + valerefeicao);

	}

}
