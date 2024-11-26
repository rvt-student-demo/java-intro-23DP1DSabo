package lv.rvt;

public class Product {

    private String Name;
    private double Price;
    private int Quantity;

    public Product (String initialName, double initialPrice, int initialQuantity) {
        this.Name = initialName;
        this.Price = initialPrice;
        this.Quantity = initialQuantity;

    }

    public Product (String initialName, String initialLocation) {
        this.Name = initialName;


    }

    public Product (String initialName, int initialWeight) {
        this.Name = initialName;


    }

    public void printProduct() {
        System.out.println(this.Name + ", price " + this.Price + ", " + this.Quantity + " pcs");
    }
}
