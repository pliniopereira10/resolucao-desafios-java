// Programa solicita um número e imprime o sucessor e antecessor.
// Arquivo: ImpAntESuc.java
package fundamentos;

import java.util.Scanner; // programa utiliza Scanner

public class ImpAntESuc {
	
	public static void main(String[] args) {
		
		// Cria Scanner
		// Prompt captura de dados 
		Scanner teclado = new Scanner(System.in);

		// Variáveis
		int numero;     // recebe um número    
		int antecessor; // recebe o número antecessor
		int sucessor;   // recebe o número sucessor
		
		System.out.print("Digite um número:"); // solicita um núemro
		numero = teclado.nextInt();            // lê o número
		
		antecessor = numero - 1;              // cálculo do antecessor
		sucessor = numero + 1;                // cálculo do sucessor
		
		System.out.printf("O número antecessor de %d: %d%n", numero, 
				antecessor);                  // exibe o antecessor
		System.out.printf("O número sucessor de %d: %d%n", numero, 
				sucessor);                    // exibe o sucessor

		teclado.close(); // fim classe Scanner

	} // fim do método main

} // fim da classe ImpAntESuc
