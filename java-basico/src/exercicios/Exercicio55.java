package exercicios;

import javax.swing.JOptionPane;

/**
 * programa irá ler dois times e o placar do jogo e dizer qual é o vencedor ou se houve empate
 * 
 * @author Nathalia Lanaro
 * @since 09/02/2021
 */
public class Exercicio55 {

	/*
	 * método principal para executar o programa
	 */
	public static void main(String[] args) {
		//declarando variaveis
		String time1, time2;
		int gols1, gols2;
		
		//capturando variaveis
		time1 = JOptionPane.showInputDialog("Informe o time 1:");
		time2 = JOptionPane.showInputDialog("Informe o time 2:");
		gols1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o numero de gols feito pelo time "+time1));
		gols2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o numero de gols feito pelo time "+time2));
		
		//verificando o ganhador ou se é empate
		if (gols1==gols2) {
			JOptionPane.showMessageDialog(null,"EMPATE");
		}else if (gols1>gols2) {
			JOptionPane.showMessageDialog(null, "O vencedor é o time "+time1+ "\ncom " +gols1+ " Gol(s)");
		} else {
			JOptionPane.showMessageDialog(null, "O vencedor é o time "+time2+ "\ncom " +gols2+ " Gol(s)");
		}
	}

}
