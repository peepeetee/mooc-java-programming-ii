
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
public class DictionaryOfManyTranslations {
    private HashMap<String, ArrayList<String>> hashmap;

    public DictionaryOfManyTranslations() {
        hashmap = new HashMap<>();
    }
    
    
    
    public void add(String word, String translation){
        hashmap.putIfAbsent(word, new ArrayList<>());
        ArrayList<String> list = hashmap.get(word);
        list.add(translation);
    }
    
    public ArrayList<String> translate(String word){
        return hashmap.getOrDefault(word, new ArrayList<>());
    }
    
    public void remove(String word){
        hashmap.remove(word);
    }
    
}
