
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class LiteracyComparison {
    
    public static void main(String[] args) {
        try {
            Files.lines(Paths.get("literacy.csv")).sorted((first,second) -> {
            return first.split(",")[5].compareTo(second.split(",")[5]);
            }).forEach(thing -> 
                    System.out.println(thing.split(",")[3] + " (" + thing.split(",")[4] + ")," + thing.split(",")[2].replace(" (%)", "") + ", " + thing.split(",")[5])
            );
        } catch (Exception e) {
        }
    }
}
