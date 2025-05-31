
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author peepeetee
 */
public class StorageFacility {

    HashMap<String, ArrayList<String>> hashmap;

    public StorageFacility() {
        hashmap = new HashMap<>();
    }

    public void add(String unit, String item) {
        hashmap.putIfAbsent(unit, new ArrayList<>());
        hashmap.get(unit).add(item);
    }

    public ArrayList<String> contents(String storageUnit) {
        return hashmap.getOrDefault(storageUnit, new ArrayList<>());
    }

    public void remove(String storageUnit, String item) {
        ArrayList<String> list = hashmap.get(storageUnit);
        if (list == null) {
            return;
        } else {
            boolean removed = false;
            String removal = "";
            for (String string : list) {
                if (string.equals(item) && removed == false) {
                    removed = true;
                    removal = string;
                }
            }
            list.remove(removal);
        }
        if (list.isEmpty()) {
            hashmap.remove(storageUnit);
        }
    }

    public ArrayList<String> storageUnits() {
        ArrayList<String> list = new ArrayList<>();
        for (String string : hashmap.keySet()) {
            if (!hashmap.get(string).isEmpty()) {
                list.add(string);
            }
        }
        return list;
    }

}
