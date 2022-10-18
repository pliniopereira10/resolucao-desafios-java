/*
 * Atividade proposta Professor Isidro - Orientação a Objetos.
 * Exercício proposto de herança Aula 206 - 'Clientes da Loja'.
 * 
 * Programa com a finalidade de exibir dados para Cliente efetuar compras, assim as classes
 * e métodosde executam diferentes comportamentos devido herança e polimorfismo.
 * 
 * File: Customer.java
 * 		 SpecialCustomer.java
 * 		 VipCustomer.java 
 * 		 AppStorePI.java
 * 
 * @author plinio.pereira10@gmail.com
 * @version 1.0.0
 * @since 7/10/2022
 */

package clientesDaLoja.application;

import java.util.Scanner;

import clientesDaLoja.models.Customer;
import clientesDaLoja.models.SpecialCustomer;
import clientesDaLoja.models.VipCustomer;

public class AppStorePI {

	public static void main(String[] args) {

		Customer customer;
		int option;

		var input = new Scanner(System.in);

		System.out.println("Informe:");
		System.out.println("1 - Cliente Especial");
		System.out.println("2 - Cliente Vip");

		option = input.nextInt();

		if (option == 1) {
			customer = new SpecialCustomer("Armando", "armando@gmail.com", 200.0);
			customer.message();
		} 
		else if (option == 2) {
			customer = new VipCustomer("Carlos", "carlos@gmail.com", 500.0, 300.0);
			customer.message();
		} 
		else {
			System.out.println("Opção Inválida ..!!");
		}

		input.close();

	}

}
