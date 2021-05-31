package exemplo10;

import javax.swing.JOptionPane;

/**
 * classe para demonstrar as exce��es em Java
 * 
 * @author Nathalia Lanaro
 * @since 23/02/2021
 */
public class TestaUsuario {

	public void receberDados() {
		if (Valida.isStringVazio(JOptionPane.showInputDialog(Mensagem.informeNome))) {
			JOptionPane.showMessageDialog(null, Mensagem.nomeVazio, "Cadastro de Usu�rio", 0);

		} else {
			JOptionPane.showMessageDialog(null, "Nome v�lido", "Cadastro de Usu�rio", 1);
		}

		if (Valida.isStringValida(JOptionPane.showInputDialog(Mensagem.informeNome))) {
			JOptionPane.showMessageDialog(null, "Nome v�lido", "Cadastro de Usu�rio", 1);

		} else {
			JOptionPane.showMessageDialog(null, Mensagem.nomeInvalido, "Cadastro de Usu�rio", 0);
		}
		
		if (Valida.isNumber(JOptionPane.showInputDialog(Mensagem.informeIdade))) {
			JOptionPane.showMessageDialog(null, "Idade v�lida", "Cadastro de usu�rio", 1);
		} else {
			JOptionPane.showMessageDialog(null, Mensagem.idadeInvalida, "Cadastro de usu�rio", 0);
		}
	}

	public static void main(String[] args) {
		new TestaUsuario().receberDados();
	}
}
