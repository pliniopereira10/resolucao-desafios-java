//	Creation of the class responsible for identifying imported products and its rate

package umlPriceProduct.entities;

public final class ImportedProduct extends Product {
	
	private Double customsFee;
	
	public ImportedProduct() {
		super();
	}

	public ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	public Double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}
	
	public final Double totalPrice() {
		return customsFee + price;
	}
	
	@Override
	public final String priceTag() {
		return name + " $ " + totalPrice() + "(Customs fee: $ " + String.format("%.2f)", customsFee);
	}
	
}
