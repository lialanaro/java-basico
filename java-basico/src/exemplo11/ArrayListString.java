package exemplo11;

import java.util.ArrayList;

/**
 * Classe para demonstrar a utilização de arraylist string
 * 
 * @author Nathalia Lanaro
 * @since 23/02/2020
 */
public class ArrayListString {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarar e instanciar uma lista de string
		ArrayList<String> listaString = new ArrayList<String>();
		
		//adicionar registros na lista de string
		listaString.add("Elemento 1");
		listaString.add("Elemento 2");
		listaString.add("Elemento 3");
		
		//exibindo array
		System.out.println(listaString.get(0));
		System.out.println(listaString.get(1));
		System.out.println(listaString.get(2));
		
		//adicionando em uma posição especifica
		listaString.add(1,"elemento 1.50");
		
		//varrendo a lista para exibir para o usuario
		for (String elemento : listaString) {
			System.out.println(elemento);
		}
		
		//pegando o tamanho da lista
		System.out.println(listaString.size());
		
		//pesquisando um valor na lista
		if (listaString.contains("elemento 1")) {
			System.out.println("encontrado");
		} else {
			System.out.println("Não encontrado");
		}
		
		//descobrindo o indice do elemento pesquisado
		int indice = listaString.indexOf("Elemento 1");
		System.out.println("O indice é " + indice);
		
		//adicionando um novo elemento
		listaString.add("Elemento 4");
		
		//pegando o tamanho da lista novamente
		System.out.println(listaString.size());
		
		listaString.remove("Elemento 1.50");
		
	}
	
	

}
