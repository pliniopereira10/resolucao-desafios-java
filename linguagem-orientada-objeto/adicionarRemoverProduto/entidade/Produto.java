package adicionarRemoverProduto.entidade;

public class Produto {
	
	public String name;
	public double price;
	public int quantity;
	
	//	Método para retornar valor total de estoque
	public double TotalValueIntStock () {
		return price * quantity;
		
	}
	
	//	Método para adicionar produto
	public void AddProducts (int quantity) {
		this.quantity += quantity;	//	a palavra reservada this acessa o quantity da classe e não do argumento
		
	}
	
	//	Método para remover produto
	public void RemoveProducts (int quantity) {
		this.quantity -= quantity;
		
	}
	
	//	Método para formatar saída de dados
	public String toString() {
		return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units, Total: $ " 
			   + String.format("%.2f", TotalValueIntStock()); 
	}

}
