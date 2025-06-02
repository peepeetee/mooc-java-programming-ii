
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        List<Book> books = new ArrayList<>();

        while (true) {
            System.out.println("Input the name of the book, empty stops: ");
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            int ageRecommendation = Integer.valueOf(scanner.nextLine());
            
            books.add(new Book(input, ageRecommendation));
        }
        System.out.println(books.size() + " books in total.");
        
        System.out.println("Books:");
        
        Comparator<Book> comparator = Comparator.comparing(Book::getAgeRecommendation).thenComparing(Book::getName);
        
        Collections.sort(books, comparator);
        
        books.stream().forEach(thing -> System.out.println(thing));
        
    }

}
