

import com.example.ecommerce.*;

public class Main {
    public static void main(String[] args) {
        Product[] products = {
                new Product("1", "Laptop", "Electronics"),
                new Product("2", "Smartphone", "Electronics"),
                new Product("3", "Tablet", "Electronics"),
                new Product("4", "Monitor", "Electronics"),
                new Product("5", "Keyboard", "Accessories")
        };

        LinearSearch linearSearch = new LinearSearch();
        BinarySearch binarySearch = new BinarySearch();

        // Test Linear Search
        Product foundProduct = linearSearch.linearSearch(products, "3");
        if (foundProduct != null) {
            System.out.println("Linear Search: Found " + foundProduct.getProductName());
        } else {
            System.out.println("Linear Search: Product not found");
        }

        // Test Binary Search
        foundProduct = binarySearch.binarySearch(products, "3");
        if (foundProduct != null) {
            System.out.println("Binary Search: Found " + foundProduct.getProductName());
        } else {
            System.out.println("Binary Search: Product not found");
        }
    }
}
