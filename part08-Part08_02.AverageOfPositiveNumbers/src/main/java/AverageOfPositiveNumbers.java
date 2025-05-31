
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        while (true) {
            String input = scanner.nextLine();

            if (input.equals("0")) {
                break;
            } else {
                int number = Integer.valueOf(input);
                if (number > 0) {
                    sum += number;
                    count += 1;
                }

            }
        }
        if (count == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println(((double) sum / count));
        }
    }
}
