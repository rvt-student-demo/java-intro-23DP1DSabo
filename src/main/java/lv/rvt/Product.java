package lv.rvt;

public class Product {

    private String Name;
    private double Price;
    private int Quantity;
    private String Location;
    private int Weight;

    public Product (String initialName, double initialPrice, int initialQuantity) {
        this.Name = initialName;
        this.Price = initialPrice;
        this.Quantity = initialQuantity;

    }

    public Product (String initialName, String initialLocation) {
        this.Name = initialName;
        this.Location = initialLocation;

    }

    public Product (String initialName, int initialWeight) {
        this.Name = initialName;
        this.Weight = initialWeight;

    }

    public void printProduct() {
        System.out.println(this.Name + ", price " + this.Price + ", " + this.Quantity + " pcs");
    }
}
