package adicionarRemoverProduto.entities;

public class Product {

    private final String PRICE_FORMAT = "$ %.2f";

    private String name;
    private double price;
    private int quantity;

    public Product() {

    }

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public double totalValueInStock() {
        return quantity * price;
    }

    public void addProducts(int quantity) {
        this.quantity += quantity;
    }

    public void removeProducts(int quantity) {
        if (quantity <= 0) {
            throw new IllegalArgumentException("A quantidade a ser removida deve ser maior que zero.");
        }

        if (this.quantity < quantity) {
            throw new IllegalArgumentException("A quantidade a ser removida é maior do que a disponível em estoque.");
        }

        this.quantity -= quantity;

    }

    @Override
    public String toString() {
        return name + String.format(", " + PRICE_FORMAT, price)
                + String.format(", %d units", quantity)
                + String.format(", Total: " + PRICE_FORMAT, totalValueInStock());
    }

}
