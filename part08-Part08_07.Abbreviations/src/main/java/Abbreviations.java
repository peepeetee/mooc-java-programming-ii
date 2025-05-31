
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
public class Abbreviations {
    
    private HashMap<String, String> hashmap;

    public Abbreviations() {
        hashmap = new HashMap<>();
    }
    
    public void addAbbreviation(String abbreviation, String explanation){
        hashmap.put(abbreviation, explanation);
    }
    public boolean hasAbbreviation(String abbreviation){
        return hashmap.containsKey(abbreviation);
    }
    
    public String findExplanationFor(String abbreviation){
        return hashmap.get(abbreviation);
    }
    
    
}
