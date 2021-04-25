// Programa recebe 10 valores e ao final imprime o maior
// Arquivo: MaiorValor.java

package controle;

import java.util.Scanner; // programa utiliza Scanner

public class MaiorValor {

	public static void main(String[] args) {
		
		// Cria Scanner
		// Prompt captura de dados 
		Scanner teclado = new Scanner(System.in);

		// Variáveis
		int numero;   // recebe um número
		int numeroMaior; // recebe o maior número
		
		numeroMaior = 0; // incialização da variável
		
		// Estrutura para repetir solicitação da inserção de 10 números
		for(int contador = 1; contador <= 10; contador++) {
			
			System.out.printf("Digite o %dº número: ", contador); // Solicita o número
			numero = teclado.nextInt();  // lê o número
			
			// Condição para armazenar o maior número
			if(numero > numeroMaior) {
				numeroMaior = numero;
				
			} // fim da condição 
			
		} // fim da repetição
		
		System.out.println("O maior número digitado é " + numeroMaior);

		teclado.close(); // fim classe Scanner

	} // fim do método main

} // fim da classe MaiorValor