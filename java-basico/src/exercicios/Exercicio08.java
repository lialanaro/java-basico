
package exercicios;

import javax.swing.JOptionPane;

/**
 * programa que irá receber do usuário salario e vale refeição e apresentar no
 * console
 * 
 * @author Nathalia lanaro
 * @since 05/02/2021
 */
public class Exercicio08 {

	/*
	 * método principal para executar o programa
	 */
	public static void main(String[] args) {
		// criando variaveis
		double salario, valerefeicao;

		// convertendo e pedindo para o usuário digitar
		salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o seu salário"));
		valerefeicao = Double.parseDouble(JOptionPane.showInputDialog("Informe o seu vale refeição"));

		// mostrando no console
		System.out.println("o seu salário é: " + salario);
		System.out.println("o seu vale refeiçãi é: " + valerefeicao);

	}

}
