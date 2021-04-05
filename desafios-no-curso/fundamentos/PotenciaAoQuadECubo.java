// Programa eleva um número ao quadrado e ao cubo
// Arquivo: PotenciaAoQuadECubo.java

package fundamentos;

import java.util.Scanner;

public class PotenciaAoQuadECubo {

	public static void main(String[] args) {
		
		// Solicita ao usuário um número e eleva esse, na potência quadrática e cúbica.
		// Trabalha com a biblioteca Math.
		
		// Variável
		int numero,
			quadrado,
			cubo;
		
		// Captura número
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		numero = teclado.nextInt();
		
		// Cálculo
		quadrado = (int)Math.pow(numero, 2);
		cubo = (int)Math.pow(numero, 3);
		
		// Saída formatada
		System.out.printf("O número %d%nao quadrado é %d%nao cubo é %d", numero,
				quadrado, cubo);
		
		
		teclado.close(); // fim classe Scanner

	} // fim método main

} // fim classe PotenciaAoQuadECubo
