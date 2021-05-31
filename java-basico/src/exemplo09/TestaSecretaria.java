/**
 * 
 */
package exemplo09;

/**
 * classe para instanciar o objeto secretaria e exibir seus dados
 * @author Nathalia Lanaro
 * @since 23/02/2021
 *
 */
public class TestaSecretaria {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {
		
		Secretaria maria = new Secretaria();
		
		maria.setNome("Maria da silva");
		maria.setCpf("123.123.123.12-1");
		maria.setSalario("950");
		maria.setRamal(12);
		
		maria.mostrarDados();
	}

}
