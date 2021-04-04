// Programa cálcula operação aritmética
// Arquivo: OperadoresAritmeticos.java

package fundamentos;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		
		/*
		 * O objetivo desse desafio é elaborar uma operação respeitando a regra
		 * de precedência. A equação é:
		 * ( [6 * (3 + 2)]² / 3 * 2 - ( (1 - 5) * (2 - 7) / 2)²)³ / 10³
		 */
		
		// Criei variáveis para cálculo utilizando o recurso de inferência
		var multiplicador1 = 6;
		var somador = 3 + 2;
		
		/* Utilizei a classe Math com o método pow para cálcular resultado
		 * elevando a um número específico, por padrão a classe Math gera 
		 * um double, então utilizei casting para transformar em inteiro.
		 */
		var calculo1 = (int) Math.pow(multiplicador1 * somador, 2);
		var divisor1 = 3 * 2;
		var resultadoPrimExpressao = calculo1 / divisor1;
				
		var multiplicador2 = 1 - 5;
		var multiplicador3 = 2 - 7;
		var divisor2 = 2;
		var calculo2 = (multiplicador2 * multiplicador3) / divisor2;
		var resultadoSegExpressao = (int) Math.pow(calculo2, 2);
		
		var divisor3 = (int) Math.pow(10, 3);
		var resultadoFinal = (int) Math.pow(resultadoPrimExpressao - resultadoSegExpressao, 3) / divisor3;
		
		System.out.printf("O resultado da expressão é %d", resultadoFinal);
		
	} // fim método main

} // fim classe OperadoresAritmeticos
