package exercicios;

import javax.swing.JOptionPane;

/**
 * programa para ler o preco da gasolina e o valor pago, e exibir quantos litros
 * o usuario conseguiu colocar no tanque
 * 
 * @author Nathalia Lanaro
 * @since 05/02/2021
 *
 */
public class Exercicio25 {

	/* 
	 * m�todo principal para executar o programa
	 */
	public static void main(String[] args) {
		//declarando variaveis
		double valorgasolina,dinheiro, resultado;
		
		//capturando informa��es
		valorgasolina = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da gasolina"));
		dinheiro = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do pagamento"));
		
		//calculando
		resultado = dinheiro/valorgasolina;
		
		//apresentando o resultado em tela
		JOptionPane.showMessageDialog(null, "Voc� colocou " + resultado + "L de gasolina");

	}

}
