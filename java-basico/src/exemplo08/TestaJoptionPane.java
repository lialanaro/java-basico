package exemplo08;

import javax.swing.JOptionPane;

/**
 * Classe para demonstrar a utilização do componente JOption pane acessando
 * atributos estaticos
 * 
 * @author Nathalia Lanaro
 * @since 23/02/2021
 *
 */
public class TestaJoptionPane {

	/*
	 * método principal para executar a classe
	 */
	public static void main(String[] args) {
		//utilizando o joptionpane com construtor para exibir um erro
		
		JOptionPane.showMessageDialog(null, Mensagem.sucessoIncluido, Titulo.cadastroUsuario, 0); //0 mensagem de erro
		JOptionPane.showMessageDialog(null, "conteudo", "Titulo", 1); //1 mensagem de informação
		JOptionPane.showMessageDialog(null, "conteudo", "Titulo", 2); //2 mensagem de advertencia
		JOptionPane.showMessageDialog(null, "conteudo", "Titulo", 3); //3 mensagem de interrogação
	}

}
