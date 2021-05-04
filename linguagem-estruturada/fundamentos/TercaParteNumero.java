// Programa solicita um número e imprime a terça parte dele
// Arquivo: TercaParteNumero.java

package fundamentos;

import java.util.Scanner; // programa utiliza Scanner

public class TercaParteNumero {

	public static void main(String[] args) {
		
		// Cria Scanner
		// Prompt captura de dados 
		Scanner teclado = new Scanner(System.in);

		// Variáveis
		double numero;       // recebe um número
		double tercaParte;   // recebe a terça parte do numero
		
		System.out.print("Digite um número:"); // solicita um número
		numero = teclado.nextDouble();         // lê o número
		
		tercaParte =  numero * 1 / 3;         // expressão para cálculo da terça parte
		
		System.out.printf("A terça parte de %.2f é %.2f.", numero, tercaParte); // exibe o valor

		teclado.close(); // fim classe Scanner

	} // fim do método main

} // fim da classe TercaParteNumero
