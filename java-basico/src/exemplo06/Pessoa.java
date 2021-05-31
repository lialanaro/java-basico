
package exemplo06;

/**
 * Classe para demonstrar a utilização de objetos Reponsável por armazenar seus
 * atributos e métodos
 * 
 * @author Nathalia Lanaro
 * @since 17/02/2021
 *
 */
public class Pessoa {
	// atributos ou caracteriscas do objeto
	String nome;
	String dataNascimento;
	double altura;
	double peso;
	String sexo;

	// método para exibir os dados do objeto nao retorna nada, apenas executar
	public void exibirDados() {
		System.out.println("Nome: " + nome);
		System.out.println("Data de nascimento: " + dataNascimento);
		System.out.println("Altura: " + altura);
		System.out.println("Peso: " + peso);
		System.out.println("Sexo: " + sexo);
		System.out.println("Idade" + calcularIdade());
		System.out.println("Faixa Etária" + faixaEtaria());

	}

	public int calcularIdade() {
		int idade = 0;

		// declarando variaveis
		int anoNascimento = 0;
		int anoAtual = 2021;

		// quebrando a data tipo string
		String dataQuebrada[] = dataNascimento.split("/");
		anoNascimento = Integer.parseInt(dataQuebrada[2]);

		// calculo da idade do objeto
		idade = anoAtual - anoNascimento;

		// retornando a idade calculada
		return idade;
	}

	public String faixaEtaria() {
		if (calcularIdade() >= 18) {
			return "Maior idade";
		} else {
			return "Menor de idade";
		}

	}

}
