package exercicios;

import javax.swing.JOptionPane;

/**
 * 
 * @author nlanaro
 * @since 09/02/2021
 *
 */
public class Exercicio60 {

	/*
	 * método principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando variaveis
		int codigoCerto, senhaCerta, codigo, senha;

		// atribuindo valores
		codigoCerto = 1234;
		senhaCerta = 9999;

		// capturando informações do usuario
		codigo = Integer.parseInt(JOptionPane.showInputDialog("informe o código de usuário:"));
		// verificando codigo
		if (codigo != codigoCerto) {
			JOptionPane.showMessageDialog(null, "usuário invalido");
		} else {
			senha = Integer.parseInt(JOptionPane.showInputDialog("informe a senha:"));
			if (senha != senhaCerta) {
				JOptionPane.showMessageDialog(null, "senha incorreta");
			} else {
				JOptionPane.showMessageDialog(null, "Acesso permitido");
			}
		}
	}

}
