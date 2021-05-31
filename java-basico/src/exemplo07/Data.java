/**
 * 
 */
package exemplo07;

/**
 * Classe para armazenar os m�todos e atributos do objeto data
 * 
 * @author Nathalia Lanaro
 *
 */
public class Data {
	// declarando variaveis
	private int dia;
	private int mes;
	private int ano;

	// m�todo getters e setters do atributo
	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	@Override
	public String toString() {
		return dia + "/" + mes + "/" + ano;
	}

	public String getFaixaEtaria() {
		if ((2021 - ano)>= 18) {
			return "Maior idade";
		} else {
			return "Menor de idade";
		}
	
	
	}
}
