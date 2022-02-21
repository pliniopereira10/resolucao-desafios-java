//	Programa calcula e informa percentual de aumento salarial.
//	Arquivo:	AumentoSalarial.java

package controle;

import java.util.Locale;	//	programa utiliza a classe Locale
import java.util.Scanner;	//	programa utiliza a classe Scanner

public class AumentoSalarial	{

	public static void main (String[] args)	{
	
		//	Variáveis.
		double salario;	//	recebe salario atual do funcionário.
		double novoSalario; // recebe expressão para cálculo do novo salário.
		double valorDeGanho;	//	recebe o valor de ganho.
		int percentual;	//	recebe percentual de reajuste.

		//	Menu de exibição da tabela e ajustes salarial.
		System.out.println("\t******************************************************");
		System.out.println("\t\tSalário\t\tPercentual de Reajuste");
		System.out.println("\t******************************************************");
		System.out.println("\t\t0 - 400.00\t\t15%");
		System.out.println("\t     400.01 - 800.00\t\t12%");
		System.out.println("\t    800.01 - 1200.00\t\t10%");
		System.out.println("\t   1200.01 - 2000.00\t\t 7%");
		System.out.println("\t   Acima de  2000.00\t\t 4%");
		System.out.println("\t******************************************************");			
		
		Locale.setDefault(Locale.US);	// utiliza separador de casas decimais ponto.
		
		//	Cria Scanner.
		//	Prompt de captura de dados.
		Scanner input = new Scanner(System.in);
			
			System.out.println("Digite salário atual: ");	// solicita o valor do salário.
			salario = input.nextDouble();	//	lê valor do salario
			
			//	Estrutura condicional para aplicar novos reajustes de acordo com faixa salarial
			if (salario <= 400.00) {
				novoSalario = salario + salario * 0.15; //	reajuste de 15%
				percentual = 15;	
			}
			else if (salario > 400.00 & salario <= 800.00) {
				novoSalario = salario + salario * 0.12; //	reajuste de 12%
				percentual = 12;
				
			}
			else if (salario > 800.00 & salario <= 1200.00) {
				novoSalario = salario + salario * 0.10; //	reajuste de 10%
				percentual = 10;
				
			}
			else if (salario > 1200.00 & salario <= 2000.00) {
				novoSalario = salario + salario * 0.07; //	reajuste de 7%
				percentual = 7;
				
			}
			else {
				novoSalario = salario + salario * 0.04;	//	valores acima de 2000.00 reajuste de 4%
				percentual = 4;
			}
			
			valorDeGanho = novoSalario - salario;	// expressão para calculo do valor de ganho
			
			System.out.printf("Novo salario: %.2f%n", novoSalario);
			System.out.printf("Reajuste ganho: %.2f%n", valorDeGanho);
			System.out.println("Em percentual: " + percentual + " %");
		
		input.close();	//	fim da classe Scanner.
	
	}	//	fim do método main.

}	// fim da classe AumentoSalarial	