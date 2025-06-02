
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> inputs = new ArrayList<>();

// reading inputs
        while (true) {
            String row = scanner.nextLine();
            if (Integer.valueOf(row) < 0) {
                break;
            }

            inputs.add(row);
        }

        inputs.stream().map(string -> Integer.valueOf(string)).filter(thing -> 1 <= thing && 5 >= thing).forEach(thing -> System.out.println(thing));
        

    }
}
