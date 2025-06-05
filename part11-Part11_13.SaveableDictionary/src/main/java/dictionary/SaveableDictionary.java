/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author peepeetee
 */
public class SaveableDictionary {

    private String filename;

    private HashMap<String, String> hashmap;

    public SaveableDictionary() {
        hashmap = new HashMap<>();

    }

    public SaveableDictionary(String file) {
        this();
        this.filename = file;
    }

    public boolean load() {
        try (Scanner fileReader = new Scanner(Paths.get(this.filename))) {
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                if (line.equals("")) {
                    continue;
                }
                String[] parts = line.split(":");   // split the line based on the ':' character
                if (parts.length != 2) {
                    continue;
                }
                add(parts[0], parts[1]);
            }
        } catch (IOException e) {
            return false;
        }
        return true;
    }

    public boolean save() {
        try (PrintWriter writer = new PrintWriter(filename)) {
            for (String key : hashmap.keySet()) {
                writer.println(key + ":" + hashmap.get(key));
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public void add(String words, String translation) {
        hashmap.putIfAbsent(words, translation);
    }

    public String translate(String word) {
        if (hashmap.containsKey(word)) {
            return hashmap.get(word);
        }
        for (Map.Entry<String, String> entrySet : hashmap.entrySet()) {
            if (entrySet.getValue().equals(word)) {
                return entrySet.getKey();
            }
        }
        return null;
    }

    public void delete(String word) {
        if (hashmap.containsKey(word)) {
            hashmap.remove(word);
        }
        Iterator iterator = hashmap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry pair = (Map.Entry) iterator.next();
            if (pair.getValue().equals(word)) {
                iterator.remove();
            }
        }
    }

}
