/*
 *	Creation of the class Worker with its attributes and methods in order to identify the employee
 *	 and calculate the value of all contracts worked  
 */

package umlWorkerSalary.entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import umlWorkerSalary.entities.enums.WorkerLevel;

public class Worker {

	private String name;
	private WorkerLevel level;
	private Double baseSalary;
	
	// Adding associations
	private Department department;
	private List<HourContract> contracts = new ArrayList<>();
	
	public Worker() {
		
	}
	
	// Do not add attributes that are lists to the constructor.
	public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public List<HourContract> getContracts() {
		return contracts;
	}

	public void addContract(HourContract contract) {
		contracts.add(contract);
	}
	
	public void removeContract(HourContract contract) {
		contracts.remove(contract);
	}
	
	public double income(int year, int month) {
		
		double sum = baseSalary;	
		Calendar calendar = Calendar.getInstance();	//	variable calendar receives calendar
		for (HourContract hourContract : contracts) {	//	scan the list
			
			calendar.setTime(hourContract.getDate());	//	set in calendar variable the list date
			int calYear = calendar.get(Calendar.YEAR);	//	get the year from the calendar
			int calMonth = 1 + calendar.get(Calendar.MONTH);	//	adds 1 because the month in the calendar starts at zero(0)
			if (year == calYear && month == calMonth) {
				sum += hourContract.totalValue();
				
			}
			
		}
		return sum;
		
	}
	
}
