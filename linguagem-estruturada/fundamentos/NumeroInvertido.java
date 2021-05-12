// Programa solicita um número com 4 digitos M|C|D|U e imprime o mesmo invertido.
// Arquivo: NumeroInvertido.java

package fundamentos;

import java.util.Scanner; // programa utiliza Scanner

public class NumeroInvertido {

	public static void main(String[] args) {
		
		// Cria Scanner
		// Prompt captura de dados 
		Scanner teclado = new Scanner(System.in);

		// Variáveis
		int numero;			 // recebe um número
		int milesimo;		 // recebe o milésimo do número
		int centena;		 // recebe a centena do número
		int dezena;			 // recebe a dezena do número
		int unidade;		 // recebe a unidade do número
		int numeroInvertido; // recebe o número invertido
		
		System.out.println("Digite número com 4 casas decimais \nM|C|D|U: "); // solicita um número
		numero	= teclado.nextInt();						 // lê o número
		
		/* 
		 * As operações abaixo extraem milésimo, centena, dezena e unidade do número inserido.
		 * Lembrando que o Java, em divisões de números inteiros o resultado será a parte inteira.
		 * Operações de módulo o resultato é o resto da divisão.
		 */ 
		milesimo = numero / 1000;
		centena = numero % 1000 / 100;    
		dezena = numero % 100 / 10;
		unidade = numero % 10;
		
		// Para inverter o número soma os resultados e multiplica pela posição correpondente.
		numeroInvertido = unidade * 1000 + dezena * 100 + centena * 10 + milesimo; 
		
		// Imprime o número invertido
		System.out.printf("O número digitado, invertido é%nM|C|D|U:%n%d", numeroInvertido);

		teclado.close(); // fim da classe Scanner

	} // fim do método main

} // fim da classe NumeroInvertido
