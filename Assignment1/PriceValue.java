import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class PriceValue{
    
    public static void setPriceFromFile(GroceryProduct product, String fileName) throws FileNotFoundException {
        String productName = product.getName();
        Scanner scanner = new Scanner(new File(fileName));
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] parts = line.split(",");
            if (parts.length == 2 && parts[0].trim().equalsIgnoreCase(productName)) {
                double price = Double.parseDouble(parts[1].trim());
                product.setPrice(price);
                break; 
            }
        }
        scanner.close();
    }
}