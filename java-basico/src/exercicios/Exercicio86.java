package exercicios;

/**
 * programa ir� imprimir sequencias de numeros de 1 a 10
 * 
 * @author Nathalia Lanaro
 * @since 11/02/2021
 */
public class Exercicio86 {

	/*
	 * M�todo principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando a inicializando variavel
		String resultado = "";
		// la�o for para organizar as sequ�ncias
		for (int i = 1; i < 11; i++) {
			resultado += i + ",";
			for (int j = 1; j < 11; j++) {
				resultado += j;
			}
			resultado += "\n";
		}

		// apresentando resultado em tela
		System.out.println(resultado);

	}

}