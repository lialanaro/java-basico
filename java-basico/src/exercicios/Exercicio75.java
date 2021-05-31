package exercicios;

import javax.swing.JOptionPane;

/**
 * ler o numero de alunos na sala e as notas dos mesmos e devolver a m�dia
 * @author Nathalia Lanaro
 * @since 10/02/2021
 */
public class Exercicio75 {

	/*
	 * M�todo principal para executar a classe 
	 */
	public static void main(String[] args) {
		//declarando variaveis
		int alunos;
		double notas, media;
		notas=0;
		
		//capturando o numero de alunos
		alunos = Integer.parseInt(JOptionPane.showInputDialog("Informe o numero de alunos"));
		
		//la�o para capturar a nota dos alunos
		for (int i = 0; i < alunos; i++) {
			notas+=Double.parseDouble(JOptionPane.showInputDialog("Informe a nota dos alunos"));
			
		}
		
		//calculando a m�dia
		media = notas/alunos;
		//exibindo na tela
		JOptionPane.showMessageDialog(null, "A m�dia dos alunos �:"+media);
	}

}
