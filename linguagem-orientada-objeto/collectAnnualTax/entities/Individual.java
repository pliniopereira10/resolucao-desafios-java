//	Created subclass Individual with an subscript method.

package collectAnnualTax.entities;

public final class Individual extends TaxPayer {
	
private Double healthExpenditures;
	
	public Individual() {
		super();
	}
	
	public Individual(String name, Double anuallIncome, Double healthExpenditures) {
		super(name, anuallIncome);
		this.healthExpenditures = healthExpenditures;
	}

	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void sethelthExpenditures(Double helthExpenditures) {
		this.healthExpenditures = helthExpenditures;
	}

	@Override
	public final double tax() {
		double tax = 0.0;
			
			if (healthExpenditures == 0.0) {
				
				if (anuallIncome < 20000.00) {
					tax = anuallIncome * 0.15;
					
				} else {
					tax = anuallIncome * 0.25;
				}
				
			} else {
				
				if (anuallIncome < 20000.00) {
					tax = (anuallIncome * 0.15) - (healthExpenditures * 0.50);
					
				} else {
					tax = (anuallIncome * 0.25) - (healthExpenditures * 0.50);
					
				}
			}
		
		return tax;
		
	}
	
}
