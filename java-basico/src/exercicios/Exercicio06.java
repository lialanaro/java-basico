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
	 * m�todo principal para executar o programa
	 */
	public static void main(String[] args) {
		// criando variaveis
		String nome;
		String cidade;
		String celular;

		// pedindo informa�oes ao usu�rio
		nome = JOptionPane.showInputDialog("Qual o seu nome?");
		celular = JOptionPane.showInputDialog("Qual o numero do seu celular?");
		cidade = JOptionPane.showInputDialog("Qual a sua cidade?");

		// mostrando informa�oes
		System.out.println("Nome:" + nome);
		System.out.println("Celular: " + celular);
		System.out.println("Cidade:" + cidade);
	}

}
