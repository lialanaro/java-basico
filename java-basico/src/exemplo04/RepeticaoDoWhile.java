/**
 * 
 */
package exemplo04;

/**
 * este programa ir� demonstrar a demonstra��o de repeti��o Do While
 * 
 * @author Nathalia Lanaro
 * @since 10/02/2021
 */
public class RepeticaoDoWhile {

	/*
	 * M�todo principal para executar o programa
	 */
	public static void main(String[] args) {
		// declarando variaveis
		int i;

		// inicializando variaveis
		i = 10;

		do {
			System.out.println(i + " Ao cubo � " + ((i * i) * i));

		} while (i < 10); //verifica depois 

	}

}
