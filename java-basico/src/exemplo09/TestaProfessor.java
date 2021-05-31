/**
 * 
 */
package exemplo09;

/**
 * classe responsavel por instanciar o objeto professor e exibir os seus dados
 * @author Nathalia Lanaro	
 * @since 23/02/2021
 *
 */
public class TestaProfessor {

	/*
	 *  método principal para executar a classe
	 */
	public static void main(String[] args) {
		//criando um objeto e instanciando 
		
		Professor jose = new Professor();
		jose.setNome("José Aparecido da Silva");
		jose.setCpf("123123123");
		jose.setSalario("1500");
		jose.setMateria("Matématica");
		
		jose.mostrarDados();
	}

}
