package clientesDaLoja.repositories;

public interface Customer {

	public boolean purchase(double debit);

	public void payOff(double credit);

}
