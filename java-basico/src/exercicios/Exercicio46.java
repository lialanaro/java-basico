package exercicios;

import javax.swing.JOptionPane;

/**
 * o programa irá capturar dados do cliente e apresentar se a conta tem saldo positivo ou negativo
 * @author Nathalia Lanaro
 * @since 09/02/2021
 *
 */
public class Exercicio46 {

	/*
	 * método principal para executar o programa
	 */
	public static void main(String[] args) {
		// declarando variaveis
		int numConta;
		double credito, debito, saldo, saldoAtual;
		
		// capturando valores do usuario
		numConta = Integer.parseInt(JOptionPane.showInputDialog("Informe o numero da conta:"));
		saldo = Integer.parseInt(JOptionPane.showInputDialog("Informe o saldo da conta:"));
		debito = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor de debito:"));
		credito = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor de credito:"));
		
		//fazend o calculo de acordo com as instruções do exercicio
		saldoAtual = (saldo - debito + credito);
		
		//verificando se o saldo é positivo ou negativo e apresentando na tela
		if (saldoAtual >=0) {
			JOptionPane.showMessageDialog(null, "Saldo positivo");
		} else {
			JOptionPane.showMessageDialog(null, "Saldo negativo");
		}

	}

}
