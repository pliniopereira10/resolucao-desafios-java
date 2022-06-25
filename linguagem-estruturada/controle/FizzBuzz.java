/*
 * Developer: pliniopereira10@gmail.com
 * Classname: FizzBuzz
 * Version: 1.5.0
 * 
 * Programa tem como objetivo imprimir na saída do terminal a contagem de 1 até 100, posteriormente, as Strings:
 * "Fizz" para números múltiplos de 3
 * "Buzz" para números múltiplos de 5
 * "FizzBuzz" para números que são múltiplos de 3 e 5 ao mesmo tempo
 * 
 * Mudou da version 1.0.0 para 1.5.0 devido uma melhoria no código
 */

package controle;

public class FizzBuzz {

	public static void main(String[] args) {
		
		int numberOne = 1;
		int numberOneHundred = 100;
		int numberTwenty = 20;
		int numberZero = 0;
		int numberThree = 3;
		int numberFive = 5;
		
		System.out.println("Printing numbers from 1 to 100:\n");
		for (int i = numberOne; i <= numberOneHundred; i++) {
			System.out.print(i + " ");
			
			if (i % numberTwenty == numberZero) {
				System.out.println();
			}
			
		}
		
		System.out.println();
		System.out.println("Printing numbers from 1 to 100:");
		System.out.println("- numbers multiples of 3 prints Fizz.");
		System.out.println("- numbers multiples of 5 prints Buzz.");
		System.out.println("- numbers multiples of 3 and 5 prints FizzBuzz.\n");
		for (int i = numberOne; i <= numberOneHundred; i++) {
			if (i % numberThree == numberZero && i % numberFive == numberZero) {
				System.out.print("FizzBuzz ");
				
			} else if (i % numberThree == numberZero){
				System.out.print("Fizz ");
				
			} else if (i % numberFive == numberZero) {
				System.out.print("Buzz ");
				
			} else {
				System.out.print(i + " ");
			}
			
			if (i % numberTwenty == numberZero) {
				System.out.println();
			}
			
		}
		 
	}

}
