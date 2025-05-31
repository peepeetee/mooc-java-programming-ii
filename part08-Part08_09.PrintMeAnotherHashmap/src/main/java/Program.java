
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Program {

    public static void main(String[] args) {
        // Test your program here!
    }

    public static void printValues(HashMap<String, Book> hashmap) {
        Collection<Book> set = hashmap.values();
        for (Book book : set) {
            System.out.println(book);
        }

    }

    public static void printValueIfNameContains(HashMap<String, Book> hashmap, String text) {
        Collection<Book> set = hashmap.values();
        for (Book book : set) {
            if(book.getName().contains(text)){
                System.out.println(book);
        }

    }
}

}
