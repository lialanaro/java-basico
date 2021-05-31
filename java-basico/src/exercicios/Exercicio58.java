package exercicios;

import javax.swing.JOptionPane;

/**
 * programa ira ler idade de 2 homens e 2 mulheres ira calcular a soma da idade
 * do homem mais velho com a mulher mais nova e o produto das idades do homem
 * mais novo com a mulher mais velha
 * 
 * @author Nathalia Lanaro
 * @since 09/02/2021
 *
 */
public class Exercicio58 {

	/*
	 * método principal para executar o programa
	 */
	public static void main(String[] args) {
		// declarando variaveis
		int homem1, homem2, mulher1, mulher2, soma, produto;

		// capturando informaçoes do usuario
		homem1 = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade do primeiro homem:"));
		homem2 = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade do segundo homem:"));
		mulher1 = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade da primeira mulher:"));
		mulher2 = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade da segunda mulher:"));

		// realizando verificações e calculos
		if ((homem1 > homem2) && (mulher1 > mulher2)) {
			soma = homem1 + mulher2;
			produto = homem2 * mulher1;

		} else if ((homem1 < homem2) && (mulher1 > mulher2)) {
			soma = homem2 + mulher2;
			produto = homem1 * mulher1;
		} else if ((homem1 > homem2) && (mulher1 < mulher2)) {
			soma = homem1 + mulher1;
			produto = homem2 * mulher2;
		} else {
			soma  =homem2 + mulher1;
            produto = homem1*mulher2;
		}
		//impressao em tela
		JOptionPane.showMessageDialog(null, "A soma das idades é igual a "+soma+
											"\nO produto das idades é igual a "+produto);
		
	}

}
