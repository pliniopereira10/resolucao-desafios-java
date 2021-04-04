// Programa conversão temperatura de Fahrenheit para Celsius
// Arquivo: ConversaoTemperatura.java

package fundamentos;

import java.util.Scanner;

public class ConversaoTemperatura {

	public static void main(String[] args) {
		
		/*
		 * No terminal solicita a entrada de temperatura em graus fahrenheit e
		 * converte para graus celsius. A fómula utilizada no cálculo é:
		 * (°F - 32) * 5/9 = °C
		 */
		
		// Variáveis
		float tempFahrenheit,
			  tempCelsius;
		// Com a palavra reservada final defini as variáveis como constante.
		final float FATOR = 5 / 9.0F,
		        	AJUSTE = 32;
		
		// Menu exposição
		System.out.print("************");
		System.out.print(" Calculadora de Conversão ");
		System.out.print("***********\n");
		System.out.print("\t****  Fahrenheit ---> Celsius ****\n\n");
		
		// Scanner para entrada de dados
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Olá!");
		System.out.print("Por favor digite a temperatura °F: ");
		tempFahrenheit = teclado.nextFloat();
		
		tempCelsius = (tempFahrenheit - AJUSTE) * FATOR;
		System.out.printf("A temperatura atual em graus Celsius é %.2f °C", tempCelsius);
		
		System.out.println("\n");
		
		System.out.print("************");
		System.out.print(" ************************ ");
		System.out.print("***********\n");
		System.out.print("\t****  *********** **********  ****\n\n");
		
		teclado.close(); // final capitura da classe scanner

	} // final método main

} // final da classe
