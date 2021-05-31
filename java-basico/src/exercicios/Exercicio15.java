package exercicios;

import javax.swing.JOptionPane;

/**
 * programa para ler um numero e mostrar o antecessor 
 * @author Nathalia Lanaro
 * @since 05/02/2021
 *
 */
public class Exercicio15 {

	/*
	 * método principal para executar o programa
	 */
	public static void main(String[] args) {
		//criando variavel
		int valor1,res;
		
		//capturando valor e fazendo a conversão
		valor1= Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
		
		//realizando o calculo
		res = valor1 - 1;
		
		//apresetando na tela o valor
		JOptionPane.showMessageDialog(null, "O antecessor é"+res);
	}

}
