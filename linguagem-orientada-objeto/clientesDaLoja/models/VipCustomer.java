package clientesDaLoja.models;

public class VipCustomer extends SpecialCustomer {

	private Double extraCredit;

	public VipCustomer() {

	}

	public VipCustomer(String name, String email, Double credit, Double extraCredit) {
		super(name, email, credit);
		this.setExtraCredit(extraCredit);
	}

	public Double getExtraCredit() {
		return extraCredit;
	}

	public void setExtraCredit(Double extraCredit) {
		this.extraCredit = extraCredit;
	}

	@Override
	public boolean purchase(double debit) {
		if (debit > super.getCredit() + this.extraCredit) {
			return false;
		} else {
			super.setCreditDecrease(debit);
			return true;
		}
	}

	@Override
	public String toString() {
		return "VipCustomer [name=" + super.getName() + ", email=" + super.getEmail()
				+ String.format(", credit= %.2f]", super.getCredit())
				+ String.format("[extraCredit= %.2f]", this.extraCredit);
	}

}
