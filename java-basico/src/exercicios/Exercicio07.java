
package exercicios;

import javax.swing.JOptionPane;

/**
 * programa para receber a idade, altura e peso do usuario e exibir no console
 * 
 * @author Nathalia Lanaro
 * @since 05/02/2021
 *
 */
public class Exercicio07 {

	/*
	 * método responsavel por executar o programa
	 */
	public static void main(String[] args) {
		// criando variaveis
		int idade;
		double peso, altura;

		// convertendo as variaveis e pedindo para o usuário digitar
		idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a sua idade: "));
		peso = Double.parseDouble(JOptionPane.showInputDialog("Informe o seu peso"));
		altura = Double.parseDouble(JOptionPane.showInputDialog("Informe o sua altura"));

		// mostrando no console
		System.out.println("Sua idade é:" + idade);
		System.out.println("Sua altura é:" + altura);
		System.out.println("Seu peso é: " + peso);
	}

}
