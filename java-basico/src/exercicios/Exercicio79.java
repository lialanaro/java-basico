package exercicios;

import javax.swing.JOptionPane;

/**
 * calcular media aritmetica dos numeros entre 15 e 100
 * 
 * @author Nathalia Lanaro
 * @since 10/02/2021
 */
public class Exercicio79 {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando variavel
		int media = 0, contador = 0;

		// for para verificar os numeros
		for (int i = 15; i < 100; i++) {
			media += i;
			contador++;
		}
		// apresentando valor em tela
		JOptionPane.showMessageDialog(null, (media / contador));

	}

}