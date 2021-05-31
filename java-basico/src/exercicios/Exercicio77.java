package exercicios;

import javax.swing.JOptionPane;

/**
 * programa ir� ler 10 valores e mostrar a soma dos menores que 40
 * @author Nathalia Lanaro
 * @since 10/02/2021
 */
public class Exercicio77 {

	/*
	 * M�todo principal para executar a classe 
	 */
	public static void main(String[] args) {
		//atribuindo valores as variaveis
		int valor, soma =0;
		
		//la�o para coletar informa��es 
		for (int i = 0; i < 10; i++) {
			valor=Integer.parseInt(JOptionPane.showInputDialog("Informe um numero:"));
			//conferindo qual os numeros menor que 40
			if (valor<40) {
				soma = soma + valor;
			}
			
		}
		//mostrando na tela
		JOptionPane.showMessageDialog(null, "A soma  dos menores 40 �:"+soma);

	}

}