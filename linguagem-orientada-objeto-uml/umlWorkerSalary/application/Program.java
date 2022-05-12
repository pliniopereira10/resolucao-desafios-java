// Class responsible for the execution of program

package umlWorkerSalary.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import umlWorkerSalary.entities.Department;
import umlWorkerSalary.entities.HourContract;
import umlWorkerSalary.entities.Worker;
import umlWorkerSalary.entities.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		String departamentName;
		String workerName;
		String workerLevel;
		String monthYear;
		double workerBaseSalary;
		int quantityContracts;
		int month;
		int year;
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

			System.out.print("Enter department's name: ");
			departamentName = input.nextLine();
			System.out.println("Enter worker data:");
			System.out.print("Name: ");
			workerName = input.nextLine();
			System.out.print("Level: ");
			workerLevel = input.nextLine().toUpperCase();
			System.out.print("Base salary: ");
			workerBaseSalary = input.nextDouble();
			Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), workerBaseSalary,
					new Department(departamentName));
			
			System.out.print("How many contract to this worker? ");
			quantityContracts = input.nextInt();
				for (int i = 1; i <= quantityContracts; i++) {
					
					System.out.print("Enter contract #" + i + " data:");
					System.out.print("Date (DD/MM/YYYY): ");
					Date date = sdf.parse(input.next());
					System.out.print("Value per hour: ");
					double valuePerHour = input.nextDouble();
					System.out.print("Duration (hours): ");
					int duration = input.nextInt();
					worker.addContract(new HourContract(date, valuePerHour, duration));
					
				}
			
			System.out.print("Enter month and year to calculate income (MM/YYYY): ");
			monthYear = input.next();
			month = Integer.parseInt(monthYear.substring(0, 2));
			year = Integer.parseInt(monthYear.substring(3));
			System.out.println("Name: " + worker.getName());
			System.out.println("Department: " + worker.getDepartment().getName());
			System.out.println("Income for " + monthYear + String.format(": %.2f", worker.income(year, month)));

		input.close();

	}

}
