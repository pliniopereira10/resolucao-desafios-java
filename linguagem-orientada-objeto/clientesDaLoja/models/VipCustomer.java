package clientesDaLoja.models;

public class VipCustomer extends SpecialCustomer {

	private Double extraCredit;

	public VipCustomer() {

	}

	public VipCustomer(String name, String email, Double credit, Double extraCredit) {
		super(name, email, credit);
		this.extraCredit = extraCredit;
	}

	public Double getExtraCredit() {
		return extraCredit;
	}

	public void setExtraCredit(Double extraCredit) {
		this.extraCredit = extraCredit;
	}

	@Override
	public Boolean purchase(double valor) {
		if (this.extraCredit + super.getCredit() < valor) {
			return false;
		} else {
			super.setCreditDecrease(valor);
			return true;
		}
	}

	@Override
	public void message() {
		System.out.println("Cliente Vip: " + toString());
	}

	@Override
	public String toString() {
		return super.toString() + String.format("[Credito Extra = %.2f]", extraCredit);
	}

}
