//	Creation of the class responsible for identifying new products and tax-free 

package umlPriceProduct.entities;

public class Product {
	
	protected String name;
	protected Double price;
	
	public Product() {
		
	}

	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	public String priceTag() {
		return name + " $ " + String.format("%.2f", price);
	}
	
}
