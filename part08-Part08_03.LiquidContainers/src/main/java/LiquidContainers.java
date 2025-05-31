
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int container1 = 0;
        int container2 = 0;

        while (true) {
            System.out.println("First: " + container1 + "/100");
            System.out.println("Second: " + container2 + "/100");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");

            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            if (command.equals("add")) {
                int add = amount;
                if (add < 0) {
                    container1 = container1;
                } else {
                    int result = container1 + add;
                    if (result > 100) {
                        container1 = 100;
                    } else {
                        container1 = result;

                    }
                }
            } else if (command.equals("remove")) {
                int remove = amount;
                if (remove < 0) {
                    container2 = container2;
                } else {
                    int result = container2 - remove;
                    if (result < 0) {
                        container2 = 0;
                    } else {
                        container2 = result;

                    }
                }
            } else if (command.equals("move")) {
                if (amount < 0) {
                    container1 = container1;
                    container2 = container2;
                } else {
                    int move_amount;
                    int temp = container1 - amount;
                    if (temp < 0) {
                        move_amount = container1;
                    } else {
                        move_amount = amount;
                    }

                    container1 -= move_amount;

                    container2 += move_amount;

                    if (container2 > 100) {
                        container2 = 100;
                    }
                }

            }

        }
    }

}
