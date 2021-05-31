
package exemplo02;

import javax.swing.JOptionPane;


/**
 * programa para demonstrar o comando switch
 * 
 * @author Nathalia Lanaro
 * @since 08/02/2021
 */
public class CondicionalSwitch {

	/*
	 * método principal para excutar a classe
	 */
	public static void main(String[] args) {
		// declarando variaveis
		int mes;

		// capturando informação
		mes = Integer.parseInt(JOptionPane.showInputDialog("Informe o mes"));

		// exibindo o mes escolhido pelo usuario
		switch (mes) {
		case 1: {
			JOptionPane.showMessageDialog(null, "Mes escolhido é Janeiro");
			break;
		}
		case 2: {
			JOptionPane.showMessageDialog(null, "Mes escolhido é Feveiro");
			break;
		}
		case 3: {
			JOptionPane.showMessageDialog(null, "Mes escolhido é Março");
			break;
		}
		case 4: {
			JOptionPane.showMessageDialog(null, "Mes escolhido é Abril");
			break;
		}
		case 5: {
			JOptionPane.showMessageDialog(null, "Mes escolhido é Maio");
			break;
		}
		case 6: {
			JOptionPane.showMessageDialog(null, "Mes escolhido é Junho");
			break;
		}
		case 7: {
			JOptionPane.showMessageDialog(null, "Mes escolhido é Julho");
			break;
		}
		case 8: {
			JOptionPane.showMessageDialog(null, "Mes escolhido é Agosto");
			break;
		}
		case 9: {
			JOptionPane.showMessageDialog(null, "Mes escolhido é Setembro");
			break;
		}
		case 10: {
			JOptionPane.showMessageDialog(null, "Mes escolhido é Outrubro");
			break;
		}
		case 11: {
			JOptionPane.showMessageDialog(null, "Mes escolhido é Novembro");
			break;
		}
		case 12: {
			JOptionPane.showMessageDialog(null, "Mes escolhido é Dezembro");
			break;
		}
		default:
			JOptionPane.showMessageDialog(null, "Não consta no calendario");
		}

	}

}
