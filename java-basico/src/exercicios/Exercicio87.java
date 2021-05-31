package exercicios;


/**
 * programa para desenhar na tela um retangulo de 60 colunas e 10 linhas
 * 
 * @author Nathalia Lanaro
 * @since 11/02/2021
 */
public class Exercicio87 {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {
	//declarando variavaveis e inicializando
		String retangulo = "";
		int linhas, coluna;
		
		//laço para verificar as linhas 
		for (linhas = 0; linhas < 10; linhas++) {
			//colunas 
			for (coluna = 0; coluna< 60; coluna++) {
				//primeira/ultima linha
				if((linhas == 0) || (linhas == 9)) {
					retangulo += "+";
				//primeira/ultima coluna
				} else if ((coluna == 0) || (coluna == 59)) {
					retangulo += "+";
				} else {
					retangulo += " ";
				}
			}
			//quebra de linha 
			retangulo += "\n";
		}
		
		//imprimindo no consoless
		System.out.println(retangulo);
	}

}
