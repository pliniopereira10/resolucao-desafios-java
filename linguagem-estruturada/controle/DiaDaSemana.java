// Programa retorna dia da Semana
// Arquivo: DiaDaSemana.java

package controle;

import java.util.Scanner; // Programa utiliza Scanner

public class DiaDaSemana {

	public static void main(String[] args) {
		
		// Programa solicita o nome do dia e retorna qual dia é da semana
		
		// Variável
		String nome;
		
		// Prompt de Captura
		Scanner teclado = new Scanner(System.in);
		
			System.out.print("Digite o nome do dia: ");
			nome = teclado.next();                      // captura o nome 
		
			// Estrutura de condição utilizando função equalsIgnoreCase()
			// Dois iguais "==" para comparação de Strings ocorre erro no código 
			if(nome.equalsIgnoreCase("domingo")) {
				System.out.println("1º dia da semana.");
			} else if(nome.equalsIgnoreCase("segunda")) {
				System.out.println("2º dia da semana.");
			} else if(nome.equalsIgnoreCase("terça") 
					|| nome.equalsIgnoreCase("terca")) {
				System.out.println("3º dia da semana.");
			} else if(nome.equalsIgnoreCase("quarta")) {
				System.out.println("4º dia da semana.");
			} else if(nome.equalsIgnoreCase("quinta")) {
				System.out.println("5º dia da semana.");
			} else if(nome.equalsIgnoreCase("sexta")) {
				System.out.println("6º dia da semana.");
			} else if(nome.equalsIgnoreCase("sabado")
					|| nome.equalsIgnoreCase("sábado")) {
				System.out.println("7º ou último dia da semana.");
			} else {
				System.out.println("Dia inválido!");
			}
			
			System.out.println("Fim!");
			
		teclado.close(); // fim da classe Scanner

	} // fim do método main

} // fim da classa DiaDaSemana
