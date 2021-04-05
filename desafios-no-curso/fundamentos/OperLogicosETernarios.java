// Programa expõe situação para teste de operadores lógicos e ternários
// OperLogicosETernarios.java

package fundamentos;

import java.util.Scanner;

public class OperLogicosETernarios {

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
		
		Boolean trabalho1,
				trabalho2;
		
		String vamosComprarTv50,
			   vamosComprarTv32,
			   vamosTomarSorvete,
			   conseguiuPrimTrab,
			   conseguiuSegTrab,
			   maisSaudavel;
		
		// Menu de exposição
		System.out.println("\t*****************************************");
		System.out.print("Estou aguardando meu Pai, ele disse se conseguisse dois ");
		System.out.print("trabalhos.\nEsse final de semana iríamos ao shopping ");
		System.out.println("comprar TV 50\" ou 32\" e tomar sorvete.");
		System.out.println("\t*****************************************");
		
		// Captura entrada de dados
		Scanner teclado = new Scanner(System.in);
		
		/* Captura uma resposta na variável conseguiuPrimTrab no tipo String, posteriormente
		 * com método replace faz a troca pela resposta por true ou false. Na variável trabalho1
		 * através do método parseBoolean converte String para Boolean.
		 * Nas variáveis seguinte conseguiuSegTrab e trabalho2, acontece o mesmo.
		 */
		System.out.println("Ele chegou.Oiii!");
		System.out.print("Conseguiu o primeiro trabalho? ");
		conseguiuPrimTrab = teclado.next().replace("sim", "true").replace("Sim", "true").
				replace("não", "false").replace("Não", "false").replace("nao", "false").
				replace("Nao", "false");
		trabalho1 = Boolean.parseBoolean(conseguiuPrimTrab);
		
		System.out.print("E o segundo? ");
		conseguiuSegTrab = teclado.next().replace("sim", "true").replace("Sim", "true").
				replace("não", "false").replace("Não", "false").replace("nao", "false").
				replace("Nao", "false");
		trabalho2 = Boolean.parseBoolean(conseguiuSegTrab);
		
		 // Utiliza operador ternário para obter resposta
		 vamosComprarTv50 = trabalho1 && trabalho2 ? "Sim" : "Não";
		 vamosComprarTv32 = trabalho1 ^ trabalho2 ? "Sim" : "Não";
		 vamosTomarSorvete = trabalho1 || trabalho2 ? "Sim" : "Não";
		 maisSaudavel = !(trabalho1 || trabalho2) ? "Sim :-)" : "Não :-(";
		 				
		// Resposta
		System.out.println("\t*****************************************");
		System.out.println("Vamos comprar e TV 50\"? " + vamosComprarTv50);
		System.out.println("E a Tv 32\"? " + vamosComprarTv32);
		System.out.println("Vamos tomar sorvete? " + vamosTomarSorvete);
		System.out.println("Mais saudável? " + maisSaudavel);				
		teclado.close(); // final classe Scanner
		
	} // final método main

} // final classe OperLogicosETernarios
