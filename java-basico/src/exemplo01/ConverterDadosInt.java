package exemplo01;

import javax.swing.JOptionPane;

/**
 * programa para demonstrar conversão de tipo de dados
 * @author nlanaro
 * @since 05/02/2021
 *
 */
public class ConverterDadosInt {

	/*
	 *metodo principal
	 */
	public static void main(String[] args) {
		
		//declarando variaveis
		int valor1;
		int valor2;
		int resultado;
		
		//recebendo valor do usuario
		valor1 = Integer.parseInt(JOptionPane.showInputDialog("informe o primeiro valor"));
		valor2 = Integer.parseInt(JOptionPane.showInputDialog("informe o segundo valor"));
		
		//calculando
		resultado = valor1 + valor2;
		
		System.out.println("o resultado é:" + resultado);
	}

}
