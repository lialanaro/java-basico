package exercicios;

import javax.swing.JOptionPane;

/**
 * ler 10 valores e escrever qual dos 10 estao no intervalo entre 10 e 20 e
 * quantos ficarão de fora.
 * 
 * @author Nathalia Lanaro
 * @since 10/02/2021
 */
public class Exercicio73 {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando variaveis
		int contador, contador2, valor;

		// inicalizando variavel de contagem
		contador = 0;
		contador2 = 0;

		// inicializando laço de repetição
		for (int i = 0; i < 10; i++) {
			valor = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor"));
			// conferindo quais sao os numeros no intervalo entre 10 e 20
			if ((valor >= 10) && (valor <= 20)) {
				contador++;
			} else {
			// numeros de fora do intervalo 
				contador2++;
			}
		}
		//apresentando resultado em tela
		JOptionPane.showMessageDialog(null, "Numeros entre 10 e 20: " + contador + "\nNumeros fora:" + contador2);

	}

}