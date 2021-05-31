package exercicios;

import javax.swing.JOptionPane;

/**
 * ler dois valores, calcular e escrever a soma dos inteiros entre 2 valores
 * lidos
 * 
 * @author Nathalia Lanaro
 * @since 10/02/2021
 */
public class Exercicio78 {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {
		//criando variaveis
		int valor1, valor2, soma;
		//inicializando a variavel
		soma=0;
		//capturando valor 1 
		valor1 = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor"));
		// capturando o valor 2 e verificando se ele é maior que o primeiro
		do {
			valor2 = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor"));

		} while (valor1>valor2);
		
		//pegando os valores e somando
		for (int i = valor1; i <= valor2; i++) {
			soma += i;
			
		}
		
		//apresentando a soma em tela
		JOptionPane.showMessageDialog(null, "A soma é:"+soma);

	}
	

}