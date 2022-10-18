/*
 * Atividade proposta Professor Isidro - Fundamentos da Linguagem e Resolução de Problemas.
 * Exercício Quadrado mistíco
 * 
 * Programa tem a finalidade de verifiar, se a soma das linhas e soma das colunas de uma matriz
 * são iguais.
 * 
 * File: QuadradoMistico.java
 * 
 * @author plinio.pereira10@gmail.com
 * @version 1.0.0
 * @since 11/10/2022
 */

package controle;

import java.util.Scanner;

public class QuadradoMistico {

	public static void main(String[] args) {

		int[][] array;
		int numberRowColumn;
		int rowSum;
		int columnSum;
		int countPosition;
		String message;

		Scanner input = new Scanner(System.in);

		numberRowColumn = input.nextInt();
		array = new int[numberRowColumn][numberRowColumn];

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = input.nextInt();
			}
		}

		message = "Sim";
		countPosition = 0;

		do {
			rowSum = 0;

			for (int i = 0; i < array[countPosition].length; i++) {
				rowSum += array[countPosition][i];
			}
			
			columnSum = 0;

			for (int i = 0; i < array.length; i++) {
				columnSum += array[i][countPosition];
			}

			if (rowSum != columnSum) {
				message = "Não";
				break;
			}

			countPosition++;

		} while (countPosition < numberRowColumn);

		System.out.println(message);

		input.close();

	}

}
