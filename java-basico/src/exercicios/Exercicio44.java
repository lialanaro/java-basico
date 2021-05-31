package exercicios;

import javax.swing.JOptionPane;

/**
 * programa ir� escrever o salario total do funcionario baseado no tanto de
 * horas que ele trabalha e nas horas extras caso ele tenha feito
 * 
 * @author Nathalia Lanaro
 * @since 09/02/2021
 */
public class Exercicio44 {

	/*
	 * m�todo principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando variaveis
		double horasTrabalhadas, salarioHora, salarioMes, horaExtra;
		salarioMes = 0;

		// capturando informa��es
		horasTrabalhadas = Double
				.parseDouble(JOptionPane.showInputDialog("Informe a quantidade de horas trabalhadas:"));
		salarioHora = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor em R$ do seu sal�rio por hora:"));

		// verificando se o funcionario fez hora extra e calculando o salario
		if (horasTrabalhadas > 160) {
			horaExtra = horasTrabalhadas * salarioMes;
			salarioMes = horasTrabalhadas * salarioHora + (horaExtra * (salarioHora * 1.5));
			// impressao em tela
			JOptionPane.showMessageDialog(null, "o valor total do sal�rio � R$" + salarioMes);
		} else {
			salarioMes = horasTrabalhadas * salarioHora;
			JOptionPane.showMessageDialog(null, "o valor total do sal�rio � R$" + salarioMes);

		}
	}

}
