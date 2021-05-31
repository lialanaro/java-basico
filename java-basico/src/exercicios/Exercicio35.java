/**
 * 
 */
package exercicios;

import javax.swing.JOptionPane;

/**
 * programa que recebe o ano de nascimento da pessoa e retorne a idade dela, em
 * dias,anos,meses e semanas
 * 
 * @author Nathalia Lanaro
 * @since 05/02/2020
 *
 */
public class Exercicio35 {

	/*
	 * m�todo principal para executar o programa
	 */
	public static void main(String[] args) {
		// declarando as variaveis
		int nascimento, isemanas, idias, imeses, ianos, anoatual;

		// capturando informa��es do usuario e convertendo informa��es
		nascimento = Integer.parseInt(JOptionPane.showInputDialog("Em qual ano voc� nasceu?"));
		anoatual = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano atual:"));

		// realizando calculos
		ianos = anoatual - nascimento;
		isemanas = ianos * 48;
		imeses = ianos * 12;
		idias = ianos * 365;
		
		// apresentando o resultado na tela
		JOptionPane.showMessageDialog(null,	"A idade em anos �: "+ianos+ "\n"+
											"A idade em semanas �: "+isemanas+"\n"+
											"A idade em meses �: "+imeses+"\n"+
											"A idade em dias �: "+idias);

	}

}
