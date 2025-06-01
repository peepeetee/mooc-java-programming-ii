
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
public class BoxWithMaxWeight extends Box{
    private int capacity;
    
    private ArrayList<Item> arrayList;
    
    public BoxWithMaxWeight(int capacity){
        this.capacity = capacity;
        arrayList = new ArrayList<>();
    }
    
    public void add(Item item){
        int total = 0;
        for (Item thing : arrayList) {
            total += thing.getWeight();
        }
        if (total + item.getWeight() <= capacity){
            arrayList.add(item);
        }
        
    }
    public boolean isInBox(Item item){
        return arrayList.contains(item);
    }
    
}
