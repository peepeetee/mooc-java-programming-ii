
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author peepeetee
 */
public class ShoppingCart {

    private List<Item> items;

    public ShoppingCart() {
        items = new ArrayList<>();
    }

    public void add(String product, int price) {
        Item thing = new Item(product, 1, price);
        if (items.contains(thing)) {
            items.get(items.indexOf(thing)).increaseQuantity();
        } else {
            items.add(thing);
        }
    }

    public int price() {
        int sum = 0;
        for (Item item : items) {
            sum += item.price();
        }
        return sum;
    }

    public void print() {
        for (Item item : items) {
            System.out.println(item);
        }
    }

}
