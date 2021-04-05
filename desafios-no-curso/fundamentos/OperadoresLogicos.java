// Programa expõe situações para teste de operadores lógicos
// OperadoresLogicos.java

package fundamentos;

import java.util.Scanner;

public class OperadoresLogicos {

	public static void main(String[] args) {
		
		/*
		 * Imagine que você terá dois trabalhos na próxima semana e eles podem ou
		 * não se confirmar. 
		 * Você prometeu para sua família se os dois trabalhos derem certo comprará
		 * uma TV 50" no final de semana e tomarão sorvete juntos.
		 * Se apenas um dos trabalhos derem certo comprará uma TV 32" e também tomarão
		 * sorvete juntos.
		 * Não conseguindo nenhum dos trabalhos não vão tomar sorvete e nem comprar TV.
		 */
		
		// Defini a variáveis nos seus tipos primitivos Wrapers a fim de utilizar métodos
		Boolean trabalho1,
		        trabalho2,
		        comprarTv50,
		        comprarTv32,
		        tomarSorvete;
		
		String conseguiuPrimJob,
			   conseguiuSegJob;
					
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Olá!"); 
		System.out.print("Você conseguiu o primeiro trabalho? ");
		conseguiuPrimJob = teclado.next().replace("sim", "true").replace("Sim", "true").
				replace("não", "false").replace("nao", "false").replace("Não", "false");
		trabalho1 = Boolean.parseBoolean(conseguiuPrimJob); // Converti string para Boolean
		
		System.out.print("E o segundo? ");
		conseguiuSegJob = teclado.next().replace("sim", "true").replace("Sim", "true").
				replace("não", "false").replace("nao", "false").replace("Não", "false");
		trabalho2 = Boolean.parseBoolean(conseguiuSegJob); // Converti String para Boolean
		
		comprarTv50 = trabalho1 && trabalho2;
		comprarTv32 = trabalho1 ^ trabalho2;
		tomarSorvete = trabalho1 || trabalho2;
		
		// Utiliza escaping (\") para colocar aspas duplas
		// toString converte o Boolean para String, a fim utilizar método replace
		System.out.println("Vamos ao shopping comprar TV 50\"? " + comprarTv50.toString().
				replace("true", "Sim").replace("false", "Não"));
		System.out.println("Comprar TV 32\"? " + comprarTv32.toString().
				replace("true", "Sim").replace("false", "Não"));
		// Utilizando instrução Boolean.toString() posso transformar a variável em String
		System.out.println("Vamos tomar sorvete? " + Boolean.toString(tomarSorvete).
				replace("true", "Sim").replace("false", "Não"));
				
		teclado.close(); // fim classe scanner

	} // fim método main

} // fim classe OperadoresLogicos
