
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author peepeetee
 */
public class Herd implements Movable {

    private ArrayList<Movable> members;

    public Herd() {
        members = new ArrayList<>();
    }

    public String toString() {
        String returnValue = "";
        for (Movable member : members) {
            returnValue += (member + "\n");
        }
        return returnValue;
    }

    public void addToHerd(Movable movable) {
        members.add(movable);
    }

    @Override
    public void move(int dx, int dy) {
        for (Movable member : members) {
            member.move(dx, dy);
        }
    }

}
