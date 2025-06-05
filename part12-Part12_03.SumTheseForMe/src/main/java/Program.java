
import static java.lang.Integer.max;
import static java.lang.Integer.min;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // test your method here

    }
    
    public static int sum(int[] array, int fromWhere, int toWhere, int smallest, int largest){
        int lower = max(fromWhere, 0);
        int upper = min(array.length -1, toWhere);
        
        int sum = 0;
        for (int i = lower; i <= upper; i++) {
            
            if(array[i] <= largest && array[i] >= smallest){
                sum += array[i];
            }
            
        }
        return sum;
        
    }

}
