/**
 * 
 */
package exemplo05;

/**
 * programa para demonstrar a utilizacao de vetor do tipo inteiro
 * @author Nathalia Lanaro
 * @since 11/02/2021
 *
 */
public class VetorInteiro {

	/*
	 * m�todo principal para executar o programa 
	 */
	public static void main(String[] args) {
		// declarando vetor
		int vetor[];
		
		//iniciando o vetor e informando a quantidade de posi��es (tamanho)
		vetor = new int [3];
		//adicionando o valor 10 na primeira posi��o do vetor no indice 0
		vetor [0] = 10;
		//adicionando o valor 5 na segunda posi��o do vetor no indice 1
		vetor [1] =5;
		//adicionando o valor 25 na terceira posi��o do vetor no indice 2
		vetor[2]=25;
		
		//exibindo valor na primeira posi��o do vetor
		System.out.println(vetor[0]);
		System.out.println(vetor[1]);
		System.out.println(vetor[2]);
	}

}
