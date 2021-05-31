package exercicios;

/**
 * Classe para armazenar métodos para validações da classe VerificaArrayList
 * @author Nathalia Lanaro
 * @since 26 de Fevereiro 2021
 *
 */
public class ValidaVerificaArray {
	public static boolean isEmptyOrNull(String string) {
		return (string == null || string.trim().equals("") || string.trim().length() <2);

	}
	
	public static boolean notNumero(String string) {
		if (string.matches("[a-z A-Z]*")) {
			return true;
			
		} else {
			return false;
		}
		
	}
	
	public static String trimAll(String text){
		String string = text.trim();
		while (string.contains("  ")) {
			string = string.replaceAll("  ", " ");
		}
		return string;
	}

}
