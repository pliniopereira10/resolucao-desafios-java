//	Programa identifica números como nulo, par, impar, positivo ou negativo.
//	Arquivo:	ParImpar.java

package controle;

import java.util.Scanner;	//	programa utiliza classe Scanner

public class ParImpar	{

	public static void main (String[] args)	{
	
		//	Variáveis.
		int qtdInsercoes;	//	recebe a quantidade de inserções numéricas
		int numeros;	//	recebe os valores numéricos
		
		//	Cria Scanner.
		//	Prompt de captura de dados.
		Scanner input = new Scanner(System.in);
		
			qtdInsercoes = input.nextInt();		
			
			//	Estrutura para repetir solicitação da inserção de números	
			for (int contador = 1; contador <= qtdInsercoes; contador++ ){
					numeros = input.nextInt();	//	lê os números
					
					// 1º Estutura par decidir se número é Nulo, Par ou impar
					if (numeros == 0) {
						System.out.println("NULL");
					
					}
					else if (numeros % 2 == 0) {
						System.out.print("EVEN ");
						
					}
					else if (numeros % 2 != 0) {
						System.out.print("ODD ");
					
					}	//	fim da 1º estrutura de decisão
					
					
					//	2º Estrutura para decidir se número é positivo ou negativo
					if (numeros > 0) {
						System.out.println("POSITIVE");
					
					}
					else if (numeros < 0) {
						System.out.println("NEGATIVE");
					
					}	//	fim da 2º estutura de decisão	
					
			}
		
		input.close();	//	fim da classe Scanner
		
	}	//	fim do método main

}	//	fim da classe ParImpar