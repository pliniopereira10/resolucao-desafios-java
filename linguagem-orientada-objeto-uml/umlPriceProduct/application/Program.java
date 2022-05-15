//	Creation of the class of the main method responsible for interacting with the user

package umlPriceProduct.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import umlPriceProduct.entities.ImportedProduct;
import umlPriceProduct.entities.Product;
import umlPriceProduct.entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		int quantity;
		
		List<Product> listProduct = new ArrayList<>();
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
			
			System.out.print("Enter number of products: ");
			quantity = input.nextInt();
			
				for (int i = 1; i <= quantity; i++) {
					System.out.println("Product #" + i + " data:");
					System.out.print("Common, used or imported (c/u/i)? ");
					char status = input.next().charAt(0);
					input.nextLine();
					
					System.out.print("Name: ");
					String name = input.nextLine();
					System.out.print("Price: ");
					double price = input.nextDouble();
					
						if (status == 'c') {
							listProduct.add(new Product(name, price));
							
						} else if (status == 'u') {
							SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
							System.out.print("Manufacture date (DD/MM/YYYY): ");
							String date = input.next();
							
							listProduct.add(new UsedProduct(name, price, sdf.parse(date)));
							
						} else {
							System.out.print("Customs fee: ");
							double customsFee = input.nextDouble();
							
							listProduct.add(new ImportedProduct(name, price, customsFee));
							
						}
				}
				
			System.out.println();
			System.out.println("PRICE TAGS:");
			
				for (Product newProduct : listProduct) {
					System.out.println(newProduct.priceTag());
				}
		
		input.close();

	}

}
