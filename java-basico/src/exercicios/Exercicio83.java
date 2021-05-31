package exercicios;

import javax.swing.JOptionPane;

/**
 * programa ler codigo e preco de 5 produtos e devolver o maior pre�o e a m�dia
 * dos pre�os dos produtos
 * 
 * @author Nathalia Lanaro
 * @since 10/02/2021
 */
public class Exercicio83 {

	/*
	 * M�todo principal para executar a classe
	 */
	public static void main(String[] args) {
		double valor, maior, media = 0;
		String cod;

		// capturando informa��es e atribuindo valores
		cod = JOptionPane.showInputDialog("Informe o codigo");
		valor = Double.parseDouble(JOptionPane.showInputDialog("Informe o Pre�o"));

		maior = valor;
		media += valor;

		// capturando valores e verificando
		for (int i = 1; i < 5; i++) {
			cod = JOptionPane.showInputDialog("Informe o codigo");
			valor = Double.parseDouble(JOptionPane.showInputDialog("pre�o"));

			if (valor > maior) {
				maior = valor;
			}
			media += valor;
		}
		// apresentando na tela
		System.out.println(maior);
		System.out.println(media / 5);

	}

}