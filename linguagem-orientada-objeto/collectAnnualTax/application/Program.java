// Class responsible for the execution of program.

package collectAnnualTax.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import collectAnnualTax.entities.Company;
import collectAnnualTax.entities.Individual;
import collectAnnualTax.entities.TaxPayer;

public class Program {

	public static void main(String[] args) {
		
		int quantity;
		double sum;
		
		List<TaxPayer> listTaxPayer = new ArrayList<>();
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
			
			System.out.print("Enter the number of tax payers: ");
			quantity = input.nextInt();
			
				for (int i = 1; i <= quantity; i++) {
					System.out.println("Tax payer #" + i + " data: ");
					System.out.print("Individual or company (i/c)? ");
					char individualOrCompany = input.next().charAt(0);
					input.nextLine();
					
					System.out.print("Name: ");
					String name = input.nextLine();
					System.out.print("Anual income: ");
					double anualIncome = input.nextDouble();
					
						if (individualOrCompany == 'i') {
							System.out.print("Health expenditues: ");
							double healthExpenditures = input.nextDouble();
							
							listTaxPayer.add(new Individual(name, anualIncome, healthExpenditures));
							
						}
						
						if (individualOrCompany == 'c') {
							System.out.print("Number of employees: ");
							int numberOfEmployees = input.nextInt();
							
							listTaxPayer.add(new Company(name, anualIncome, numberOfEmployees));
							
						}
						
				}
				
			System.out.println();
			System.out.println("TAXES PAID:");
			
				for (TaxPayer taxPayer : listTaxPayer) {
					System.out.print(taxPayer.getName() + ": ");
					System.out.printf("$ %.2f%n", taxPayer.tax());
					
				}
			
			sum = 0.0;
				
				for (TaxPayer taxPayer : listTaxPayer) {
					sum += taxPayer.tax();
					
				}
				
			System.out.println();
			System.out.printf("TOTAL TAXES: $ %.2f%n", sum);
			
		input.close();

	}

}
