/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author peepeetee
 */
public class OneItemBox extends Box {

    private Item thing;

    public OneItemBox() {
        thing = null;
    }
    
    

    public void add(Item item) {
        if (thing == null){
            thing = item;
        }
    }

    public boolean isInBox(Item item) {
        return item.equals(thing);
    }
}
