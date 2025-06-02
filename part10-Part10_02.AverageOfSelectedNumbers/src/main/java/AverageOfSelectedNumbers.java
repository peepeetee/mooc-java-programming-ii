
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write your program here

        List<String> list = new ArrayList<>();

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
//            int value = Integer.valueOf(input);
            list.add(input);

        }

        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String answer = scanner.nextLine();

        if (answer.equals("n")) {
            System.out.println("Average of the negative numbers: " + list.stream().mapToInt(s -> Integer.valueOf(s)).filter(number -> number < 0).average().getAsDouble());
        } else if (answer.equals("p")) {
            System.out.println("Average of the positive numbers: " + list.stream().mapToInt(s -> Integer.valueOf(s)).filter(number -> number > 0).average().getAsDouble());
        }

    }
}
