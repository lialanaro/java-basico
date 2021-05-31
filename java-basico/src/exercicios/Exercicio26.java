
package exercicios;

import javax.swing.JOptionPane;

/**
 * programa em que o usuario entra com dia e o mes e o devera ser exibido
 * quantos dias se passou desde o inicio do ano
 * 
 * @author Nathalia Lanaro
 * @since 05/02/2021
 *
 */
public class Exercicio26 {

	/*
	 * método principal para executar o programa
	 */
	public static void main(String[] args) {
		//declarando variaveis
		int dia, mes, res;
		
		//capturando informações
		mes = Integer.parseInt(JOptionPane.showInputDialog("Informe o mes em que estamos:"));
		dia = Integer.parseInt(JOptionPane.showInputDialog("Informe o dia em que estamos (em numero):"));
		
		//calculo
		res= ((mes-1)*30)+dia;
		
		//apresetando em tela
		JOptionPane.showMessageDialog(null, "Se passaram "+ res + " Desde o começo do ano");
	

	}

}
