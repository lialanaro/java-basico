package exercicios;

import javax.swing.JOptionPane;

/**
 * programa para ler valor de salario e quantidade de filhos
 * 
 * @author Nathalia Lanaro
 * @since 10/02/2021
 */
public class Exercicio84 {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {
		// informando variaveis e inicializando
		double salario, mediaSalario = 0, maior = 0, menor = 0;
		int filhos = 0, contador = 0;

		// capturando informações
		salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o salario"));

		// verificando se o salario é maior que 0 e pedindo a quantidade de filhos
		if (salario > 0) {
			filhos += Integer.parseInt(JOptionPane.showInputDialog("Quantidade de filhos"));
			mediaSalario += salario;
			maior = salario;
			// fazendo a contagem de pessoas com salario abaixo de R$150
			if (salario < 150) {
				menor++;
			}
			contador++;
			// laço para continuar pedindo informações ate que um salario seja negativo
			while (salario > 0) {
				salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o salario"));
				if (salario > 0) {
					filhos += Integer.parseInt(JOptionPane.showInputDialog("quantidade de filhos"));
					mediaSalario += salario;
					maior = salario;
					if (salario > maior) {
						maior = salario;
					}
					if (salario < 150) {
						menor++;
					}
					contador++;
				}

			}

		}
		// apresentando os resultados em tela
		// resultado da questao A
		if (contador != 0) {
			JOptionPane.showMessageDialog(null, "Média de salário de população " + mediaSalario / contador);
		} else {
			JOptionPane.showMessageDialog(null, "0");
		}
		// resultado da questao B
		JOptionPane.showMessageDialog(null, "média do numero de filhos " + filhos / contador);
		// resultado da questao C
		JOptionPane.showMessageDialog(null, "Maior salário dos habitantes " + maior);
		// resultado da questão D
		JOptionPane.showMessageDialog(null,
				"% de pessoas com salario menor que R$150: " + ((menor / contador) * 100 + "%"));
	}
}
