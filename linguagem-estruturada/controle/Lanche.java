//	Programa calcula o valor a ser pago de um produto baseado em seu código e quantidade.
//	Arquivo: Lanche.java

package controle;

import java.util.Locale;	//	programa utiliza a classe Locale.
import java.util.Scanner;	//	programa utiliza a classe Scanner.

public class Lanche	{

	public static void main	(String[] args)	{
	
		Locale.setDefault(Locale.US);	//	programa utiliza separador de casas decimais ponto.
		
		//	Variáveis.
		int codigo;	//	recebe código do produto.
		int qtdItem;	//	recebe quantidade do produto.
		double vlrItem;	//	recebe valor do item.
		double vlrTotal;	//	recebe expressão para cálculo do valor total a ser pago. 
		
		vlrItem = 0.0;	//	variável inicializada.
		
		//	Menu de exibição da tabela de produtos.
		System.out.println("\t------------------------------------------");
		System.out.println("\t||CODIGO\tESPECIFICAÇÃO\tPREÇO\t||");
		System.out.println("\t------------------------------------------");
		System.out.println("\t||  1  \tCachorro Quente\t\tR$ 4.00\t||");
		System.out.println("\t||  2  \tX-Salada\t\tR$ 4.50\t||");
		System.out.println("\t||  3  \tX-Bacon \t\tR$ 5.00\t||");
		System.out.println("\t||  4  \tTorrada simples\t\tR$ 2.00\t||");
		System.out.println("\t||  5  \tRefrigerante\t\tR$ 1.50\t||");
		System.out.println("\t------------------------------------------");		
		
		//	Cria Scanner.
		//	Prompt de captura de dados.
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o código do produto: ");	//	solicita o código do produto.
		codigo = input.nextInt();	//	lê o código.
		
		System.out.println("Digite a quantidade do produto: ");	//	solicita o quantidade do produto.
		qtdItem = input.nextInt();	//	lê a quantidade.
		
		//	Estrutura de controle condicional Switch-case, para selecionar valor do produto.
		switch	(codigo)	{
		case 1:
				vlrItem = 4.00;
				break;
		case 2:
				vlrItem = 4.50;
				break;
		case 3:
				vlrItem = 5.00;
				break;
		case 4:
				vlrItem = 2.00;
				break;
		case 5:
				vlrItem = 1.50;
				break;
												
		}	//	fim da estrutura condicional.
		
		// Processa o cálculo baseado na opção escolhida.
		vlrTotal = vlrItem * qtdItem;
		
		//	Mensagem de saída.
		System.out.printf("Total: R$ %.2f%n", vlrTotal);
		
		input.close();	//	fim da classe Scanner.
	
	}	//	fim do método main.

}	//	fim da classe Lanche.