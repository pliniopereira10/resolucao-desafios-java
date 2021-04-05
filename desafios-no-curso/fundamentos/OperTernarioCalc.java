// Programa cálcula operações básicas
// Arquivo: OperTernarioCalc

package fundamentos;

import java.util.Scanner;

public class OperTernarioCalc {

	public static void main(String[] args) {
		
		/*
		 * Objetivo desse exercício é criar uma programa que faz cáculos básicos
		 * utilizando operadores ternários. Se abstendo de utilizar estruturas de
		 * controle. 
		 */
		
		// Variáveis wrappers para incluir métodos
		String operacao,
			   resultado;
		
		Double num1,
			   num2,
			   soma,
			   subtracao,
			   multiplicacao,
			   divisao,
			   modulo;
		
		// Texto exibição
		System.out.println("\t****C A L C U L A D O R A****");
		
		// Captura com Scanner
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("\n  Digite um número: ");
		num1 = teclado.nextDouble();			  // captura primeiro número
		
		System.out.print("  Outro número: ");
		num2 = teclado.nextDouble();			 // captura segundo número
		
		// Menu de opção
		System.out.println("\n Qual operação efetuar?");
		System.out.println(" Digite:");
		System.out.println("  1 - Soma(+)");
		System.out.println("  2 - Subtração(-)");
		System.out.println("  3 - Multiplicação(*)");
		System.out.println("  4 - Divisão(/)");
		System.out.println("  5 - Modulo(%)");
		System.out.print("  ");
		operacao = teclado.next();				// captura opção para cáĺculo
		
		/*
		 * Optei por criar variáveis Double para fazer a operação do cálculo e 
		 * posteriormente aplicar o método.
		 */
		soma = num1 + num2;
		subtracao = num1 - num2;
		multiplicacao = num1 * num2;
		divisao = num1 / num2;
		modulo = num1 % num2;
		
		/* Criei a variável do tipo String resultado para ter como incluir
		 * String "Opção Inválida"
		 */
		resultado = "1".equals(operacao) ? soma.toString() : "Opção Inválida";
		resultado = "2".equals(operacao) ? subtracao.toString() : resultado;
		resultado = "3".equals(operacao) ? multiplicacao.toString() : resultado;
		resultado = "4".equals(operacao) ? divisao.toString() : resultado;
		resultado = "5".equals(operacao) ? modulo.toString() : resultado;
		
		System.out.printf("Resposta: %s", resultado);
		
		teclado.close(); // fim classe scanner
		
	} // fim método main

} // fim classe OperTernarioCalc
