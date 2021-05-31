package exemplo04;

/**
 * Demonstrar la�o de peti��o while
 * 
 * @author Nathalia Lanaro
 * @since 10/02/2021
 *
 */
public class RepeticaoWhile {

	/*
	 * m�todo principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando variaveis
		int indice;

		// inicializando a variavel
		indice = 0;

		// efetuando o la�o de repti��o para exibir o cubo de um numero
		while (indice < 10) { // iniciando la�o de repeti��o
			System.out.println(indice + " ao cubo �:" + ((indice * indice) * indice));
			indice++;
		}

	}

}
