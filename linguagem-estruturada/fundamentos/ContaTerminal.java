/*
 * Atividade proposta DIO - Trilha Java Básico.
 * 
 * Programa tem a finalidade de simular a entrada de dados de uma conta bancária, 
 * por meio de terminal. Posteriormente exibir uma mensagem com informações inseridas.
 * 
 * File: ContaTerminal.java
 * 
 * @author plinio.pereira10@gmail.com
 * @version 1.0.0
 * @since 16/09/2022
 */

package fundamentos;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);

		int numeroConta;
		String agencia;
		String nomeCliente;
		double saldo;

		System.out.println("Por favor, digite.");
		System.out.print("Número da Agência: ");
		agencia = entrada.next();
		System.out.print("Número da Conta: ");
		numeroConta = entrada.nextInt();
		entrada.nextLine();
		System.out.print("Nome do Cliente: ");
		nomeCliente = entrada.nextLine();
		System.out.print("Saldo da Conta: ");
		saldo = entrada.nextDouble();
		
		System.out.println();
		
		System.out.println("Olá " + nomeCliente.concat(", obrigado por criar uma conta em nosso banco."));
		System.out.print("Sua agência é " + agencia.concat(", conta ") + numeroConta);
		System.out.printf(" %s %.2f %s%n", "e seu saldo", saldo, "já está disponível para saque.");
		
		entrada.close();

	}

}
