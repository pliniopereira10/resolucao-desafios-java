/*
 *	Programa lê um valor inteiro que é a quantidade de casos de teste. 
 *	Cada caso de teste consiste de dois inteiros. Posteriormente soma ímpares consecutivos.
 *
 *	Arquivo: SomaImparesConsecutivos.java	
 *
 */
 
 package controle;
 
 import java.util.Scanner;	//	utiliza classe Scanner
 
 public class SomaImparesConsecutivos	{
 
 	public static void main (String[] args)	{
 	
 		//	Variáveis.
 		int qtdTestes; // recebe a quantidade de testes que serão feitos
 		int valorX, valorY;	//	recebe os valores de teste
 		int soma;	//	soma valores ímpares 		
 		
 		//	Cria Scanner;
 		//	Prompt de captura de dados.
 		Scanner input = new Scanner(System.in);
 		
 			qtdTestes = input.nextInt();
 			
 			while (qtdTestes >= 1) {
 				
				valorX = input.nextInt();	//	lê o valor para inicio da sequência
				valorY = input.nextInt();	//	lê o valor para quantidade de números ímpares que serão somados
				
					soma = 0;
					
					//	Estrutura de condição para contar a quantidade de números ímpares
					for	(int contador = 1; contador <= valorY; contador++ ) {
					
						//	Estrutura decide se número for ímpar faz a soma 
						if (valorX % 2 != 0) {
							soma += valorX;
						
						}
						else {
							contador--; // caso não seja ímpar retorna quantidade
						
						}
					
						valorX++;	//	incrementa o valor para passagens
						
					}	 
					
					System.out.println(soma);	//	imprimi a soma
 				
				qtdTestes--;	//	decrementa para quantidade de testes
 				
 			}
 			
 			
 		input.close(); //	fim da classe Scanner
 			
 	}	//	fim do método main
 
 }	//	fim da classe SomaImparesConsecutivos     	