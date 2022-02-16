//	Programa efetua cálculo das raízes da equação de Bhaskara e informa se é "impossível calcular".
//	Arquivo: FormulaBhaskara.java

package controle;

import java.util.Locale;	//	programa utiliza a classe Locale.
import java.util.Scanner;	//	programa utiliza a classe Scanner.

public class FormulaBhaskara	{

	public static void main (String[] args)	{
	
		Locale.setDefault(Locale.US);	//	programa utiliza o separador de casas decimais ponto.
		
		//	Cria Scanner.
		//	Prompt de captura de dados.
		Scanner input = new Scanner(System.in);
		
			//	Variáveis.
			double valorA, valorB, valorC;	//	recebe valores de entrada de dados.
			double	delta;	//	recebe expressão para cálculo do delta.
			double bhaskara;	//	recebe expressão para cálculo das raízes.
			
			//	Prompt de captura.
			valorA = input.nextDouble();	//	lê valor de A. 
			valorB = input.nextDouble();
			valorC = input.nextDouble();
			
			//	Processamento
			/*	
			 *  Delta é Δ = b² - 4 * a * c
			 *	Para cálculo da fórmula de Bhaskara é: (- b  ±  √ Δ) / 2 * a
			 *	Se ∆ > 0, possui 2 raízes.
			 *	Se ∆ = 0, possui 1 raiz.
			 *	Se ∆ < 0, não possui raiz.
			 *	Primeiro calcula valor de Delta(∆) para posterior analise de expressões.
			 */
			delta = Math.pow(valorB, 2) - 4.0 * valorA * valorC;
			
			/*
			 *	Estrutura de controle condicional.
			 *	Caso valor de A seja igual a zero ou delta negativo. Programa informa que é
			 *	"impossível calcular".
			 */ 
			if (valorA == 0.0 || delta < 0.0)	{
				System.out.println("Impossivel calcular");
				
			}
			else	{
				bhaskara = (- valorB + Math.sqrt(delta)) / (2.0 * valorA);
				System.out.printf("R1 = %.5f%n", bhaskara);
				
				bhaskara = (- valorB - Math.sqrt(delta)) / (2.0 * valorA);
				System.out.printf("R2 = %.5f%n", bhaskara);
				 
			}	//	fim da estrutura de condição.		
		
		input.close();	//	fim da classe Scanner.
	
	}	// fim do método main.

}	//	fim da classe FormulaBhaskara.