import com.example.inventory.Inventory;
import com.example.inventory.Product;

public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        // Add products
        Product product1 = new Product("1", "Laptop", 10, 999.99);
        Product product2 = new Product("2", "Smartphone", 50, 499.99);
        inventory.addProduct(product1);
        inventory.addProduct(product2);

        // Update product
        product1.setPrice(949.99);
        inventory.updateProduct(product1);

        // Get product
        Product retrievedProduct = inventory.getProduct("1");
        System.out.println("Retrieved Product: " + retrievedProduct.getProductName() + ", Price: " + retrievedProduct.getPrice());

        // Delete product
        inventory.deleteProduct("2");

        // Attempt to get deleted product
        Product deletedProduct = inventory.getProduct("2");
        if (deletedProduct == null) {
            System.out.println("Product with ID 2 has been deleted");
        }
    }
}