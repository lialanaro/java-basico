package exercicios;

import javax.swing.JOptionPane;

/**
 * programa para ler uma quantidade e quantidade de numeros e escrever o maior
 * dos numeros lidos e a média dos numeros lidos
 * 
 * @author Nathalia Lanaro
 * @since 10/02/2021
 */
public class Exercicio82 {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {
		// criando e inicializando variaveis
		double valor, maior, media = 0;
		int quant;
		// capturando informações e atribuindo valores
		quant = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade"));
		valor = Double.parseDouble(JOptionPane.showInputDialog("Informe um valor"));
		maior = valor;
		media += valor;

		// capturando valores e verificando
		for (int i = 1; i < quant; i++) {
			valor = Double.parseDouble(JOptionPane.showInputDialog("Informe um valor"));
			if (valor > maior) {
				maior = valor;
			}
			media += valor;
		}
		// apresentando na tela
		System.out.println(maior);
		System.out.println(media / quant);
	}

}