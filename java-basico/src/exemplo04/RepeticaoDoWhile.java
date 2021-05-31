/**
 * 
 */
package exemplo04;

/**
 * este programa irá demonstrar a demonstração de repetição Do While
 * 
 * @author Nathalia Lanaro
 * @since 10/02/2021
 */
public class RepeticaoDoWhile {

	/*
	 * Método principal para executar o programa
	 */
	public static void main(String[] args) {
		// declarando variaveis
		int i;

		// inicializando variaveis
		i = 10;

		do {
			System.out.println(i + " Ao cubo é " + ((i * i) * i));

		} while (i < 10); //verifica depois 

	}

}
