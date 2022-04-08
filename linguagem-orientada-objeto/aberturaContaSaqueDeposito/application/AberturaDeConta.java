/*
 * Programa faz abertura de uma conta recebendo número dela, nome do cliente e valor para depósito
 * se houver. Posteriormente exibe os dados com número da conta, nome do cliente e saldo.
 * Depois dá opção para depósito e saque com desconto de uma taxa.
 * 
 * Arquivo: AberturaConta.java
 */

package aberturaContaSaqueDeposito.application;

import java.util.Locale;
import java.util.Scanner;

import aberturaContaSaqueDeposito.entities.ContaBancaria;

public class AberturaDeConta {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US); // utiliza separador de casas decimais ponto.

		// Cria Scanner
		// Prompt de captura de dados
		Scanner input = new Scanner(System.in);

		// Variáveis
		int numeroDaconta;
		String nomeDoTitular;
		double valorDeposito;
		double valorSaque;
		char depositoInicial;
		ContaBancaria cadastro;

		// Exibe solicitações de entrada
		System.out.print("Enter account number: ");
		numeroDaconta = input.nextInt(); // lê número da conta
		input.nextLine(); // limpa o buffer de leitura
		System.out.print("Enter account holder: ");
		nomeDoTitular = input.nextLine();
		System.out.print("Is there na initial deposit (y/n)? ");
		depositoInicial = input.next().charAt(0);

		// Ramificação para controle de decisão, se tiver entrada do valor de depósito
		if (depositoInicial == 'y') {
			System.out.print("Enter initial deposit value: ");
			valorDeposito = input.nextDouble();
			cadastro = new ContaBancaria(numeroDaconta, nomeDoTitular, valorDeposito);

		} else {
			cadastro = new ContaBancaria(numeroDaconta, nomeDoTitular);

		}

		System.out.println();
		System.out.println("Account data:");
		for (int i = 0; i < 2; i++) {
			System.out.println(cadastro); // exibe saída de dados

			if (i == 0) {
				System.out.print("\nEnter a deposit value: "); // exibe solicitação de depósito
				valorDeposito = input.nextDouble(); // lê valor de depósito
				cadastro.deposito(valorDeposito); // metódo calcula saldo

			} else {
				System.out.print("\nEnter a withdraw value: "); // exibe solicitação de saque
				valorSaque = input.nextDouble();
				cadastro.saque(valorSaque);

			}
			System.out.println("Updated account data:"); // exibe saída dos dados após atualização

		}
		System.out.println(cadastro);

		input.close();

	}

}
