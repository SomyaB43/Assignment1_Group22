public class BananaFactory implements GroceryProductFactory {

 public GroceryProduct createGroceryProduct() {

  Banana banana = new Banana();
  return banana;
  
 }
}


