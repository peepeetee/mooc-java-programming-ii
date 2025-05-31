
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author peepeetee
 */
public class UserInterface {
    private Scanner scanner;
    private TodoList todolist;

    public UserInterface(TodoList todolist, Scanner scanner) {
        this.scanner = scanner;
        this.todolist = todolist;
    }
    
    public void start(){
        while (true) {
            System.out.println("Command:");
            String input = scanner.nextLine();
            if (input.equals("stop")) {
                break;
            } else if (input.equals("add")) {
                System.out.println("To add:");
                String task = scanner.nextLine();
                todolist.add(task);
            } else if (input.equals("list")){
                todolist.print();
            }else if(input.equals("remove")){
                System.out.println("Which one is removed?");
                int removed = Integer.valueOf(scanner.nextLine());
                todolist.remove(removed);
            }
        }
    }
    
}
