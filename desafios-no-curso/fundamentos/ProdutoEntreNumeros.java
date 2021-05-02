// Programa solicita dois números inteiros e calcula o produto.
// Arquivo: ProdutoEntreNumeros.java

package fundamentos;

import java.util.Scanner; // programa utiliza Scanner

public class ProdutoEntreNumeros {

	public static void main(String[] args) {
		
		// Cria Scanner
		// Prompt captura de dados 
		Scanner teclado = new Scanner(System.in);

		// Variáveis
		int numeroUm;   // recebe primeiro número.
		int numeroDois; // recebe segundo número.
		int produto;    // recebe a expressão produto
		
		System.out.print("Digite um número inteiro:"); // solicita um número.
		numeroUm = teclado.nextInt();                  // lê primeiro número.
		
		System.out.print("Digite outro número:");      // solicita um número.
		numeroDois = teclado.nextInt();                // lê o segundo número 
		
		produto = numeroUm * numeroDois;               // cálculo da expressão produto (*)  
		
		System.out.printf("%d X %d = %d", numeroUm, numeroDois, 
				produto);                             // exibe o produto entre os números
		
		teclado.close(); // fim classe Scanner

	} // fim método main

} // fim classe ProdutoEntreNumeros
