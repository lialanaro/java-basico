package exemplo09;

/**
 * Classe para armazenar atributos e metodos de secretaria e herdar a classe funcionario
 * @author Nathalia
 * @since 23/02/2021
 *
 */
public class Secretaria extends Funcionario{
	private int ramal;

	public int getRamal() {
		return ramal;
	}

	public void setRamal(int ramal) {
		this.ramal = ramal;
	}
	
	public void mostrarDados() {
		super.mostrarDados();
		System.out.println("Ramal " + ramal);
	}
	
}
