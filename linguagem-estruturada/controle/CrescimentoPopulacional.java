/*	Dadas as informações de população e a taxa de crescimento de duas cidades quaisquer(A e B),
 *	programa calcula quantos anos levará para que a cidade menor(sempre é a cidade A)ultrapasse
 *	a cidade B em população.**Arquivo:CrescimentoPopulacional.java
 */

package controle;

import java.util.Locale; //	programa utiliza a classe Locale;
import java.util.Scanner; //	programa utiliza a classe Scanner;

public class CrescimentoPopulacional {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US); // utiliza o separador de casas decimais ponto.

		// Cria Scanner.
		// Prompt de captura de dados.
		Scanner input = new Scanner(System.in);

		// Variáveis.
		int quantDeTestes; // recebe quantidade de testes 1 ≤ qtdDeTestes ≤ 3000
		int populacaoDeA, populacaoDeB; // recebe quant. da pop. da cid. A e cid. B, sendo que a pop. de B sempre maior
										// que a de A.
		double taxaCrescA, taxaCrescB; // recebe a taxa de crescimento de cada cidade.
		int quantDeAnos; // recebe a quantidade de anos que será necessário para cidade A ultrapassar
							// cid. B.

		System.out.print("Quantos testes serão feitos? ");
		quantDeTestes = input.nextInt();

		System.out.println("Digite os testes:");
		// 1º Loop para inserção de dados baseado quantidade de testes solicitado
		for (int contadorUm = 0; contadorUm < quantDeTestes; contadorUm++) {

			populacaoDeA = input.nextInt(); // a entrada é somente de cid. cuja população é menor que B.
			populacaoDeB = input.nextInt();
			taxaCrescA = input.nextDouble();
			taxaCrescB = input.nextDouble();

			quantDeAnos = 0;
			/*
			 * 2º Loop para cálculo do tempo que pop. de A excederá pop. de B, não sendo
			 * necessário continuar o loop quando quant de anos for maior que 100.
			 */
			while (populacaoDeA <= populacaoDeB && quantDeAnos <= 100) {

				populacaoDeA += populacaoDeA * taxaCrescA / 100;
				populacaoDeB += populacaoDeB * taxaCrescB / 100;
				quantDeAnos++;

			} // fim do 2º loop de cálculo

			// Ramificação para saída da quantidade de anos
			if (quantDeAnos > 100) {
				System.out.println("Mais de 1 seculo.");

			} else {
				System.out.println(quantDeAnos + " anos.");

			} // fim da condição

		} // fim do 1º loop para inserção dos testes

		input.close(); // fim da classe Scanner

	} // fim do método principal

} // fim da classe