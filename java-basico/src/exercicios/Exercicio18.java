package exercicios;

import javax.swing.JOptionPane;

/**
 * programa para ler o total de eleitores e escrevar o percentual de cada
 * presenta em rela��o ao total de eleitores
 * 
 * @author Nathalia Lanaro
 * @since 05/02/2021
 */
public class Exercicio18 {

	/*
	 * m�todo principal para executar o programa
	 */
	public static void main(String[] args) {
		// declarando variaveis
		int totalEleitor, votosBrancos, votosNulos, votosValidos;
		double percBranco, percNulos, percValido;

		// capturando informa��es do usu�rio e convertendo
		totalEleitor = Integer.parseInt(JOptionPane.showInputDialog("Informe o total de eleitores"));
		votosBrancos = Integer.parseInt(JOptionPane.showInputDialog("Informe o n�mero de votos brancos"));
		votosNulos = Integer.parseInt(JOptionPane.showInputDialog("Informe o n�mero de votos nulos"));
		votosValidos = Integer.parseInt(JOptionPane.showInputDialog("Informe o n�mero de votos v�lidos"));

		// calculando os percentuais
		percBranco = votosBrancos * 100;
		percBranco = percBranco / totalEleitor;
		percNulos = votosNulos * 100;
		percNulos = percNulos / totalEleitor;
		percValido = votosValidos * 100;
		percValido = percValido / totalEleitor;

		// apresentando resultados em tela

		JOptionPane.showMessageDialog(null, "Percentual de votos Brancos:" + percBranco + "\n"
				+ "Percentual de votos Nulos: " + percNulos + "\n" + "Percentual de votos V�lidos:  " + percValido);

	}

}
