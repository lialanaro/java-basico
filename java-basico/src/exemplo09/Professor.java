
package exemplo09;

/**
 * classe para armazenar os atributos de professor e herdar os dados de funcionario (herança)
 * @author Nathalia Lanaro
 * @since 23/02/2021
 *
 */
public class Professor extends Funcionario implements InterfaceFuncionario {
	//atributos do objeto professor
	private String materia;

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}
	
	public void mostrarDados(){
		super.mostrarDados();
		System.out.println("Matéria " + materia);
	}

	@Override
	public void salvar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void alterar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void consultar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void excluir() {
		// TODO Auto-generated method stub
		
	}
	
}
