// Programa calcula o salário líquido de um professor baseado:
// valor hora aula, número de aulas dada no mês, percentual de desconto INSS.
// Arquivo: SalarioLiquidoProfessor.java

package fundamentos;

import java.util.Scanner; // prigrama utiliza Scanner

public class SalarioLiquidoProfessor {

	public static void main(String[] args) {
		
		// Cria Scanner
		// Prompt captura de dados 
		Scanner teclado = new Scanner(System.in);

		// Variáveis
		int qtdAulasNoMes;		// recebe quantidade de aulas
		double vlrHoraAula;		// recebe valor da hora aula
		double salarioLiquido;	// recebe salário liquido
		double descontoInss;	// recebe valor de desconto sendo 0.1 equivalente a 10%
		
		// Menu de exibição
		System.out.println("********************************************");
		System.out.println("\tCálculo Salário Do Professor");
		System.out.println("********************************************");
		
		//Solicita as informações
		System.out.println("Digite sequintes informações do Professor.");
		System.out.print("Quantidade de aulas: ");       // quantidade de aulas
		qtdAulasNoMes = teclado.nextInt();				// lê a quantidade de aulas
		System.out.print("Valor da hora aula: ");		// valor da hora aulas
		vlrHoraAula = teclado.nextDouble();				// lê o valor da hora aula
		System.out.print("Desconto INSS(0.0 a 1.0): ");	// percenctual de desconto
		descontoInss = teclado.nextDouble();			// lê o percentual
		
		// Equação para cálculo do salário líquido
		salarioLiquido = (qtdAulasNoMes *  vlrHoraAula) * (1 - descontoInss);
		
		// Exibe o valor do salário líquido
		System.out.printf("O salário líquido é R$ %.2f%n", salarioLiquido);
		System.out.println("********************************************");
		
		teclado.close(); // fim classe Scanner

	} // fim do método main

} // fim da classe SalarioLiquidoProfessor
