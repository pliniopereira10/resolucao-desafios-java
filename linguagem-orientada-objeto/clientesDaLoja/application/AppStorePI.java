/*
 * Atividade proposta Professor Isidro - Orientação a Objetos.
 * Exercício proposto de herança Aula 206 - 'Clientes da Loja'.
 * 
 * Programa com a finalidade de exibir dados para Cliente efetuar compras, assim as classes
 * e métodos executam diferentes comportamentos devido interface, herança e polimorfismo.
 * 
 * File: Customer.java
 * 		 SpecialCustomer.java
 * 		 VipCustomer.java 
 * 		 AppStorePI.java
 * 
 * @author plinio.pereira10@gmail.com
 * @version 2.0.0
 * @since 7/10/2022
 */

package clientesDaLoja.application;

import clientesDaLoja.models.SpecialCustomer;
import clientesDaLoja.models.VipCustomer;
import clientesDaLoja.repositories.Customer;

public class AppStorePI {

	public static void main(String[] args) {

		Customer customer;

		customer = new SpecialCustomer("Armando", "armando@gmail.com", 200.0);
		System.out.println(customer.toString());
		customer.purchase(200.0);
		customer.payOff(50.0);
		System.out.println(customer.toString());

		System.out.println();
		
		customer = new VipCustomer("Carlos", "carlos@gmail.com", 500.0, 300.0);
		System.out.println(customer.toString());
		customer.purchase(800.0);
		customer.payOff(50.0);
		System.out.println(customer.toString());


	}

}
