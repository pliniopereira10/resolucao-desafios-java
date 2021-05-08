// Programa efetua divisão e imprime os seu componetentes: 
// dividendo, divisor, quociente,resto.
// Arquivo: Divisão.java

package fundamentos;

import java.util.Scanner; // programa utiliza Scanner

public class Divisao {

	public static void main(String[] args) {
		
		// Cria Scanner
		// Prompt captura de dados 
		Scanner teclado = new Scanner(System.in);

		// Variáveis
		int dividendo;   // recebe dividendo
		int divisor;	 // recebe divisor
		int quociente;   // recebe quociente ou resultado
		int resto;       // recebe resto
		
		// Conceito sobre a divisão
		System.out.println("********************************************************");
		System.out.println("* A divisão é uma das quatro operações da Matemática e *");
		System.out.println("* é representada pelo seguinte algoritmo:\t       *");
		System.out.println("* \tDividendo ← a | b → Divisor\t\t       *");
		System.out.println("* \t    Resto ← d   c → Quociente\t\t       *");
		System.out.println("********************************************************");
				
		System.out.println("Informe dois números para divisão."); // solicita dois números
		System.out.println("Primeiro - dividendo: ");             // solicita primero número
		dividendo = teclado.nextInt();                            // lê o primeiro número
		System.out.println("Segundo - divisor: ");				  // solicita segundo número
		divisor = teclado.nextInt();							  // lê o segundo número							
		
		// Epressão para cálculo do quociente ou resultado
		quociente = dividendo / divisor;                         
		
		// Exibe o cálculo
		System.out.print("O cálculo é: ");
		System.out.printf("%d ÷ %d = %d%n", dividendo, divisor,quociente);
		
		// Expressao para cálculo do resto
		resto = dividendo % divisor;
		
		// Informa as partes do algoritmo da divisão
		System.out.println("Dividendo: " + dividendo);
		System.out.println("Divisor: " + divisor);
		System.out.println("Quociente: " + quociente);
		System.out.println("Resto: " + resto);

		teclado.close(); // fim classe Scanner

	}

}
