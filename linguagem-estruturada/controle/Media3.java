//	Programa cálcula média ponderada de um aluno e informa sua situação baseado na média.
//	Arquivo: Media3.java

package controle;

import java.util.Locale;	//	programa utiliza classe Locale.
import java.util.Scanner;	//	programa utiliza classe Scanner.

public class Media3	{

	public static void main	(String[] args)	{
	
		Locale.setDefault(Locale.US);	//	utiliza separador de casas decimais ponto.
		
		//	Cria Scanner.
		//	Prompt de captura de dados.
		Scanner input = new Scanner(System.in);
		
			//	Variáveis.
			float notaUm, notaDois, notaTres, notaQuatro;	//	recebe quatro notas.
			float notaExame;	//	recebe nota do exame se aluno ficar de recuperação.
			float media;	//	recebe expressão para cálculo da media com respectivos pesos.
			
			//	Entrada de dados.
			notaUm = input.nextFloat();
			notaDois = input.nextFloat();
			notaTres = input.nextFloat();
			notaQuatro = input.nextFloat();
			
			//	Processamento.
			media = (notaUm * 2f + notaDois * 3f + notaTres * 4f + notaQuatro) / 10f;	//	cálculo da média
			
			//	Exibe a média.
			System.out.printf("Media: %.1f%n", media);	//	exibe a média com uma casa decimal.
			
			//	1º Estrutura de controle condicional para informar se aluno Aprovado, Reprovado ou Exame.
			if (media >= 7f) { 
			 	System.out.println("Aluno aprovado.");
			   
			}
			else if (media < 5f) {
				System.out.println("Aluno reprovado.");
			
			}
			else {	//	caso aluno fique em exame.
				System.out.println("Aluno em exame.");	//	exibe situação do aluno.
				notaExame = input.nextFloat();	//	lê nova nota de Exame.
				System.out.printf("Nota do exame: %.1f%n", notaExame);	//	exibe nova nota.
				media = (media + notaExame) / 2f;	//	calcula nova média.
				//	2º Estrutura de controle condicional, para informar nova nota e se aprovado ou reprovado.
				if (media >= 5f) {
					System.out.printf("Aluno aprovado.%n");
					System.out.printf("Media final: %.1f%n", media);
					
				}
				else {
					System.out.printf("Aluno reprovado.%n");
				
				}	//	fim da 2º estrutura de controle.
					
			}	//	fim da 1º estrutura de controle.
		
		input.close();	//	fim da classe Scanner.
	
	}	//	fim do método main.

}	//	fim da classe Media3