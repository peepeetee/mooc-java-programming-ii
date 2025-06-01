
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author peepeetee
 */
public class Warehouse {

    private Map<String, Integer> prices;
    private Map<String, Integer> stocks;

    public Warehouse() {
        prices = new HashMap<>();
        stocks = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {
        prices.put(product, price);
        stocks.put(product, stock);
    }

    public int price(String product) {
        return prices.getOrDefault(product, -99);
    }

    public int stock(String product) {
        return stocks.getOrDefault(product, 0);
    }

    public boolean take(String product) {
        if (stocks.getOrDefault(product, 0) > 0) {
            stocks.put(product, stocks.getOrDefault(product, 0) - 1);
            if (stocks.getOrDefault(product, 0) > 0) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;

        }
    }
    
    public Set<String> products(){
        return stocks.keySet();
    }
    

}
