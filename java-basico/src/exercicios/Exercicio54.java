package exercicios;

import javax.swing.JOptionPane;

/**
 * ler 3 numeros e apresentar na tela se eles formam ou nao um triangulo
 * 
 * @author Nathalia Lanaro
 * @since 09/02/2021
 */
public class Exercicio54 {

	/*
	 * método para executar a classe principal
	 */
	public static void main(String[] args) {
		// declarando as variaveis
		int A, B, C;
		// capturando informação do usuario
		A = Integer.parseInt(JOptionPane.showInputDialog("Informe o lado A"));
		B = Integer.parseInt(JOptionPane.showInputDialog("Informe o lado B"));
		C = Integer.parseInt(JOptionPane.showInputDialog("Informe o lado C"));

		// verificando se é um triangulo ou nao
		if ((A < B + C) && (B < A + B) && (C < A + B)) {
			JOptionPane.showMessageDialog(null, "É um triangulo");
		} else {
			JOptionPane.showMessageDialog(null, "Não é um triangulo");
		}
	}

}
