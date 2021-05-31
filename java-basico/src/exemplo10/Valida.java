/**
 * 
 */
package exemplo10;

/**
 * classe responsavel por armazenar m�todos de valida��o de classes
 * @author Nathalia Lanaro
 * @since 23/02/2021
 *
 */
public class Valida {
	//m�todo para validar string vazia
	public static boolean isStringVazio(String args) { 
		//trim tira os espa�os de uma variavel tipo string
		if (args.trim().equals("")) {
			return true;
		} else {
			return false;
		}
		
	}//fim do m�todo
	//m�todo para verificar string v�lida
	public static boolean isStringValida(String args) {
		//matches verifica se o tem letras de A a Z, maisculas e minusculas e acentuadas
		if (!args.matches("[0-9]*")) {
			return true;
		} else {
			return false;
		}
	}//fim do m�todo
	
	//m�todo para verificar se � numero
	public static boolean isNumber(String args) {
		try {
			int numero = Integer.parseInt(args);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}
