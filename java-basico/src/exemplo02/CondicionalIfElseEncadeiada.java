package exemplo02;

import javax.swing.JOptionPane;

/**
 * programa para mostrar como usar else if encadeado
 * 
 * @author nlanaro
 * @since 08/02/2021
 *
 */
public class CondicionalIfElseEncadeiada {

	/*
	 * método principal para executar o programa principal
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

		} else if ((imc >= 18.5) && (imc <= 24.9)) {
			JOptionPane.showMessageDialog(null, "Peso normal!");
		} else if ((imc >= 25) && (imc <= 29.9)) {
			JOptionPane.showMessageDialog(null, "Acima do peso!");
		} else if ((imc >= 30) && (imc <= 34.9)) {
			JOptionPane.showConfirmDialog(null, "Obesidade nivel 1");
		} else  {
			JOptionPane.showMessageDialog(null, "Obesidade morbida");
			
		}
	}

}
