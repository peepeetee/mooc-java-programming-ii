
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Container container1 = new Container();
        Container container2 = new Container();

        while (true) {
            System.out.println("First: " + container1);
            System.out.println("Second: " + container2);

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");

            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            if (command.equals("add")) {
                container1.add(amount);
            } else if (command.equals("remove")) {
                container2.remove(amount);
            } else if (command.equals("move")) {
                if (amount < 0) {
                    ;
                } else {
                    int move_amount;
                    int temp = container1.contains() - amount;
                    if (temp < 0) {
                        move_amount = container1.contains();
                    } else {
                        move_amount = amount;
                    }

                    container1.remove(move_amount);

                    container2.add(move_amount);


                }

            }

        }
    }

}
