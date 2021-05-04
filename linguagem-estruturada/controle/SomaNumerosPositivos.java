// Enquanto o programa recebe números positivos, imprime no console e os soma, caso
// receba um número negativo ele para o cálculo.
// Arquivo: QuestaoSomaPositivos.java

package controle;

import java.util.Scanner; // programa utiliza Scanner

public class SomaNumerosPositivos {

	public static void main(String[] args) {
		
		// Cria Scanner
		// Prompt captura de dados 
		Scanner teclado = new Scanner(System.in);

		// Variáveis
		int numero;         // recebe um número
		int numeroPositivo; // recebe um numero positivo
		int soma;           // recebe operação de soma
		
		soma = 0; // inicialização da variável
					
		do {
			
			System.out.print("Digite um número: "); // solicita um número
			numero = teclado.nextInt();        // lê o número
			// Estrutura de controle condicional para números positivos						
			if(numero > 0) {
				
				numeroPositivo = numero;
				soma = numeroPositivo + soma;  // expressão para operação de soma
				
				System.out.printf("A soma dos numeros digitados é %d%n",
						soma);            // imprime o resultado
				
			} // fim da condição
			
		} while (numero > 0); // fim estrutura de repetição
		
		System.out.println("Fim !!");
		
		teclado.close(); // fim classe Scanner

	} // fim método main

} // fim classe SomaNumerosPositivos