package exercicios;

import javax.swing.JOptionPane;

/**
 * programa para o usuario digitar nome, celular e cidade
 * 
 * @author Nathalia Lanaro
 * @since 05/02/2021
 */
public class Exercicio06 {

	/*
	 * método principal para executar o programa
	 */
	public static void main(String[] args) {
		// criando variaveis
		String nome;
		String cidade;
		String celular;

		// pedindo informaçoes ao usuário
		nome = JOptionPane.showInputDialog("Qual o seu nome?");
		celular = JOptionPane.showInputDialog("Qual o numero do seu celular?");
		cidade = JOptionPane.showInputDialog("Qual a sua cidade?");

		// mostrando informaçoes
		System.out.println("Nome:" + nome);
		System.out.println("Celular: " + celular);
		System.out.println("Cidade:" + cidade);
	}

}
