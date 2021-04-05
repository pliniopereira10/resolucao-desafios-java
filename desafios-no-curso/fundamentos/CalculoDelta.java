// Programa para cálculo da equação do 2º grau
// Arquivo: CalculoDelta.java

package fundamentos;

import java.util.Scanner;

public class CalculoDelta {

	public static void main(String[] args) {
		
		/* Criar um programa que resolve equações do segundo grau (ax2 + bx + c = 0)
		 * utilizando a fórmula de Bhaskara.Encontre o delta
		 */
		
		// Variáveis
		int delta,
			   valorA,
			   valorB,
			   valorC;
		
		String raizes;
		
		// Texto de Exibição
				System.out.println(" *******************************");
				System.out.println("    Cálculo Delta da Equação");
				System.out.println(" *******************************");
				
		// Captura de dados
		Scanner teclado = new Scanner(System.in);
		
		System.out.print(" Informe valor de A: ");
		valorA = teclado.nextInt();
		
		System.out.print(" Informe a altura valor de B: ");
		valorB = teclado.nextInt();
		
		System.out.print(" Informe a altura valor de C: ");
		valorC = teclado.nextInt();
		
		// Fórmula
		delta = (int)Math.pow(valorB, 2) - (4 * valorA * valorC);
		
		raizes = delta < 0 ? "não possui raiz real." : "Opção Inválida.";
		raizes = delta == 0 ? "possui uma única raiz real." : raizes;
		raizes = delta > 0 ? "possui duas raízes reais." : raizes;
		
		System.out.printf(" Na equação %dx² + %dx + %d.", valorA, valorB, valorC);
		System.out.printf(" O valor de delta é %d.%n", delta);
		System.out.println(" Equação " + raizes);
		
		teclado.close(); // fim classe scanner
		
	} // fim método main

} // fim classe CalculoDelta
