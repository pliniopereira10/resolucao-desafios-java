/*
 * Atividade proposta Professor Isidro - Fundamentos da Linguagem e Resolução de Problemas.
 * Exercício Bee1180
 * 
 * Programa tem a finalidade de verifiar o menor valor e sua posição no vetor.
 * 
 * File: MenorEPosicao.java
 * 
 * @author plinio.pereira10@gmail.com
 * @version 1.0.0
 * @since 7/10/2022
 */

package controle;

import java.util.Scanner;

public class MenorEPosicao {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		var sizeVector = input.nextInt();
		var vector = new int[sizeVector];

		for (int i = 0; i < vector.length; i++) {
			var value = input.nextInt();
			vector[i] = value;
		}

		var positionInVect = 0;
		var minValue = vector[0];
		for (int i = 0; i < vector.length; i++) {
			if (vector[i] < minValue) {
				minValue = vector[i];
				positionInVect = i;
			}
		}
		System.out.printf("%s %d%n", "Menor valor:", minValue);
		System.out.printf("%s %d%n", "Posicao:", positionInVect);

		input.close();

	}

}
