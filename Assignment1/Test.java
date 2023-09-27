import java.io.FileNotFoundException;

public class Test{

        public static void main(String[] args) throws FileNotFoundException {
      
        GroceryProductFactory bananaFactory = new BananaFactory();
        GroceryProduct banana = bananaFactory.createGroceryProduct();

       
        GroceryProductFactory appleFactory = new AppleFactory();
        GroceryProduct apple = appleFactory.createGroceryProduct();

        
        PriceValue.setPriceFromFile(banana, "c:\\Users\\mbaba\\OneDrive\\Documents\\Assignment1\\Grocery.txt");
        PriceValue.setPriceFromFile(apple, "c:\\Users\\mbaba\\OneDrive\\Documents\\Assignment1\\Grocery.txt");
        
  
        System.out.println("Product: " + banana.getName() + ", Price: $" + banana.getPrice());
        System.out.println("Product: " + apple.getName() + ", Price: $" + apple.getPrice());
    }
}
    



