package exercicios;

import javax.swing.JOptionPane;

/**
 * receber dados do usu�rio e verfificar se ele pode requerer ou n�o a aposentadoria
 * @author Nathalia Lanaro
 * @since 09/02/2021
 *
 */
public class Exercicio63 {

	/*
	 * m�todo principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando variaveis
		int cod, anoNascimento, anoEmpresa, idade, tempoTrab;

		// capturando codigo
		cod = Integer.parseInt(JOptionPane.showInputDialog("Informe o codigo do colaborador"));
		anoNascimento = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano do seu nascimento"));
		anoEmpresa = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano em que voc� entrou na empresa"));

		// calculo
		idade = 2021 - anoNascimento;
		tempoTrab = 2021 - anoEmpresa;
		
		//verificando se pode ou nao aposentar 
		if ((idade >= 65) ||  (tempoTrab >=30) || (idade >=60) &&(tempoTrab >=25)) {
			JOptionPane.showMessageDialog(null, "Requer aposentadoria");
			
		} else {
			JOptionPane.showMessageDialog(null, " N�o Requer aposentadoria");
			
		}

	}

}
