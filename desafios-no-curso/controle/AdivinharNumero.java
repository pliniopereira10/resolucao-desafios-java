// Programa solicita um número de 0 a 100. O jogador tem 10 tentativas para advinhar
// o número aleatório. Ao final de cada tentativa é imprimido a quantidade tentativas
// restante e se o número é maior ou menor que o valor armazenado.
// Arquivo: AdivinharNumero.java

package controle;

import java.util.Scanner; // programa utiliza Scanner

public class AdivinharNumero {

	public static void main(String[] args) {

		// Cria Scanner
		// Prompt captura de dados 
		Scanner teclado = new Scanner(System.in);

		// Variáveis
		int numeroDaSorte = 52;  // número da sorte
		int numInserido;         // recebe o número inserido 

		boolean semSorte;        // recebe valor para ser sem sorte
		boolean numeroMaior;     // recebe valor para ser número maior
		boolean numeroMenor;     // recebe valor para ser número menor

		// Inicia solicitando ao usuário digitar um número
		System.out.print("Digite um número: ");  
		numInserido = teclado.nextInt();         // lê o número inserido

		// Faz operações para verificar se é sem sorte, número maior e número menor
		semSorte = numInserido != numeroDaSorte;
		numeroMaior = numInserido > numeroDaSorte;
		numeroMenor = numInserido < numeroDaSorte;

		/* 
		 * 1º Estrutura de controle condicional.
		 * Caso número digitado seja diferente do número da sorte. O programa informa se o número
		 * digitado é maior ou menor que o número da sorte.
		 * A variável numeroMenor na condição 'else if' faz necessário, pois, sem essa condição
		 * mesmo que o usuário acertasse o número sorte na primeira tentativa independentemente a 
		 * mensagem "menor que o" seria imprimida na tela. 
		 */
		if(numeroMaior) {
			System.out.printf("O número %d é maior que o número da sorte.%n",
					numInserido);
			} else if(numeroMenor){  
				System.out.printf("O número %d é menor que o número da sorte.%n", 
					numInserido);

		} // fim da 1º estrutura de condição

		/*
		 * 2° Estrutura de controle condicional.
		 * Se o número for diferente do número da sorte inicia estrutura 'else', caso acerte
		 * na primeira tentativa, aparece mensagem "Parabéns".
		 */
		if(semSorte) {
			// Estrutura de repetição condicional para contar tentativas restante
			// se continuar sem sorte.
			for (int qtdTentativasRest = 9; qtdTentativasRest > 0 && semSorte;
					qtdTentativasRest--) {
				System.out.println("Ops, :-( !!!");
				System.out.println("*****************************************");
				System.out.printf("Você tem %d tentativas restantes.",
						qtdTentativasRest);
				System.out.print("\nDigite outro número: ");
				numInserido = teclado.nextInt();
				
				// Essas variáveis há necessidade de repetir dentro da estrutura
				semSorte = numInserido != numeroDaSorte;
				numeroMaior = numInserido > numeroDaSorte;
				
				// 3º Estrutura de controle condicional
				if (semSorte) {
					// 4º Estrutura de controle condicional
					if(numeroMaior) {
						System.out.printf("O número %d é maior que o número da sorte.%n",
								numInserido);
						} else {
							System.out.printf("O número %d é menor que o número da sorte.%n", 
								numInserido);
							
					} // fim 4º estrutura de condição

				} // fim da 3º estrutura de condição
				
				// Introduzi essa 5º condição para quando acertar dentro das tentativa
				if(!semSorte){
					System.out.println("Acertou o número.\nVocê é sortudo !! :-)");

				} // fim da 5º estrutura de condição
				
				// 6º estrutura de controle condicional para quando acabar as tentativas
				if(qtdTentativasRest == 1 && semSorte){
					System.out.println(":( Acabou suas tentativas.");
				} // fim da 6º estrutura de condição

			} // fim da estrutura de repetição

			} else {
				System.out.println("Parabéns, você é sortudo !!!\nAcertou na 1º tentativa.");
				System.out.println(":-0 :-)");

		} // fim da 2º estutura de condição

		teclado.close(); // fim classe Scanner

	} // fim do método main

} // fim da classe AdivinharNumero