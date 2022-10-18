package clientesDaLoja.models;

public class SpecialCustomer extends Customer {
	
	private Double credit;
	
	public SpecialCustomer() {
		
	}
	
	public SpecialCustomer(String name, String email, Double credit) {
		super(name, email);
		this.credit = credit;
	}

	public Double getCredit() {
		return credit;
	}

	public void setCreditIncrease(double valor) {
		this.credit += valor;
	}

	public void setCreditDecrease(double valor) {
		this.credit -= valor;
	}

	@Override
	public Boolean purchase(double valor) {
		if (this.credit < valor) {
			return false;
		} else {
			setCreditDecrease(valor);
			return true;
		}
	}

	@Override
	public void payOff(double valor) {
		setCreditIncrease(valor);
	}

	@Override
	public void message() {
		System.out.println("Cliente Especial: " + toString());
	}

	@Override
	public String toString() {
		return super.toString() + String.format("[Credito = %.2f]",credit);
	}
	
	
}
