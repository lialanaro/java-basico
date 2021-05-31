package exemplo07;

/**
 * @author Nathalia Lanaro
 * @since 17/02/2021
 *
 */
public class TestaPessoa {

	/*
	 * Método principal para executar a classe
	 */
	public static void main(String[] args) {
		// declarando e instanciando o objeto
		Pessoa joao = new Pessoa();
		
		//atribuindo valores ao objeto joao
		joao.setNome("João de Almeida Souza");
		joao.setSalario(1600.00);
		
		//atribuindo valores de data 
		Data dataNascimento  = new Data();
		
		dataNascimento.setDia(10);
		dataNascimento.setMes(02);
		dataNascimento.setAno(1985);
		
		joao.setDataNascimento(dataNascimento);
	
		
		System.out.println("Nome:" + joao.getNome());
		System.out.println("Data de nascimetno:" + joao.getDataNascimento());
		System.out.println(joao.getDataNascimento().getFaixaEtaria());
		System.out.println(joao.getSalarioMin());
		
		

	}

}
