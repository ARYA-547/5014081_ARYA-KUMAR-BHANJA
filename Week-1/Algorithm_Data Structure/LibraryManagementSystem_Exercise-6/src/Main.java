

import com.example.library.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
                new Book(1, "The Great Gatsby", "F. Scott Fitzgerald"),
                new Book(2, "To Kill a Mockingbird", "Harper Lee"),
                new Book(3, "1984", "George Orwell"),
                new Book(4, "Pride and Prejudice", "Jane Austen"),
                new Book(5, "The Catcher in the Rye", "J.D. Salinger")
        );

        // Assume books list is sorted by title for binary search
        Collections.sort(books, Comparator.comparing(Book::getTitle));

        Library library = new Library(books);

        System.out.println("Linear Search:");
        Book linearSearchResult = library.linearSearchByTitle("1984");
        System.out.println(linearSearchResult);

        System.out.println("\nBinary Search:");
        Book binarySearchResult = library.binarySearchByTitle("1984");
        System.out.println(binarySearchResult);
    }
}
