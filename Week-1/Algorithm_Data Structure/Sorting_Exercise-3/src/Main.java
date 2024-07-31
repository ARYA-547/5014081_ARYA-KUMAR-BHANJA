
import com.example.orders.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Order[] orders = {
                new Order("1", "Arya", 250.75),
                new Order("2", "Mahi", 100.50),
                new Order("3", "Harsh", 320.40),
                new Order("4", "Rahul", 150.30),
                new Order("5", "Anu", 210.20)
        };

        BubbleSort bubbleSort = new BubbleSort();
        QuickSort quickSort = new QuickSort();

        // Test Bubble Sort
        Order[] bubbleSortedOrders = Arrays.copyOf(orders, orders.length);
        bubbleSort.bubbleSort(bubbleSortedOrders);
        System.out.println("Bubble Sorted Orders: " + Arrays.toString(bubbleSortedOrders));

        // Test Quick Sort
        Order[] quickSortedOrders = Arrays.copyOf(orders, orders.length);
        quickSort.quickSort(quickSortedOrders, 0, quickSortedOrders.length - 1);
        System.out.println("Quick Sorted Orders: " + Arrays.toString(quickSortedOrders));
    }
}
