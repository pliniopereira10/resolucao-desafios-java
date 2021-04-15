// Programa tem finalidade de executar operações básicas da matemátia. E aplicar
// alguns conhecimentos adquiridos de estrutura de multiplica escolha e condição.
// As operações são: soma, subtração, multiplicação e divisão.
// Arquivo: Calculadora.java

package controle;

import java.util.Scanner; // programa utiliza Scanner

public class Calculadora {

	public static void main(String[] args) {
		
		// Cria Scanner para obter dados 
		// Prompt de captura
		Scanner teclado = new Scanner(System.in);

		// Variáveis
		int opcao,      // seleciona a opção
			numero1,    // primeiro número solicitado
			numero2,    // segundo número solicitado
		    soma,       // operação de soma
		    subtracao,  // operação de subtração
		    produto;    // operação de multiplicação
		
		double divisao; // operação de divisão
		
		String divisaoSemPontoZero; // string para gerar resultado da divisão sem ",00" e ".00"
		
		// Menu de exibição
		System.out.println();
		System.out.println("\t/////////// Calculadora ///////////");
		System.out.println();
		System.out.println("\t***********************************");
		System.out.println("\tEssa Calculadora Realiza Operações");
		System.out.println("\t  Soma-Subtração-Produto-Divisão");
		System.out.println("\t***********************************");
		System.out.println();
		
		// Menu de Opções
		System.out.println("\tDigite:");
		System.out.println("\t 1 - Soma (+)");
		System.out.println("\t 2 - Subtração (-)");
		System.out.println("\t 3 - Produto (X)");
		System.out.println("\t 4 - Divisão (÷)");
		System.out.println("\t 5 - Sair");
		
		// Solicita opção da operação
		System.out.print("\tInforme a operação: "); 
		opcao = teclado.nextInt(); // lê a opção desejada
		System.out.println("\t***********************************");
		
		
		// Repete operação caso deseje fazer vários cálculos
		while (opcao >= 1 && opcao <= 4) {
			
			// Solicita número para cáculo
			System.out.println("\tAgora digite os números para cálculo:");
			System.out.print("\t1º número: "); // lê o primeiro número
			numero1 = teclado.nextInt();
			System.out.print("\t2º número: ");
			numero2 = teclado.nextInt(); // lê o segundo número
			
			// Seleciona a operação
			switch (opcao) {
			
			case 1:
				// Cálculo da operação soma
				soma = numero1 + numero2;
				System.out.printf("\t%d + %d = %d%n", numero1, numero2, soma);
				System.out.println("\t***********************************");
				break;
				
			case 2:
				// Cálculo da operação de subtração com condição para não gerar
				// resultado negativo.
				if(numero1 > numero2) {
					subtracao = numero1 - numero2;
					System.out.printf("\t%d - %d = %d%n", numero1, numero2, subtracao);
					System.out.println("\t***********************************");
					
				} else {
					subtracao = numero2 - numero1;
					System.out.printf("\t%d - %d = %d%n", numero2, numero1, subtracao);
					System.out.println("\t***********************************");
				}
				break;
				
			case 3:
				// Cálculo do produto
				produto = numero1 * numero2;
				System.out.printf("\t%d X %d = %d%n", numero2, numero1, produto);
				System.out.println("\t***********************************");
				break;
				
			case 4:
				// Calculo da divisão 
				divisao = (double) numero1 / numero2;
				// Transforma o resultado da divisão em String para formatar e gerar valor
				// sem ".00" e ",00" no final do número. Exemplo: 1,00 --> 1 
				divisaoSemPontoZero = String.format("%.2f", divisao).replace(",00", "").
						replace(".00", "");
				System.out.printf("\t%d ÷ %d = %s%n", numero1, numero2, divisaoSemPontoZero);
				break;
							
			} // fim da instrução Switch
			
			// Dá opção para fazer mais cálculo ou sair
			System.out.println("\tOutra operação ?");
			System.out.print("\tInforme a operação: "); 
			opcao = teclado.nextInt(); // lê a opção desejada
			System.out.println("\t***********************************");
		
		} // fim da instrução While
		
		// Mensagem de sáida
		System.out.println("\tVocê saiu!!");
		System.out.println("\tFim!!");
		System.out.println("\t***********************************");
				
		teclado.close(); // fim classe Scanner

	} // fim do método main

} // fim da classe Calculadora
