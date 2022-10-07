/*
 * Atividade proposta Professor Isidro - Fundamentos da Linguagem e Resolução de Problemas.
 * Exercício URI3068
 * 
 * Programa tem a finalidade de calcular quantidade de meteoritos que caíram em uma determinada área.
 * Temos primeiro a entrada de quatro pontos, x e y superior e x e y inferior, que representam uma
 * área retangular. Depois quantidade de metoros que caíram e suas coordenadas.
 * Por fim o sistema exibe a mensagem da quantidade de testes executados e metoritos que cairam na
 * área.
 * 
 * File: Meteoro.java
 * 
 * @author plinio.pereira10@gmail.com
 * @version 1.0.0
 * @since 6/10/2022
 */

package controle;

import java.util.Scanner;

public class Meteoro {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int pontoSuperiorX;
		int pontoSuperiorY;
		int pontoInferiorX;
		int pontoInferiorY;

		int quantidadeTestes;
		int quantidadeMeteoritosDentro;
		int contadorDeTeste;

		int coordenadaMetoritoX;
		int coordenadaMetoritoY;
		
		contadorDeTeste = 0;
		do {
		
			pontoSuperiorX = teclado.nextInt();
			pontoSuperiorY = teclado.nextInt();
			pontoInferiorX = teclado.nextInt();
			pontoInferiorY = teclado.nextInt();
			
			if (pontoSuperiorX != 0 || pontoSuperiorY != 0 || pontoInferiorX != 0 || pontoSuperiorY != 0) {
				quantidadeTestes = teclado.nextInt();
				contadorDeTeste++;
				
				quantidadeMeteoritosDentro = 0;
				for (int i = 0; i < quantidadeTestes; i++) {
					coordenadaMetoritoX = teclado.nextInt();
					coordenadaMetoritoY = teclado.nextInt();
					
					if (coordenadaMetoritoX >= pontoSuperiorX && coordenadaMetoritoX <= pontoInferiorX
							&& coordenadaMetoritoY <= pontoSuperiorY && coordenadaMetoritoY >= pontoInferiorY) {
						quantidadeMeteoritosDentro++;
					}
					
				}
				System.out.println("Teste " + contadorDeTeste);
				System.out.println(quantidadeMeteoritosDentro);
			}	
		
		} while (pontoSuperiorX != 0 || pontoSuperiorY != 0 || pontoInferiorX != 0 || pontoSuperiorY != 0);	
		
		teclado.close();
	}

}
