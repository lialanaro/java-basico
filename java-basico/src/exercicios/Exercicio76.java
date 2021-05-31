package exercicios;

import javax.swing.JOptionPane;

/**
 * @author Nathalia Lanaro
 * @since 10/02/2021
 */
public class Exercicio76 {

	/*
	 * Método principal para executar a classe 
	 */
	public static void main(String[] args) {
		int valor=0;
		
		
		for (int i = 0; i < 10; i++) {
			valor+=Integer.parseInt(JOptionPane.showInputDialog("Informe um valor"));
			
		}
		
		JOptionPane.showMessageDialog(null, "A soma total dos valores é: "+valor);
	}

}