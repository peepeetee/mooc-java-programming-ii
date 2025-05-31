
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
public class VehicleRegistry {

    private HashMap<LicensePlate, String> hashmap;

    public VehicleRegistry() {
        hashmap = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner) {
        if (hashmap.containsKey(licensePlate)) {
            return false;
        } else {
            hashmap.put(licensePlate, owner);
            return true;
        }
    }

    public String get(LicensePlate licensePlate) {
        return hashmap.get(licensePlate);
    }

    public boolean remove(LicensePlate licensePlate) {
        if (!hashmap.containsKey(licensePlate)) {
            return false;
        } else {
            hashmap.remove(licensePlate);
            return true;
        }
    }

    public void printLicensePlates() {
        for (LicensePlate lp : hashmap.keySet()) {
            System.out.println(lp);
        }
    }

    public void printOwners() {
        ArrayList<String> owners = new ArrayList<>();
        for (String owner : hashmap.values()) {
            if (owners.contains(owner)) {
                ;
            } else {
                System.out.println(owner);
                owners.add(owner);
            }
        }
    }

}
