/**
 * 
 */
package exemplo02;

import javax.swing.JOptionPane;

/**
 * Programa para demonstrar o condicional if
 * 
 * @author nlanaro
 * @since 08/02/2021
 */
public class CondicionalIf {

	/*
	 * método principal para executar o programa
	 */
	public static void main(String[] args) {
		// declarando variaveis
		double altura, peso, imc;

		// capturando informações do usuario
		peso = Double.parseDouble(JOptionPane.showInputDialog("Informe o peso:"));
		altura = Double.parseDouble(JOptionPane.showInputDialog("Informe a altura:"));

		// calculando
		imc = peso / (Math.pow(altura, 2));

		// exibir o resultado
		if (imc < 18.5) {
			JOptionPane.showMessageDialog(null, "abaixo do peso");

		}

		if ((imc >= 18.5) && (imc <= 24.9)) {
			JOptionPane.showConfirmDialog(null, "Peso ideal");

		}

	}

}
