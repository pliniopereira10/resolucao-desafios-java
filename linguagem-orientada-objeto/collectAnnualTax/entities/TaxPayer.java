//	Created generic class TaxPayer with an abstract method.	

package collectAnnualTax.entities;

public abstract class TaxPayer {
	
	private String name;
	protected Double anuallIncome;
	
	public TaxPayer() {
		
	}
	
	public TaxPayer(String name, Double anuallIncome) {
		this.name = name;
		this.anuallIncome = anuallIncome;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAnuallIncome() {
		return anuallIncome;
	}

	public void setAnuallIncome(Double anuallIncome) {
		this.anuallIncome = anuallIncome;
	}

	public abstract double tax();
	
}
