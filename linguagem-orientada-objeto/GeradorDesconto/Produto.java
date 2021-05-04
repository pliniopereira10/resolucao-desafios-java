// Classe com alguns atributos e métodos para Produto
// Arquivo: Produto.java

package GeradorDesconto;

public class Produto {
	
	final static double DESCONTO = 0.25;  // recebe desconto fixo para produto
	double valor;                         // recebe valor do produto 
	
	// Método com parâmetro a fim de gerar desconto padrão
	static double desconto(double valorDoProduto) {
		double ProdutoComDesconto = valorDoProduto * (1 - DESCONTO);
		return ProdutoComDesconto;
	} // fim do método
	
	// Método com parâmetro a fim de gerar desconto adicional
	static double desconto(double valorDoProduto, double descontoEspecial) {
		double ProdutoComDesconto = valorDoProduto * (1 - (DESCONTO + descontoEspecial));
		return ProdutoComDesconto;
	} // fim do método

} // fim da classe Produto