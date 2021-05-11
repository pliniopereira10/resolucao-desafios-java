// Programa calcula valor da energia em reais
// CalculoValorEnergia.java

package fundamentos;

import java.util.Scanner; // ptograma utiliza Scanner

public class CalculoValorEnergia {

	public static void main(String[] args) {

		/*
		 * Sabendo-se que 100 quilowatts de energia custa um sétimo do salário mínimo,
		 * fazer um algoritmo que receba o valor do salário mínimo e a quantidade de quilowatts
		 * gasta por uma residência.
		 */
		
		// Cria Scanner
		// Prompt captura de dados 
		Scanner teclado = new Scanner(System.in);

		// Variáveis
		double valorSalarioMinimo;		// recebe o valor do salário mínimo          
		double valorDoConsumo;			// recebe valor da energia consumida
		double valorConsumoComDesconto;	// recebe valor energia consumida com desconto de 10%
		double valorCemKilowatt;		// recebe valor da energia para 100 kW
		double valorCadaKilowatt;		// recebe valor da energia para cada kW
		double energiaConsumida;		// recebe quantidade de energia consumida
		
		// Solicita valor do salário mínimo
		System.out.print("Informe o valor do salário mínimo:R$ ");
		valorSalarioMinimo = teclado.nextDouble();                // lê valor digitado
		
		// Solicita a quantidade de energia consumida
		System.out.println("Informe quantidade de energia consumida:kW ");
		energiaConsumida = teclado.nextDouble();				 // lê quantidade de energia digitada
		
		// Operação para calcular o valor da energia para 100kW
		valorCemKilowatt = valorSalarioMinimo * 1 / 7;
		// Operação para calcular o valor de cada kW
		valorCadaKilowatt = valorCemKilowatt / 100;	
		// Exibe o valor para cada kW
		System.out.printf("Valor em reais de cada kilowatts:R$ %.2f%n", valorCadaKilowatt); 
		
		// Operação para calcular valor total consumido
		valorDoConsumo = valorCadaKilowatt * energiaConsumida;
		// Exibe o valor consumido
		System.out.printf("Valor em reais a ser pago:R$ %.2f%n", valorDoConsumo); 
		
		// Operação para calcular valor do consumo com desconto 10%
		valorConsumoComDesconto = valorDoConsumo * (1 - 10F / 100);
		//Exibe o valor com desconto
		System.out.printf("Valor com 10%% de desconto:R$ %.2f", valorConsumoComDesconto);
		
		/*
		 * Na linha 51 foi necessário informar que o numeral 10 não era um inteiro, pois se não
		 * informasse, o resultado da divisão seria 0(inteiro divido por inteiro à resposta é outro
		 * número inteiro). Pela regra de precedência primeira operação era entre parêntese. 
		 * Na linha 53 para que o printf imprima o sinal de percentual é necessário dois percente (%%).
		 */
	
		teclado.close(); // fim classe Scanner
	
	} // fim do método main

} // fim da classe CalculoValorEnergia
