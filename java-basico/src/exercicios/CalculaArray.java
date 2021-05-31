package exercicios;

import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JOptionPane;

/**
 * Classe para armazenar numeros e seus m�todos para retornar, listas, m�dias,
 * calculos.
 * 
 * @author Nathalia Lanaro
 * @since 25 de Feveiro de 2021.
 *
 */
public class CalculaArray {
	// declarando array numeros
	private ArrayList<Integer> numeros;

	// m�todo construtor
	public CalculaArray() {
		// instanciando o array
		numeros = new ArrayList<Integer>();
		int numero;
		do {
			try {
				numero = Integer.parseInt(JOptionPane.showInputDialog(MensagemCalcula.informeNumeros));
				if (ValidaCalcula.isHigherZero(numero)) {
					numeros.add(numero);
				} else {

					JOptionPane.showMessageDialog(null, MensagemCalcula.numeroZero, RotuloCalcula.informeNumeros, 0);
				}

			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, MensagemCalcula.numeroInvalido, RotuloCalcula.informeNumeros, 0);

			}

		} while (numeros.size() < 10);

		menuCalcula();
	}

	public void menuCalcula() {
		String menu = "======== M E N U ========" + " \n1 - MAIOR ELEMENTO" + " \n2 - MENOR ELEMENTO"
				+ " \n3 - ORDENAR LISTA CRESCENTE" + " \n4 - ORDENAR LISTA DECRESCENTE" + " \n5 - M�DIA DOS ELEMENTOS"
				+ " \n6 - SOMA DO MAIOR E MENOR ELEMENTO" + " \n7 -SOMA DOS ELEMENTOS IGUAIS"
				+ " \n8 - M�DIA DOS ELEMENTOS IGUAIS" + "\n9 - SAIR DO SISTEMA" + "\n=======ESCOLHA UMA OP��O========";

		while (true) {
			try {
				int opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));
				processamentoPrincipal(opcao);

			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, MensagemCalcula.opcao, RotuloCalcula.informeNumeros, 0);
			}

		}
	}

	public void processamentoPrincipal(int opcao) {

		switch (opcao) {
		case 1: {
			maiorElemento();
			break;
		}

		case 2: {
			menorElemento();
			break;
		}

		case 3: {
			listaCrescente();
			break;
		}
		case 4: {
			listaDecrescente();
			break;
		}
		case 5: {
			mediaElementos();
			break;
		}
		case 6: {
			somaMaiorMenor();

			break;
		}
		case 7: {
			somaElementosIguais();

			break;
		}
		case 8: {
			mediaElementosIguais();

			break;
		}
		case 9: {
			sair();
			break;
		}

		default:
			JOptionPane.showMessageDialog(null, "", "", 0);
		}

	}// fim do m�todo

	// 1 m�todo para verfificar o maior elemento dos numeros informados
	public void maiorElemento() {
		Collections.sort(numeros);
		JOptionPane.showMessageDialog(null, numeros.get(numeros.size() - 1), RotuloCalcula.maiorElemento, 1);
	}

	// 2 m�todo para verificar o menor elemento dos numeros informados
	public void menorElemento() {
		Collections.sort(numeros);// ordena a lista de forma crescente
		Collections.reverse(numeros);
		JOptionPane.showMessageDialog(null, numeros.get(numeros.size() - 1), RotuloCalcula.menorElemento, 1);

	}

	// 3 m�todo para listar os numeros em ordem crescente
	public void listaCrescente() {
		Collections.sort(numeros);
		String mensagem = "Numeros!\n\n";
		for (Integer num : numeros) {
			mensagem += " | " + num + " | ";

		}

		JOptionPane.showMessageDialog(null, mensagem, RotuloCalcula.listaCrescente, 1);

	}// fim do m�todo

	// 4 m�todo para listar os numeros em ordem decrescente
	public void listaDecrescente() {
		Collections.sort(numeros); // ordem crescente
		String mensagem = "Numeros!\n\n";
		Collections.reverse(numeros);// ordena a lista ao contrario da pososi��o
		for (Integer num : numeros) {
			mensagem += " | " + num + " | ";

		}

		JOptionPane.showMessageDialog(null, mensagem, RotuloCalcula.listaDecrescente, 1);

	}// fim do m�todo

	// 5 m�todo para mostrar a m�dia dos elementos
	public void mediaElementos() {
		double somaElementos = 0;
		for (Integer num : numeros) {
			somaElementos += num;
		}
		JOptionPane.showMessageDialog(null, (somaElementos / 10), RotuloCalcula.mediaElementos, 1);
	}

	// 6 metodo para somar o maior e menor elemento
	public void somaMaiorMenor() {
		Collections.sort(numeros);
		JOptionPane.showMessageDialog(null, numeros.get(numeros.size() - 1) + numeros.get(0),
				RotuloCalcula.somaElementos, 1);

	}

	// 7 m�todo p fazer a soma dos numeros repetidos
	public void somaElementosIguais() {
		int contador = 0;
		String mensagem = "";
		ArrayList<Integer> lista = new ArrayList<Integer>(listaSemRepeticao());
		
		for (Integer elemento : lista) {
			contador = 0;
			for (Integer numero : numeros) {
				if (numero == elemento) {
					contador++;
				}
			}
			if (contador != 1) {
				mensagem += "O n�mero " + elemento + " se repete " + contador + " e a soma das suas repeti��es � "
						+ elemento * contador + "\n";
			}
		}

		if (mensagem != "") {
			JOptionPane.showMessageDialog(null, mensagem, "", 2);
		} else {
			JOptionPane.showMessageDialog(null, "N�o tem repeti��es", "", 2);
		}

	}

	// Retornar lista com elementos n�o repetidos

	public ArrayList<Integer> listaSemRepeticao() {
		ArrayList<Integer> lista = new ArrayList<Integer>();
		int valor = 0;
		for (Integer elemento : numeros) {
			if (valor != elemento) {
				valor = elemento;
				lista.add(elemento);
			}
		}
		return lista;
	}

	// 8 m�todo para fazer a m�dia dos elementos iguais
	public void mediaElementosIguais() {
		int contador = 0, contador2 = 0;
		int soma = 0;
		double media = 0;
		double total;
		ArrayList<Integer> lista = new ArrayList<Integer>(listaSemRepeticao());
		for (Integer elemento : lista) {
			contador = 0;
			soma = 0;
			for (Integer numero : numeros) {
				if (numero == elemento) {
					soma += numero;
					contador++;
				}
			}
			if (soma != elemento) {
				media += soma;
				contador2 += contador;
			}
		}
		if (media != 0) {
			total = media / contador2;
			JOptionPane.showMessageDialog(null, ("M�dia de todos os elemento repetidos: " + total),
					RotuloCalcula.informeNumeros, 1);
		} else {
			JOptionPane.showMessageDialog(null, "N�o tem repeti��es", "", 2);
		}
	}

	// 9 m�todo para sair do sistema com a op��o se o usuario realmente deseja sair
	// do sistema
	public void sair() {
		int opcao = JOptionPane.showConfirmDialog(null, "Encerrar o sistema?", "Aten��o", JOptionPane.YES_OPTION,
				JOptionPane.CANCEL_OPTION);

		if (opcao == JOptionPane.YES_OPTION) {
			System.exit(0);
		}

	}

	public static void main(String[] args) {
		new CalculaArray();
	}
} // fim da classe
