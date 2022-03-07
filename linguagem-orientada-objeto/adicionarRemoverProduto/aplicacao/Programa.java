package adicionarRemoverProduto.aplicacao;

import java.util.Locale;
import java.util.Scanner;

import adicionarRemoverProduto.entidade.Produto;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner input = new Scanner(System.in);
		
			Produto produto;
			int quantity;
			
			produto = new Produto();
			
			// Leitura de dados
			System.out.println("Enter product data:");
			System.out.print("Name: ");
			produto.name = input.nextLine();
			System.out.print("Price: ");
			produto.price = input.nextDouble();
			System.out.print("Quantity in stock: ");
			produto.quantity = input.nextInt();
			
			// Exibição de dados após leitura
			System.out.println();
			System.out.println("Produc data:" + produto);
			
			// Adição de produtos
			System.out.println();
			System.out.print("Enter the number of products to be added in stock: ");
			quantity = input.nextInt();
			produto.AddProducts(quantity);
			
			// Exibição após produto adicionado
			System.out.println();
			System.out.println("Update data:" + produto);
			
			// Remoção de produtos
			System.out.println();
			System.out.print("Enter the number of products to be removed in stock: ");
			quantity = input.nextInt();
			produto.RemoveProducts(quantity);
			
			// Exibição após produtos removidos
			System.out.println();
			System.out.println("Update data:" + produto);
		
		input.close();

	}

}

