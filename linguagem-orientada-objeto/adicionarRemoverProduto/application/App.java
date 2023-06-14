package adicionarRemoverProduto.application;

import java.util.Locale;
import java.util.Scanner;

import adicionarRemoverProduto.entities.Product;

public class App {
    public static void main(String[] args) {

        Scanner input;
        Product product;

        Locale.setDefault(Locale.US);
        input = new Scanner(System.in);
        product = new Product();

        try {
            System.out.println("Enter product data:");
            System.out.print("Name: ");
            product.setName(input.nextLine());
            System.out.print("Price: ");
            product.setPrice(input.nextDouble());
            System.out.print("Quantity in stock: ");
            product.addProducts(input.nextInt());

            System.out.println();

            System.out.print("Product data: ");
            System.out.println(product);

            System.out.println();

            System.out.print("Enter the number of products to be added in stock: ");
            product.addProducts(input.nextInt());

            System.out.println();

            System.out.print("Update data: ");
            System.out.println(product);

            System.out.println();

            System.out.print("Enter the number of products to be removed from stock: ");
            product.removeProducts(input.nextInt());

            System.out.print("Update data: ");
            System.out.println(product);

            System.out.println();

        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }

        input.close();

    }
}
