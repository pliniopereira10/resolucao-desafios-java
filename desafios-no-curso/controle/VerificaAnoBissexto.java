// Programa informa se o ano é bissexto
// VerificaAnoBissexto.java

package controle;

import java.util.Scanner;  // programa utiliza Scanner

public class VerificaAnoBissexto {

	public static void main(String[] args) {
		
		// Cria Scanner
		// Prompt captura de dados 
		Scanner teclado = new Scanner(System.in);

		// Variáveis
		int ano;                 // recebe o ano
		
		boolean anoBissexto;    //  recebe condição para ser bissexto
		
		// Solicita o ano
		System.out.print("Informe o ano: ");
		ano = teclado.nextInt(); // lê o ano
		
		// Condição para ser ano Bissexto
		anoBissexto = ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0;
		
		// Estrutura de controle condicional
		if(anoBissexto) {
			System.out.printf("O ano %d é bissexto. Consequentemente, o mês de "
					+ "fevereiro possui 29 dias.", ano);
		} else {
			System.out.printf("O ano %d não é bissexto. Com isso, o mês de fevereiro"
					+ " possui 28 dias.", ano);
			
		} // fim estrutura condicional

		teclado.close(); // fim da classe Scanner

	} // fim do método main

} // fim da classe VerificaAnoBissexto