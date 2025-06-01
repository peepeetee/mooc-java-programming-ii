
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
public class Box implements Packable{

    private ArrayList<Packable> packables;
    private double weightLimit;

    public Box(double weightLimit) {
        this.weightLimit = weightLimit;
        this.packables = new ArrayList<>();
    }

    public void add(Packable packable) {
        if ((weight() + packable.weight()) < weightLimit) {
            packables.add(packable);
        }
    }

    public double weight() {
        double total = 0;
        for (Packable packable : packables) {
            total += packable.weight();
        }
        return total;
    }

    @Override
    public String toString() {
        return "Box: " + packables.size() +  " items, total weight " + this.weight() + " kg";
    }
    
    

}
