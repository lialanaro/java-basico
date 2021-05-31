
package exemplo01;

import javax.swing.JOptionPane;

/**
 * programa para demonstrar a saida de dados
 * 
 * @author nlanaro
 * @since 05/02/2021
 *
 */
public class SaidaDados {

	/*
	 * metodo principal para executar programa
	 */
	public static void main(String[] args) {
		// declarando variaveis
		double num1;
		double num2;
		double res;

		// atribuindo valores para as variaveis
		num1 = Double.parseDouble(JOptionPane.showInputDialog("Informe um valor"));
		num2 = Double.parseDouble(JOptionPane.showInputDialog("Informe um valor"));

		// realizando o calculo
		res = num1 * num2;

		// mostrando o resultado para o usuario
		JOptionPane.showMessageDialog(null, "Primeiro valor digitado " +num1 + "\n" + 
											"segundo valor digitado " +num2 + "\n" + 
											"O resultado é " + res);

	}

}
