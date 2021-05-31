package exercicios;

import javax.swing.JOptionPane;

/**
 * ler 10 valores e calcular a média aritmética desses valores lidos
 * 
 * @author Nathalia Lanaro
 * @since 10/02/2021
 */
public class Exercicio74 {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {
		//criando variaveis
		int valor, media, contador;
		
		//inicializando variaveis
		contador = 0;
		valor = 0;

		while (contador < 10) {
			//recebendo o valor e somando com o anterior
			valor += Integer.parseInt(JOptionPane.showInputDialog("Informe um valor"));
			contador = contador + 1;

		}
		
		//fazendo calculo
		media = (valor / 10);
		//apresentando valor
		JOptionPane.showMessageDialog(null, "Media dos 10 numeros é:" + media);

	}

}
