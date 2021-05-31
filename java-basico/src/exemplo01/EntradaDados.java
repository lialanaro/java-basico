
package exemplo01;

import javax.swing.JOptionPane;

/**
 * programa para demonstrar entrada de dados pelo usuário
 * 
 * @author nlanaro
 * @since 05/02/2021
 *
 */
public class EntradaDados {

	/*
	 * metodo principal para executar o programa
	 */
	public static void main(String[] args) {
		// declarando variaveis
		String nome;

		// usuário informar os dados
		nome = JOptionPane.showInputDialog("Digite seu nome");

		// exibindo no console
		System.out.println("Meu nome é " + nome);

	}

}
