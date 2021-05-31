package exemplo10;

/**
 * classe para armazernar atributos e m�todos do objeto usu�rio
 * @author Nathalia Lanaro
 * @since 23/02/2021
 *
 */
public class Usuario {
	//atributos do objeto
	private String nome;
	private String login;
	private String senha;
	private int idade;
	
	//m�todos para acessar os atributos
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}

}
