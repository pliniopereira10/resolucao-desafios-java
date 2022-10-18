package clientesDaLoja.models;

public abstract class Customer {

	protected String name;
	protected String email;

	public Customer() {

	}

	public Customer(String name, String email) {
		this.name = name;
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public abstract Boolean purchase(double valor);

	public abstract void payOff(double valor);

	public abstract void message();

	@Override
	public String toString() {
		return String.format("[Nome = %s, Email = %s]", name, email);
	}

}
