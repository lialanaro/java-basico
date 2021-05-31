/**
 * 
 */
package exemplo10;

/**
 * classe responsavel por armazenar métodos de validação de classes
 * @author Nathalia Lanaro
 * @since 23/02/2021
 *
 */
public class Valida {
	//método para validar string vazia
	public static boolean isStringVazio(String args) { 
		//trim tira os espaços de uma variavel tipo string
		if (args.trim().equals("")) {
			return true;
		} else {
			return false;
		}
		
	}//fim do método
	//método para verificar string válida
	public static boolean isStringValida(String args) {
		//matches verifica se o tem letras de A a Z, maisculas e minusculas e acentuadas
		if (!args.matches("[0-9]*")) {
			return true;
		} else {
			return false;
		}
	}//fim do método
	
	//método para verificar se é numero
	public static boolean isNumber(String args) {
		try {
			int numero = Integer.parseInt(args);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}
