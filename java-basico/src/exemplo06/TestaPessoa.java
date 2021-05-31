/**
 * 
 */
package exemplo06;

/**
 * Classe para demonstrar a utilização do objeto Pessoa
 * 
 * @author Nathalia Lanaro
 *
 */
public class TestaPessoa {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {

		// declarando objeto pessoa
		Pessoa joao;

		// inicializando o objeto (instancia de objeto)
		joao = new Pessoa();

		// atribuindo valores do objeto joao
		joao.nome = "João de Souza Almeida";
		joao.dataNascimento = "23/05/1886";
		joao.altura = 1.89;
		joao.peso = 86;
		joao.sexo = "masculino";

		// declarando objeto pessoa maria
		Pessoa maria;
		// inicializando objeto maria (instancia do objeto)
		maria = new Pessoa();

		// atribiindo valores do objeto maria
		maria.nome = "Maria da silva Souza";
		maria.dataNascimento = "12/08/1985";
		maria.altura = 1.52;
		maria.peso = 65;
		maria.sexo = "Feminino";

		// exibindo o objeto joao
		System.out.println("Nome: " + joao.nome);
		System.out.println("Data de nascimento: " + joao.dataNascimento);
		System.out.println("Altura: " + joao.altura);
		System.out.println("Peso: " + joao.peso);
		System.out.println("Sexo: " + joao.sexo);

		// pulando uma linha
		System.out.println(" ");

		// exibindo objeto maria
		System.out.println("Nome: " + maria.nome);
		System.out.println("Data de nascimento: " + maria.dataNascimento);
		System.out.println("Altura: " + maria.altura);
		System.out.println("Peso: " + maria.peso);
		System.out.println("Sexo: " + maria.sexo);

		// pulando uma linha
		System.out.println(" ");
		
		//exibindo joao pelo metodo
		joao.exibirDados();
		
		// pulando uma linha
		System.out.println(" ");
		
		maria.exibirDados();

	}

}
