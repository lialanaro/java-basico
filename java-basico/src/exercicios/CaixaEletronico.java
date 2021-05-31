package exercicios;

import javax.swing.JOptionPane;

/**
 * programa que irá simular um caixa eletronico
 * 
 * @author Nathalia lanaro
 * 
 * @since 08/02/2021
 *
 */
public class CaixaEletronico {

	/*
	 * método principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando as variaveis
		double saque;
		int n2, n5, n10, n20, n50, r2, r5, r10, r20, r50, valor;
		//inicializando as variaveis para nao vir com lixo
		r2 = 0;
		r5 = 0;
		r10 = 0;
		r20 = 0;
		r20 = 0;
		n2 = 0;
		n5 = 0;
		n10 = 0;
		n20 = 0;
		n50 = 0;
		
		//capturando valor do usuario
		saque = Double.parseDouble(JOptionPane.showInputDialog("*********Caixa Eletronico*************" + "\n"
				+ "O caixa só possui notas de 2,5,10,20,50" + "\n" + "Digite o valor que deseja sacar:"));
		
		//convertendo saque
		valor = (int) saque;
		
		//verificando se o valor é menor que 2 ou 3 ou se é valor decimal ou não
		if ((saque < 2) || (saque == 3) || (saque - valor > 0)) {
			JOptionPane.showMessageDialog(null, "Digite um valor válido");
		} else {
			//distribuição de notas
			n50 = valor / 50;
			r50 = valor % 50;

			n20 = r50 / 20;
			r20 = r50 % 20;

			n10 = r20 / 10;
			r10 = r20 % 10;

			n5 = r10 / 5;
			r5 = r10 % 5;

			n2 = r5 / 2;
			r2 = r5 % 2;

			// verificando o arrendondamento de numeros terminados em 3 e 1
			if (r2 > 0) {
				if ((valor % 50 == 1) || (valor % 50 == 3)) {
					n50 = n50 - 1;
					n20 = n20 + 2;
					n5 = n5 + 1;
					n2 = n2 + 3;
					
				} else { //outros arrendondamentos
					if (n5 > 0) {
						n5 = n5 - 1;
						n2 = n2 + 3;

					} else if (n10 > 0) {
						n10 = n10 - 1;
						n5 = n5 + 1;
						n2 = n2 + 3;

					} else if (n20 > 0) {
						n20 = n20 - 1;
						n10 = n10 + 1;
						n5 = n5 + 1;
						n2 = n2 + 3;

					} else {
						n50 = n50 - 1;
						n20 = n20 + 1;
						n10 = n10 + 1;
						n5 = n5 + 1;
						n2 = n2 + 3;
					}

				}
			}

			// impressao em tela
			JOptionPane.showMessageDialog(null, "Valor sacado é R$" + saque + "\n" +
												"Notas de R$50: " + n50 + "\n" + 
												"Notas de R$20: " + n20 + "\n"+
												"Notas de R$10: " + n10 + "\n" +
												"Notas de R$5: " + n5 + "\n" + 
												"Notas de R$2: " + n2);

		}

	}

}
