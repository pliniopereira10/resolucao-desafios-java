// Programa para cálculo da área do triângulo
// Arquivo: AreaDoTriangulo.java

package fundamentos;

import java.util.Scanner;

public class AreaDoTriangulo {

	public static void main(String[] args) {
		
		// Fórmula para cálculo da área do triângulo é base * altura / 2
		
		// Variáveis
		double area,
			   base,
			   altura;
		
		// Texto de Exibição
				System.out.println(" *******************************");
				System.out.println("  Cálculo da Área do Triângulo");
				System.out.println(" *******************************");
				
		// Captura de dados
		Scanner teclado = new Scanner(System.in);
		
		System.out.print(" Informe a base Metro(m): ");
		base = teclado.nextDouble();
		
		System.out.print(" Informe a altura Metro(m): ");
		altura = teclado.nextDouble();
		
		// Fórmula
		area = base * altura / 2;
		
		System.out.println(" A área do triângulo Metro(m²): " + area);
		
		teclado.close(); // fim classe scanner
		
	} // fim método main

} // fim classe AreaDoTriangulo
