// Programa recebe um número depois verifica se é par ou ímpar e está entre 0 - 10. 
// Arquivo: VerificaParImpar.java

package controle;

import java.util.Scanner; // programa utiliza Scanner

public class VerificaParImpar {

	public static void main(String[] args) {
		
		// Cria Scanner
		// Prompt captura de dados 
		Scanner teclado = new Scanner(System.in);
		
		// Variáveis
		int numero;		// recebe o número    
		
		boolean par,    // recebe condição para ser par
				impar;  // recebe condição para ser ímpar
		
		System.out.println("++++++++++++++++++++++++++++++++++");		
		System.out.print("Informe um número: ");  // solicita um número
		numero = teclado.nextInt();               // lê o número
		
		// Condições para ser par e ímpar
		par = numero > 0 && numero < 10 && numero % 2 == 0;
		impar = numero > 0 && numero < 10 && numero % 2 == 1;
		
		// Estrutura de controle condicional
		if(par) {
			System.out.println("Número par que está entre 0 e 10");
		} else if(impar) {
			System.out.println("Número ímpar que está entre 0 e 10");
		} else {
			System.out.println("O número não está entre 0 e 10");
			
		} // fim estrutura controle condicional
		
		System.out.println("++++++++++++++++++++++++++++++++++");
		
		teclado.close(); // fim da classe Scanner

	} // fim do método main

} // fim da classe VerificaParImpar