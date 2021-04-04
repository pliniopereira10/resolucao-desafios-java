// Programa calcula média 3 últimos sálarios
// Arquivo: MediaSalarios.java

package fundamentos;

import java.util.Scanner;

public class MediaSalarios {

	public static void main(String[] args) {
		
		/*
		 * Por meio da classe Scanner capiturar strings recebendo os 3 últimos
		 * salários de um funcionário dando a possibilidade dele digitar ponto(.)
		 * ou vírgula(,), posteriormente calcular e dar resposta da média.
		 * Convertendo uma string para valor numérico.
		 */
		
		// Variáveis
		// Por regra lembre variáveis no estilo camelCase comaça com letra minúscula 
		String salario1, // Primeiro salário string
			   salario2, // Segundo salaŕio string
			   salario3, // Terceiro salário string
			   nomeFunc; // Nome do Funcionário
		
		float primeiroValor, // Primeiro salário numérico após conversão string
			  segundoValor, // Segundo salário numérico após conversão string
			  terceiroValor, // Terceiro salário numérico após conversão string
			  mediaSal;
		
		// Menu de exibição
		System.out.print("---------- ");
		System.out.print("Cálculo Média Salárial");
		System.out.println(" ----------");
		System.out.println("\tMédia três últimos salários\n");
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite o nome do Funcionário: ");
		nomeFunc = teclado.next();
		
		// Passando objeto Float pelo método parse converte tipo string em tipo numérico
		System.out.print("Primeiro salário R$ ");
		salario1 = teclado.next().replace(",", "."); // Método replace troca (,) por (.)
		primeiroValor = Float.parseFloat(salario1); 
		
		System.out.print("Segundo salário R$ ");
		salario2 = teclado.next().replace(",", ".");
		segundoValor = Float.parseFloat(salario2);
		
		System.out.print("Terceiro salário R$ ");
		salario3 = teclado.next().replace(",", ".");
		terceiroValor = Float.parseFloat(salario3);
		
		// Fórmula cáculo da média
		mediaSal = (primeiroValor + segundoValor + terceiroValor) / 3;
		
	System.out.printf("A média dos 3 últimos saĺários de %s %né R$ %.2f",
			nomeFunc, mediaSal);
			
		teclado.close(); // final classe Scanner

	} // final método main

} // final classe MediaSalarios
