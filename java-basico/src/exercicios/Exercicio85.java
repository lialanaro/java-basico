package exercicios;

/**
 * programa ira imprimir uma tabuada de 1 a 10 para os numeros de 1 a 10
 * 
 * @author Nathalia Lanaro
 * @since 11/02/2021
 */
public class Exercicio85 {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando variaveis e inicializando
		String resultado = "";

		// laço for para calculo da tabuada
		for (int i = 1; i < 11; i++) {
			resultado += "Tabuada do número:" + i + "\n" +"\n";

			for (int j = 1; j < 11; j++) {
				resultado += i + " x " + j + " = " + i * j + "\n" +"\n";
			}
		}

		// apresentando resultado no console
		System.out.println(resultado);

	}

}