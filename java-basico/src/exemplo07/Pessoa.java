package exemplo07;

/**
 * Classe para armazenar os atributos e m�todo do atributo pessoa
 * 
 * @author Nathalia Lanaro
 * @since 17/02/2021
 *
 */
public class Pessoa {
	// declarando os atributos pessoa
	private String nome;
	private Data dataNascimento;
	private Double salario;

	// m�todo para acessar os atributos
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Data getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Data dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public String getSalarioMin() {
		if (salario > 1135.55) {
			return "Acima do sal�rio Minimo";
		} else {
			return "Abaixo do sal�rio Minimo";
		}

	}

}
