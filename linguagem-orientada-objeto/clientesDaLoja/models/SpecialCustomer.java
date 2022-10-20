package clientesDaLoja.models;

import clientesDaLoja.repositories.Customer;

public class SpecialCustomer implements Customer {

	private String name;
	private String email;
	private Double credit;

	public SpecialCustomer() {

	}

	public SpecialCustomer(String name, String email, Double credit) {
		this.name = name;
		this.email = email;
		this.credit = credit;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Double getCredit() {
		return credit;
	}

	public void setCreditIncrease(Double credit) {
		this.credit += credit;
	}

	public void setCreditDecrease(Double debit) {
		this.credit -= debit;
	}

	@Override
	public boolean purchase(double debit) {
		if (debit > this.credit) {
			return false;
		} else {
			setCreditDecrease(debit);
			return true;
		}
	}

	@Override
	public void payOff(double credit) {
		setCreditIncrease(credit);
	}

	@Override
	public String toString() {
		return "SpecialCustomer [name= " + name + ", email= " + email + ", " + String.format("credit= %.2f]", credit);
	}

}
