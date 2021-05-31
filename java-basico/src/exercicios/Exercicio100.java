package exercicios;

import javax.swing.JOptionPane;

/**
 * programa para ler e armazenar em um vetor e a temperatura média e calcular e
 * devolver menor temperatura da semana, maior temperatura da semana,
 * temperatura média semanal e o numero de dias na semana.
 * 
 * @author Nathalia Lanaro
 * @since 15/02/2021
 *
 */
public class Exercicio100 {

	/*
	 * método principal para executar o programa
	 */
	public static void main(String[] args) {
		// declarando vetores
		double vetor[];
		// declarando variaveis
		double maior, menor, media;
		int quantidade = 0;
		String dia = "";

		// inicializando vetor
		vetor = new double[7];

		// for para capturar as temperaturas
		for (int i = 0; i < vetor.length; i++) {
			// switch para verificar o dia de cada um dos dias da semana
			switch (i) {
			case 0:
				dia = " segunda-feira";
				break;
			case 1:
				dia = "de terça- feira";
				break;
			case 2:
				dia = "quarta-feira";
				break;
			case 3:
				dia = "quinta-feira";
				break;
			case 4:
				dia = "sexta-feira";
				break;
			case 5:
				dia = "sábado";
				break;
			case 6:
				dia = "domingo";
				break;
			}
			vetor[i] = Double.parseDouble(JOptionPane.showInputDialog("Qual a temperatura de" + dia));

		}
		
		//calcular menor e maior temperatura
		maior = vetor[0];
		menor = vetor[0];
		media = vetor[0];

		for (int i = 1; i < vetor.length; i++) {
			media += vetor[i];
			if (vetor[i] > maior) {
				maior = vetor[i];
			}
			if (vetor[i] < menor) {
				menor = vetor[i];
			}
		}

		// calcular media
		media = media / vetor.length;

		// for para verificar quem está acima da média
		for (int i = 1; i < vetor.length; i++) {
			if (vetor[i] > media) {
				quantidade++;
			}
		}
		// apresentando o resultado na tela
		JOptionPane.showInternalMessageDialog(null,
				"A maior temperatura foi: " + maior + "°C" + "\nA menor temperatura foi:  " + menor + "°C"
						+ "\nA média de temperatura foi:  " + media + "°C"
						+ "\nA quantidade de dias que a temperatura foi inferior a média semanal foi:  " + quantidade
						+ " dias");

	}

}
