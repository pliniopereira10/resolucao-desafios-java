// Progrma solicita um número e informa se ele é primo.
// Arquivo: NumeroPrimo.java

package controle;

import java.util.Scanner; // programa utiliza Scanner

public class NumeroPrimo {

	public static void main(String[] args) {
		
		// Cria Scanner
		// Prompt captura de dados 
		Scanner teclado = new Scanner(System.in);

		// Variáveis
		int numeroPrimo;         // recebe um número
		int numeroDivisores;     // recebe quantidade de divisores
		
		numeroDivisores = 0;    // inicialização de variável
		
		System.out.print("Digite um número: ");  // solicita um número
		numeroPrimo = teclado.nextInt();         // lê o número 
		
		// Estrutura para contar quantidade de divisores do número inserido
		for(int contador = 1; contador <= numeroPrimo; contador++) {
			// A cada divisão do número com resto zero descobre quantos divisores  
			if(numeroPrimo % contador == 0) {
				numeroDivisores++;
				
			} // fim condição para numeroDivisores
			
		} // fim estrutura da estrutura de controle
		
		// Condição para ser primo
		if(numeroDivisores == 2) {
			System.out.printf("O número %d é primo", numeroPrimo);
		} else {
			System.out.printf("O número %d não é primo", numeroPrimo);
			
		} // fim da condição
		
		teclado.close(); // fim da classe Scanner

	} // fim do método main

} // fim da classe NumeroPrimo