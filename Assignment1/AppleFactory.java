public class AppleFactory implements GroceryProductFactory{
 
 public GroceryProduct createGroceryProduct() {


    Apple apple = new Apple();
    return apple;

    }
}

