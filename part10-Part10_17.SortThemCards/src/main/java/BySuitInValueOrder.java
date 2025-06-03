
import java.util.Comparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author peepeetee
 */
public class BySuitInValueOrder implements Comparator<Card>{

    @Override
    public int compare(Card o1, Card o2) {
        int result = o1.getSuit().ordinal() - o2.getSuit().ordinal();
        if (result != 0){
            return result;
        } else {
            return o1.getValue() - o2.getValue();
        }
    }
    
}
