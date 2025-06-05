/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author peepeetee
 */
public class Hideout<T> {

    private T item;

    public void putIntoHideout(T toHide) {
        item = toHide;
    }

    public T takeFromHideout() {
        T returnValue = item;
        item = null;
        return returnValue;
    }

    public boolean isInHideout() {
        if (item != null) {
            return true;
        } else {
            return false;
        }
    }

}
