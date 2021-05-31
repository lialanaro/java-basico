package exemplo09;

/**
 * classe para demonstrar o conceito de herança de método e atributos
 * 
 * @author Nathalia Lanaro
 * @since 23/02/2021
 *
 */
public  abstract class  Funcionario {
	//atributos do objeto funcionario
	private String nome;
	private String cpf;
	private String salario;
	
	//método para acessar os atributos
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getSalario() {
		return salario;
	}
	public void setSalario(String salario) {
		this.salario = salario;
	}
	
	//método simples para mostrar os atributos
	public void mostrarDados() {
		
		System.out.println("Nome:" + nome);
		System.out.println("CPF: " + cpf);
		System.out.println("Salário:" + salario);
	}
	
	
}
