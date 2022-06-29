/*
 * Developer: plinio.pereira10@gmail.com
 * Classname: SomandoCompras
 * Version: 1.0.0
 *
 * Programa tem objetivo de receber valores de produtos de uma compra e exibir o total.
 */

package controle;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class CarrinhoCompras {

	public static void main(String[] args) {

		Integer numeroItem;
		Integer quantidadeItensRemovidos;
		Double valorProduto;
		Double valorTotalDasCompras;
		Character opcaoDoMenu;

		List<Double> carrinhoCompras = new ArrayList<>();

		System.out.printf("%20s%n", "Menu");
		System.out.printf("%10s%n", "Digite:");
		System.out.printf("%34s%n", "1 - Iniciar inserção de valores");
		System.out.printf("%35s%n", "2 - Encerrar inserção de valores");
		System.out.printf("%42s%n%n", "3 - Remover protudo pelo número do item");

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		System.out.printf("%20s", "Informe a opção: ");
		opcaoDoMenu = input.next().charAt(0);

		numeroItem = 0;
		quantidadeItensRemovidos = 0;
		while (opcaoDoMenu.equals('1')) {
			numeroItem++;
			System.out.printf("Item %d ", numeroItem);
			valorProduto = input.nextDouble();
			carrinhoCompras.add(valorProduto);

			System.out.print("Continuar, encerrar ou remmover (1/2/3) ");
			opcaoDoMenu = input.next().charAt(0);

			if (opcaoDoMenu.equals('3')) {
				System.out.print("Qual item remover: ");
				int numeroItemRemover = input.nextInt();
				quantidadeItensRemovidos++;
				int posicaoItemRemover = numeroItemRemover - quantidadeItensRemovidos;
				carrinhoCompras.remove(posicaoItemRemover);

				System.out.print("Continuar, encerrar ou remover (1/2/3) ");
				opcaoDoMenu = input.next().charAt(0);
			}

		}

		valorTotalDasCompras = 0.0;
		for (Double valor : carrinhoCompras) {
			valorTotalDasCompras += valor;

		}

		numeroItem = carrinhoCompras.size();
		System.out.printf("Total de itens: %d %n", numeroItem);
		System.out.printf("Total das compras: R$ %.2f%n", valorTotalDasCompras);

		input.close();

	}

}
