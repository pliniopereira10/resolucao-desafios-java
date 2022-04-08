package aberturaContaSaqueDeposito.entities;

import java.io.Serializable;

public class ContaBancaria implements Serializable {

	private static final long serialVersionUID = 1L;

	// Atributos
	private int numeroDaConta;
	private String nomeDoTitular;
	private double saldoDaConta;
	private static final double TAXA = 5.00;

	// Construtores
	public ContaBancaria() {

	}

	public ContaBancaria(int numeroDaConta, String nomeDoTitular) {
		this.numeroDaConta = numeroDaConta;
		this.nomeDoTitular = nomeDoTitular;

	}

	public ContaBancaria(int numeroDaconta, String nomeDoTitular, double valorDeposito) {
		this.numeroDaConta = numeroDaconta;
		this.nomeDoTitular = nomeDoTitular;
		deposito(valorDeposito); // de acordo com regra de negócio ideal e chamar método deposito()

	}

	// Métodos getter e setters
	public int getNumeroDaConta() {
		return numeroDaConta;

	}

	public String getNomeDoTitular() {
		return nomeDoTitular;

	}

	public void setNomeDoTitular(String nomeDoTitular) {
		this.nomeDoTitular = nomeDoTitular;

	}

	public double getSaldoDaConta() {
		return saldoDaConta;

	}

	// Método para depósito
	public void deposito(double valorDeposito) {
		this.saldoDaConta += valorDeposito;

	}

	// Método para saque
	public void saque(double valorSaque) {
		this.saldoDaConta -= valorSaque + TAXA; // primeiro soma valorSaque + taxa e depois abate
	}

	// Return String no formato definido
	public String toString() {
		return String.format("Account %d, ", numeroDaConta) 
				+ String.format("Holder: %s, ", nomeDoTitular)
				+ String.format("Balance: $ %.2f", saldoDaConta);

	}

}