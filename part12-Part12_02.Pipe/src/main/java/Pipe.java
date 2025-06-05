
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author peepeetee
 */
public class Pipe<T> {
    private ArrayList<T> queue;

    public Pipe() {
        this.queue = new ArrayList<>();
    }
    
    public void putIntoPipe(T value){
        queue.add(value);
    }
    
    public T takeFromPipe(){
        if(queue.isEmpty()){
            return null;
        } else {
            T returnValue =  queue.get(0);
            queue.remove(0);
            return returnValue;
        }
    }
    
    public boolean isInPipe(){
        return !queue.isEmpty();
    }
    
    
    
}
