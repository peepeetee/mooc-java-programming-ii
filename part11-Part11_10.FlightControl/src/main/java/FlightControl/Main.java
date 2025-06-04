package FlightControl;

import flightControl.logic.FlightControl;
import flightControl.ui.TextUI;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        // Write the main program here. It is useful to create some classes of your own.
        
        TextUI textUI = new TextUI(new FlightControl(), new Scanner(System.in));
        textUI.start();
        
    }
}
