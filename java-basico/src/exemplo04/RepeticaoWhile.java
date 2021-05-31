package exemplo04;

/**
 * Demonstrar laço de petição while
 * 
 * @author Nathalia Lanaro
 * @since 10/02/2021
 *
 */
public class RepeticaoWhile {

	/*
	 * método principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando variaveis
		int indice;

		// inicializando a variavel
		indice = 0;

		// efetuando o laço de reptição para exibir o cubo de um numero
		while (indice < 10) { // iniciando laço de repetição
			System.out.println(indice + " ao cubo é:" + ((indice * indice) * indice));
			indice++;
		}

	}

}
