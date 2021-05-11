// Programa calcula média ponderada de 4 notas inseridas
// Arquivo: MediaPonderada.java

package fundamentos;

import java.util.Scanner; // programa utiliza Scanner

public class MediaPonderada {

	public static void main(String[] args) {
		
		// Cria Scanner
		// Prompt captura de dados 
		Scanner teclado = new Scanner(System.in);

		// Variáveis
		double notaUm;			// recebe primeira nota
		double notaDois;		// recebe segunda nota
		double notaTres;		// recebe terceira nota
		double notaQuatro;		// recebe quarta nota
		double mediaPonderada;	// recebe cálculo 
		
		final int PESO_UM = 1;		// peso 1 para cálculo
		final int PESO_DOIS = 2;	// peso 2 para cálculo			
		final int PESO_TRES = 3;	// peso 3 para cálculo
		final int PESO_QUATRO = 4;	// peso 4 para cálculo
		final int DIVISOR = 10;		// divisor com a soma dos pesos para cálculo
		
		// Solicita inserção de quatro notas
		System.out.println("Informe quatro notas, para cáculo da média ponderada.");
		System.out.print("1º nota: ");		// primeira nota
		notaUm = teclado.nextDouble();		// lê a nota
		System.out.print("2º nota: ");		// segunda nota
		notaDois = teclado.nextDouble();	// lê a nota
		System.out.print("3º nota: ");		// terceira nota
		notaTres = teclado.nextDouble();	// lê a nota
		System.out.print("4º nota: ");		// quarta nota
		notaQuatro = teclado.nextDouble();	// lê a nota
		
		// Operação para cálculo da média ponderada
		mediaPonderada = (notaUm * PESO_UM + notaDois * PESO_DOIS + notaTres * PESO_TRES +
				notaQuatro * PESO_QUATRO) / DIVISOR;
		
		// Exibe resultado da média ponderada
		System.out.printf("A média ponderada das notas é %.2f%n", mediaPonderada);

		teclado.close(); // fim classe Scanner

	} // fim do método main

} // fim da classe MediaPonderada
