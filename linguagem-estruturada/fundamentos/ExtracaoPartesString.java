// Programa solicita um nome e imprime partes do nome
// Arquivo: ExtracaoPartesString

package fundamentos;

import java.util.Scanner; // programa utiliza Scanner

public class ExtracaoPartesString {

	public static void main(String[] args) {
		
		// Cria Scanner
		// Prompt captura de dados 
		Scanner teclado = new Scanner(System.in);

		// Variáveis
		String nome;
		
		// Solicita um nome
		System.out.println("Informe um nome: ");
		nome = teclado.nextLine();				// lê o nome
		
		// Método charAt() imprime o caractere de acordo com posição no array, 
		// sendo 0 a primeira posição.
		System.out.printf("Primeiro caractere é \"%s\"%n", nome.charAt(0));
		
		// Método length() conta quantidade de caracteres da string.
		// Método substring() extrai caracteres de acordo com a posição no array.
		System.out.printf("Último caractere é \"%s\"%n", nome.substring(nome.length()-1));
		
		// Método substring(inicia no zero, termina uma posição antes da mencionada)
		System.out.printf("Primeiro ao terceiro caractere é \"%s\"%n", nome.substring(0, 3));
		
		System.out.printf("Quarto caractere é \"%s\"%n", nome.charAt(3));
		System.out.printf("Todos caracteres menos o primeiro é \"%s\"%n", nome.substring(1, nome.length()));
		System.out.printf("Dois últimos caracteres é \"%s\"%n", nome.substring(nome.length()-2, nome.length()));

		teclado.close(); // fim da classe Scanner

	} // fim do método main

} // fim da classe ExtracaoPartesString
