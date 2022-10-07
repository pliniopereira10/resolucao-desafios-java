/*
 * Atividade proposta Professor Isidro - Fundamentos da Linguagem e Resolução de Problemas.
 * Exercício URI2297
 * 
 * Programa tem a finalidade de verifiar o vencedor do jogo de bater figurinhas.
 * Temos a entrada da quantiade de partidas que serão jogadas, posteriormente o número de figuras
 * virada por cada um.
 * Por fim o sistema exibe a mensagem com o nome do vencedor.
 * 
 * File: Bafo.java
 * 
 * @author plinio.pereira10@gmail.com
 * @version 1.0.0
 * @since 7/10/2022
 */

package controle;

import java.util.Scanner;

public class Bafo {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int figurasViradasAldo;
		int figurasViradasBeto;
		int totalFigurasAldo;
		int totalFigurasBeto;
		int quantidadesPartida;
		int quantidadeTeste;

		String nomeVencedor;

		quantidadeTeste = 0;

		do {
			quantidadesPartida = teclado.nextInt();

			if (quantidadesPartida == 0) {
				break;
			}

			totalFigurasAldo = 0;
			totalFigurasBeto = 0;

			for (int i = 0; i < quantidadesPartida; i++) {

				figurasViradasAldo = teclado.nextInt();
				figurasViradasBeto = teclado.nextInt();

				totalFigurasAldo += figurasViradasAldo;
				totalFigurasBeto += figurasViradasBeto;

			}

			if (totalFigurasAldo > totalFigurasBeto) {
				nomeVencedor = "Aldo";
			} else {
				nomeVencedor = "Beto";
			}

			quantidadeTeste++;

			System.out.println("Teste " + quantidadeTeste);
			System.out.println(nomeVencedor);
			System.out.println();

		} while (quantidadesPartida != 0);

		teclado.close();
	}

}
