/*
 * 	Uma palavra palíndroma é aquela cuja sequência de letras é simétrica, permitindo uma leitura
 *  idêntica da esquerda para a direita ou da direita para a esquerda: ovo, osso, reler, anilina.	
 * 
 * 	Programa tem a finalidade de verificar se a palavra digitada é um Palíndromo.	
 * 
 * 	File:	Palindrome.java
 * 	
 * 	@author plinio.pereira10@gmail.com
 * 	@version 1.0.0
 * 	@since 13/11/2022
 */

package controle;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {

		String word;
		boolean isPalindrome;

		Scanner input = new Scanner(System.in);

		System.out.println("Vamos verificar se uma palavra é palíndroma?");
		System.out.print("Digite a palavra:");
		word = input.next();

		isPalindrome = palindromeChecker(word);

		printResult(isPalindrome);

		input.close();
	}
	
	public static boolean palindromeChecker(String word) {
		String[] letters = word.split("");

		String newWord = "";
		for (int i = letters.length - 1; i >= 0; i--) {
			newWord += letters[i];
		}

		return word.equals(newWord);
	}
	
	public static void printResult(boolean is) {
		String menssage;
		
		if (is) {
			menssage = "A palavra é palíndroma.";
		}
		else {
			menssage = "A palavra não é palíndroma.";
		}
		
		System.out.println(menssage);
	}
}
