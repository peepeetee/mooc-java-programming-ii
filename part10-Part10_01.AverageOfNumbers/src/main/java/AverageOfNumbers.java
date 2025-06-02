
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write your program here
        
        ArrayList<Integer> list = new ArrayList<>();
        
        while (true) {            
            String input = scanner.nextLine();
            if (input.equals("end")){
                break;
            }
            int value = Integer.valueOf(input);
            list.add(value);
            
        }
        
        double average = list.stream().mapToInt(s -> Integer.valueOf(s)).average().getAsDouble();
        
        System.out.println("average of the numbers: " + average);
        

    }
}
