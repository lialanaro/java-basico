package exercicios;

import javax.swing.JOptionPane;

/**
 * ler o numero de alunos na sala e as notas dos mesmos e devolver a média
 * @author Nathalia Lanaro
 * @since 10/02/2021
 */
public class Exercicio75 {

	/*
	 * Método principal para executar a classe 
	 */
	public static void main(String[] args) {
		//declarando variaveis
		int alunos;
		double notas, media;
		notas=0;
		
		//capturando o numero de alunos
		alunos = Integer.parseInt(JOptionPane.showInputDialog("Informe o numero de alunos"));
		
		//laço para capturar a nota dos alunos
		for (int i = 0; i < alunos; i++) {
			notas+=Double.parseDouble(JOptionPane.showInputDialog("Informe a nota dos alunos"));
			
		}
		
		//calculando a média
		media = notas/alunos;
		//exibindo na tela
		JOptionPane.showMessageDialog(null, "A média dos alunos é:"+media);
	}

}
