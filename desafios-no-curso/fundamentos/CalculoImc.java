// Programa para exibir calculo do IMC
// Arquivo: CalculoImc.java

package fundamentos;

import java.util.Scanner;

public class CalculoImc {

	public static void main(String[] args) {
		
		// Fórmula para calculo é Imc = peso / altura * altura
		
		// Variáveis
		double imc,
			   peso,
			   altura;
		
		// Texto de Exibição
		System.out.println(" *******************************");
		System.out.println("\tCálculadora de IMC");
		System.out.println(" *******************************");
		
		// Terminal de captura
		Scanner teclado = new Scanner(System.in);
		
		// Captura peso
		System.out.println(" Informe seu peso(kg)");
		System.out.print("  ");
		peso = teclado.nextDouble();
		
		// Captura altura
		System.out.println(" Informe sua altura(metro e cm)");
		System.out.print("  ");;
		altura = teclado.nextDouble();
		
		// Fórmula de cálculo
		imc = peso / Math.pow(altura, 2);
		
		//Exibe IMC calculado
		System.out.printf(" Seu IMC é %.1f%n", imc);
		System.out.println(" *******************************");
		
		teclado.close(); // fim classe Scanner

	} // fim do método main

} // fim da classe CalculoImc
