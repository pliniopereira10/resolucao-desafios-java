// Programa gera desconto para produtos
// Arquivo: ProgramaTeste.java

package GeradorDesconto;

import java.util.Scanner; // programa utiliza Scanner

public class ProgramaTeste {

	public static void main(String[] args) {
		
		// Cria Scanner
		// Prompt captura de dados 
		Scanner teclado = new Scanner(System.in);
		
		// Variáveis
		double valorDoDesconto; // recebe valor adicional entre 0.0 e 1.0 para desconto
		int temDesconto;        // recebe opção de 1 ou 0  
		
		// Exibe nome da loja
		System.out.printf("\t\"%s\"%n", Loja.NOME_DA_LOJA);
		
		// Cria o objeto com contrutor padrão
		Produto produtoSemDesc = new Produto();
		
		System.out.print("Insira o valor do produto:R$ "); // Solicita o valor do produto
		produtoSemDesc.valor = teclado.nextDouble();       // Lê o valor sem desconto
		
		System.out.println("Tem desconto especial?:");    // Pergunta se tem desconto especial 
		System.out.println("0 - não");                    // Exibe opção 0
		System.out.println("1 - sim");					  // Exibe opção 1
		temDesconto = teclado.nextInt();                  // Lê opção digitada  
		
		// Estrura de controle condicional para desconto adicional ou normal
		if(temDesconto == 1) {
		
			System.out.println("Qual Percentual?:");
			valorDoDesconto = teclado.nextDouble();
			System.out.printf("O valor com desconto é R$ %.2f", Produto.
					desconto(produtoSemDesc.valor, valorDoDesconto));
			
			} else {
		
			System.out.printf("O valor com desconto é R$ %.2f", Produto.
					desconto(produtoSemDesc.valor));
		
		} // fim estrutura condicional

		teclado.close(); // fim da classe Scanner

	} // fim do método main

} // fim da classe ProgramaTeste