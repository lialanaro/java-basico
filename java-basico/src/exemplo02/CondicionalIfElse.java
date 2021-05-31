package exemplo02;

import javax.swing.JOptionPane;

/**
 * programa para demonstrar if e else
 * 
 * @author nlanaro
 * 
 * @since 08/02/2021
 *
 */
public class CondicionalIfElse {

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

		} else {
			JOptionPane.showMessageDialog(null, "Peso normal!");
		}

	}

}
