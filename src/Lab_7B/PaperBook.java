package Lab_7B;

public class PaperBook extends Book{
    private double shippingWeight;
    private boolean inStock;

    public PaperBook(){
        this.shippingWeight = 0.0;
        this.inStock = false;
    }
    public PaperBook(int isbn, String title, String author, double price, double shippingWeight, boolean inStock){
        super(isbn, title, author, price);
        this.shippingWeight = shippingWeight;
        this.inStock = inStock;
    }

    public void setShippingWeight(double shippingWeight) {
        this.shippingWeight = shippingWeight;
    }
    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }

    public double getShippingWeight() {
        return shippingWeight;
    }
    public boolean getInStock() {
        return inStock;
    }

    @Override
    public String toString() {
        return super.toString() + "\nShipping Weight: " + this.shippingWeight + "Kg\nIn Stock: " + this.inStock;
    }
}
