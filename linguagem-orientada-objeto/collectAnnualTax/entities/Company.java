//	Created subclass Company with an subscript method.	

package collectAnnualTax.entities;

public final class Company extends TaxPayer {

private Integer numberOfEmployees;
	
	public Company() {
		super();
	}
	
	public Company(String name, Double anuallIncome, Integer numberOfEmployees) {
		super(name, anuallIncome);
		this.numberOfEmployees = numberOfEmployees;
	}
	
	public Integer getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(Integer numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	@Override
	public final double tax() {
		double tax = 0.0;
		
			if (numberOfEmployees <= 10 ) {
				tax = anuallIncome * 0.16;
				
			} else {
				tax = anuallIncome * 0.14;
				
			}
			
		return tax;
		
	}
	
}
