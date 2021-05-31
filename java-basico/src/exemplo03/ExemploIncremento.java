package exemplo03;

/**
 * programa para demonstar o incremento e o decremento de valores
 * 
 * @author Nathalia Lanaro
 * @since 10/02/2021
 */
public class ExemploIncremento {

	/*
	 * método principal para declarar a variavel
	 */
	public static void main(String[] args) {
		// declarando variaveis
		int numero;
		
		numero = 1;
		System.out.println(numero); //exibindo o valor 1 
		
		numero = numero +1; //incremento
		System.out.println(numero); //exibindo valor 2
		
		numero++; //incremento
		
		System.out.println(numero); //exibindo valor 3
		
		System.out.println(numero++); //exibindo valor 3
		
		System.out.println(numero); //exibindo valor 4
		
		System.out.println(++numero);//exibindo valor 5 
		
		
		
	}

}
