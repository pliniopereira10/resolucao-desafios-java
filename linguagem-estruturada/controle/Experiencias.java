//	Programa lê um valor inteiro N que indica os vários casos de teste que vem a seguir.
//	Cada caso de teste contém um inteiro que representa a quantidade de cobaias utilizadas 
//	e um caractere Tipo ('C', 'R' ou 'S'), indicando o tipo de cobaia (R:Rato S:Sapo C:Coelho).
//	No final apresenta o total de cobaias utilizadas, o total de cada tipo de cobaia utilizada 
//	e o percentual de cada uma em relação ao total de cobaias utilizadas. 
//	Arquivo:	Experiencias.java

package controle;

import java.util.Locale;	//	programa utiliza classe Locale
import java.util.Scanner;	//	programa utiliza classe Scanner

public class Experiencias	{

	public static void main (String[] args)	{
	
		Locale.setDefault(Locale.US);	//	utiliza o separador de casas decimais ponto.
	
		//	Variáveis.
		int qtdTestes;	//	recebe a quantidade de testes que será inserido
		int qtdCobaias;	//	recebe a quantidade de cobaias
		char tipoCobaias;	//	recebe o tipo de cobaia utilizada(C=coelho/R=rato/S=sapo)
		int somaCobaias;	//	recebe expressão para soma da quantidade total de cobaias utilizadas
		int coelhos, ratos, sapos;	// recebe quantidade de cada tipo de cobaia	
		double percCoelhos, percRatos, percSapos;	//	recebe expressão de cálculo do percentual de cobaias
		
		coelhos = 0;	//	inicialização de variável
		ratos = 0;
		sapos = 0;
		
		//	Cria Scanner.
		//	Prompt de captura de dados.
		Scanner input = new Scanner(System.in);
		
			System.out.print("Quantos experimentos: ");
			qtdTestes = input.nextInt();	//	lê o valor
			System.out.println("Insira a quantidade de cobaias e tipo.(R:Rato S:Sapo C:Coelho)");
			
			//	Processamento de dados.
			//	Estrutura de controle para poder inserir os experimentos utilizados.
			for (int contador = 1; contador <= qtdTestes; contador++) {
					
					qtdCobaias = input.nextInt();	//	lê quantidade da cobaia
					tipoCobaias = input.next().charAt(0);	//	lê o tipo da cobaia
					
					//	Estrutura para contabilizar a quantidade do tipo da cobaia
					if (tipoCobaias == 'C') {
						coelhos += qtdCobaias;
					
					}
					else if (tipoCobaias == 'R') {
						ratos += qtdCobaias;
					
					}
					else {
						sapos += qtdCobaias;
					
					}	//	fim da estrutura de decisão
					
					
			}	//	fim da estrutura de repetitiva
			
			somaCobaias = coelhos + ratos + sapos;	//	soma total de cobaias
			percCoelhos = coelhos * 100.0 / somaCobaias;	//	calcula o percentual de cada cobaia 
			percRatos = ratos * 100.0 / somaCobaias; 
			percSapos = sapos * 100.0 / somaCobaias;
			
			//	Saída de dados
			System.out.println("Total: " + somaCobaias + " cobaias");
			System.out.println("Total de coelhos: " + coelhos);
			System.out.println("Total de ratos: " + ratos);
			System.out.println("Total de sapos: " + sapos);
			System.out.printf("Percentual de coelhos: %.2f %%%n", percCoelhos);
			System.out.printf("Percentual de ratos: %.2f %%%n", percRatos);
			System.out.printf("Percentual de sapos: %.2f %%%n", percSapos);			  
		
		input.close();	//	fim da classe Scanner
	
	}	//	fim do método main

}	//	fim da classe Experiencias