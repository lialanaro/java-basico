package exercicios;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;

/**
 * Classe que pode cadastrar até 10 nomes, excluir, listar por ordem alfabética,
 * mostrar nomes iguais, pesquisa e pesquisa por letra inicial
 * 
 * @author Nathalia Lanaro
 * @since 26 de Fevereiro de 2021
 *
 */
public class VerificaArrayList {
	// declarando array de string
	private ArrayList<String> nomes;
	private ArrayList<String> ordenaLetras;

	// método construtor
	public VerificaArrayList() {
		// instanciando o array
		nomes = new ArrayList<String>();

		menuVerificarString();
	}

	// menu inicial
	public void menuVerificarString() {
		String menu = "============ M E N U ==============" + " \n1 - CADASTRAR NOME" + " \n2 - EXCLUIR NOME"
				+ " \n3 -LISTA DE NOMES CADASTRADOS" + " \n4 - LISTA NOMES EM LISTA ALFABETICA"
				+ " \n5 - LISTAR NOMES IGUAIS" + " \n6 - LISTAR NOME POR LETRA INICIAL" + " \n7 -PESQUISAR NOME"
				+ " \n8 - SAIR DO SISTEMA" + "\n=======ESCOLHA UMA OPÇÃO========";

		while (true) {
			try {
				int opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));
				processamentoPrincipal(opcao);

			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, MensagemVerificaArray.opcao, RotuloVerificaArray.menu, 0);
			}

		}

	}

	// switch para tratar as opções
	public void processamentoPrincipal(int opcao) {

		switch (opcao) {
		case 1: {
			cadastrarNome();

			break;
		}

		case 2: {
			excluirNome();
			break;
		}

		case 3: {
			listarNomeCadastrado();

			break;
		}
		case 4: {
			listarOrdemAlfabética();

			break;
		}
		case 5: {
			listarNomesIguais();

			break;
		}
		case 6: {
			listarPorLetraInicial();

			break;
		}
		case 7: {
			pesquisarNome();
			break;
		}

		case 8: {
			sair();
			break;
		}

		default:
			JOptionPane.showMessageDialog(null, MensagemVerificaArray.opcao, RotuloVerificaArray.menu, 0);
		}

	}// fim do método

	// método para cadastrar nome
	public void cadastrarNome() {
		String nome;
		boolean executa = true;
		if (nomes.size() > 9) {
			JOptionPane.showMessageDialog(null, MensagemVerificaArray.limite, RotuloVerificaArray.erro, 0);
			;
		} else {

			while (executa) {
				try {
					nome = JOptionPane.showInputDialog(MensagemVerificaArray.informeNome);
					// verifica se nao tem numeros
					if (!ValidaVerificaArray.notNumero(nome)) {

						JOptionPane.showMessageDialog(null, MensagemVerificaArray.nomeInvalido,
								RotuloVerificaArray.erro, 0);
						executa = true;
						// verifica se ta vazio e se é um nome com mais de uma letra
					} else if (ValidaVerificaArray.isEmptyOrNull(nome)) {
						JOptionPane.showMessageDialog(null, MensagemVerificaArray.nomeVazio, RotuloVerificaArray.erro,
								0);

						executa = true;

					} else {
						// adicionando nome no array
						nomes.add(nome);
						executa = false;
						JOptionPane.showMessageDialog(null, MensagemVerificaArray.cadastroSucesso);

					}

				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, MensagemVerificaArray.nomeInvalido, RotuloVerificaArray.erro,
							0);
				}

			}
		}

	}

	// método para excluir nome
	public void excluirNome() {
		int contador = 0;
		String mensagem = "Nomes Cadastrados\n";
		boolean existe = false;
		boolean execute = false;
		while (execute) {

		}

		for (String nome : nomes) {
			existe = true;
			mensagem += "\nCódigo: " + contador + " " + nome;
			contador++;
		}

		if (existe) {
			contador = Integer
					.parseInt(JOptionPane.showInputDialog(mensagem + "\n\n" + MensagemVerificaArray.excluirNome));
			int opcao = JOptionPane.showConfirmDialog(null, "Certeza que deseja Excluir esse nome?", "Atenção",
					JOptionPane.YES_OPTION, JOptionPane.CANCEL_OPTION);

			if (opcao == JOptionPane.YES_OPTION) {
				nomes.remove(contador);
				JOptionPane.showMessageDialog(null, MensagemVerificaArray.nomeExcluido, RotuloVerificaArray.excluirNome,
						1);
			}

		} else {
			JOptionPane.showMessageDialog(null, MensagemVerificaArray.semRegistros, RotuloVerificaArray.excluirNome, 2);
		}

	}

	// método para listar nome cadastrado
	public void listarNomeCadastrado() {
		String mensagem = "";
		boolean existe = false;
		for (String nome : nomes) {
			existe = true;
			mensagem += "\nNome: " + nome;

		}

		if (existe) {
			JOptionPane.showMessageDialog(null, mensagem, RotuloVerificaArray.nomesCadastrados, 1);
		} else {
			JOptionPane.showMessageDialog(null, MensagemVerificaArray.semRegistros,
					RotuloVerificaArray.nomesCadastrados, 2);
		}

	}

	// método p listar em ordem alfabética
	public void listarOrdemAlfabética() {
		String mensagem = "";
		boolean existe = false;
		// criando uma lista nova e copiando todos os seus atributos para ordenar
		ordenaLetras = new ArrayList<String>();
		ordenaLetras.addAll(nomes);
		Collections.sort(ordenaLetras);
		for (String letras : ordenaLetras) {
			existe = true;
			mensagem += "\nNome: " + letras;

		}

		if (existe) {
			JOptionPane.showMessageDialog(null, mensagem, RotuloVerificaArray.listaOrdenada, 1);
		} else {
			JOptionPane.showMessageDialog(null, MensagemVerificaArray.semRegistros, RotuloVerificaArray.listaOrdenada,
					2);
		}

	}

	// método p listar nomes iguais
	public void listarNomesIguais() {
		boolean existe = false;
		String msg = "";
		String mensagem = "";
		for (int i = 0; i < nomes.size(); i++) {
			// verificando as ocorrencias de nomes iguais no array
			int quantidade = Collections.frequency(nomes, nomes.get(i));
			if (quantidade > 1) {
				msg += "O nome repetido é : " + nomes.get(i) + "  \n" + "Com um total de : " + quantidade + " repetições  \n\n";
				i += (quantidade - 1);
				existe = true;
			}

		}

		mensagem += msg;
		// if verificando se existe ou não registros e apresentando o resultado de
		// acordo
		if (existe) {
			JOptionPane.showMessageDialog(null, mensagem, RotuloVerificaArray.listarNomeIgual, 1);
		} else {
			JOptionPane.showMessageDialog(null, MensagemVerificaArray.pesquisa, RotuloVerificaArray.atencao, 2);
		}
	}

	// método p listar por letra inicial
	public void listarPorLetraInicial() {
		String mensagem = "";

		// verificando se o usuário nao digitou numeros
		String pesquisaLetra = JOptionPane.showInputDialog("Informe a letra inical para a pesquisa");
		if (pesquisaLetra.length() > 1 || !ValidaVerificaArray.notNumero(pesquisaLetra)) {
			JOptionPane.showMessageDialog(null, MensagemVerificaArray.erroLetra, RotuloVerificaArray.erro, 0);
		} else {

			boolean existe = false;
			// verificando os nomes que contem a primeria letra
			for (int i = 0; i < nomes.size(); i++) {
				if (nomes.get(i) != null && nomes.get(i).substring(0, 1).equals(pesquisaLetra)) {
					mensagem += nomes.get(i) + "\n";
					existe = true;
				}
			}
			if (existe) {
				JOptionPane.showMessageDialog(null, mensagem, RotuloVerificaArray.consultaNome, 1);
			} else {
				JOptionPane.showMessageDialog(null, MensagemVerificaArray.nenhum, RotuloVerificaArray.consultaNome, 2);
			}

		}
	}

	// método p listar nome
	public void pesquisarNome() {
		String nome = "";
		int contador = 0;

		nome = JOptionPane.showInputDialog(MensagemVerificaArray.informeNome);
		for (int i = 0; i < nomes.size(); i++) {
			if (nomes.contains(nome)) {
				contador++;
			} else {
				contador = 0;
			}

		}

		if (contador >= 1) {
			JOptionPane.showMessageDialog(null, MensagemVerificaArray.nomeCadastrado, RotuloVerificaArray.consultaNome,
					1);
		} else {
			JOptionPane.showMessageDialog(null, MensagemVerificaArray.nomeNaoCadastrado,
					RotuloVerificaArray.consultaNome, 0);

		}

	}

	// 8 método para sair do sistema com a opção se o usuario realmente deseja sair
	// do sistema
	public void sair() {
		int opcao = JOptionPane.showConfirmDialog(null, "Encerrar o sistema?", "Atenção", JOptionPane.YES_OPTION,
				JOptionPane.CANCEL_OPTION);

		if (opcao == JOptionPane.YES_OPTION) {
			System.exit(0);
		}

	}

	// main para executar o programa
	public static void main(String[] args) {
		new VerificaArrayList();
	}
}// fim da classe
