package exercicios;

import javax.swing.JOptionPane;

/**
 * @author Nathalia Lanaro
 * @since 09/02/2021
 */
public class Exercicio57 {

	/*
	 * método principal para executar o programa
	 */
	public static void main(String[] args) {
		// declarando variaveis
		double litros, valortotal;
		String tipo;
		valortotal = 0;

		//capturando valorees
		tipo = JOptionPane.showInputDialog("Informe o tipo de gasolina A para Alcool e G para gasolina");
		litros = Double.parseDouble(JOptionPane.showInputDialog("Informe quantos litros de gasolina"));
		
		//verificando qual tipo e fazendo o calculo de acordo
		switch (tipo) {
		case "A":
			if (litros <= 20) {
				valortotal = litros * 2.9 - (litros * 2.9 * 0.03);
			} else {
				valortotal = litros * 2.9 - (litros * 2.9 * 0.05);
			}
			break;

		case "G":

			if (litros <= 20) {
				valortotal = litros * 3.3 - (litros * 3.3 * 0.04);
			} else {
				valortotal = litros * 3.3 - (litros * 3.3 * 0.06);
			}
			break;

		default:

			JOptionPane.showMessageDialog(null, "Tipo digitado não existe");

			break;

		}

		// apresentando em tela
		JOptionPane.showMessageDialog(null, "O valor total é de R$" + valortotal);
	}
}
