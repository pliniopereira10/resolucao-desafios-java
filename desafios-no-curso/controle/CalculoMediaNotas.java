// Programa calcula a média de notas inseridas
// CalculoMediaNotas.java

package controle;

import java.util.Scanner;

public class CalculoMediaNotas {

	public static void main(String[] args) {
		
		/*
		 * O programa tem finalidade de calcular média de notas de uma turma. Conforme é
		 * solicitado para inserir a nota. Programa vai armazenando elas, posteriormente
		 * quando solicitado para sair, exibe o resultado das médias.
		 */
		
		// Prompt de captura
		Scanner teclado = new Scanner(System.in);
		
		// Variáveis
		double media;
		double nota = 0;
		double total = 0;

		int quantidadeDeNotas = 0;
		
				
		// Menu de exibição
		System.out.println("****\t****\t****\t****\t****");
		System.out.println("||\tCálculo Média De Notas\t  ||");
		System.out.println("****\t****\t****\t****\t****");
		
		System.out.println();
		
		System.out.println("Para visualizar o resultado e sair.");
		System.out.println("Digite \"-1\".\n");
		
		// Início da estrutura de repetição
		while(nota != -1) {
			
			System.out.print("Informe uma nota: ");
			nota = teclado.nextDouble();
			
			// Início da condição
			if(nota >= 0 && nota <=10) {
				
				total = total + nota;   // Equivale a total += nota
				quantidadeDeNotas++;
				
			} else if(nota > 10) {
				
				System.out.println("Por favor, \ninsira uma nota válida:");
				//nota = teclado.nextDouble();
				//quantidadeDeNotas++;
				
			} // fim da condição
				
		} // fim estrutura de repetição
	
		// Cálculo da média
		media = total / quantidadeDeNotas;
		System.out.println("\t\t\t\t  ||");
		System.out.println("****\t****\t****\t****\t****");
		System.out.printf("Foram digitadas %d notas.%nA média das notas é %.2f",
				quantidadeDeNotas, media);
		System.out.println("\t  ||");
		System.out.println("****\t****\t****\t****\t****");

		teclado.close(); // fim classe Scanner

	} // fim método main

} // fim classe CalculoMediaNotas
