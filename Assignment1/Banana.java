public class Banana implements GroceryProduct {

    private String name;
    private double price;

      public Banana() {
        this.name = "Banana";
    }


    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }


    public void setPrice(double price) {
        this.price = price;
    }
}
