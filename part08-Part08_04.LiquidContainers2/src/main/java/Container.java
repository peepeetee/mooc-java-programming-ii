/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author peepeetee
 */
public class Container {

    private int contained;

    public Container() {
        this.contained = 0;
    }

    public int contains() {
        return contained;
    }

    public void add(int amount) {
        int add = amount;
        if (add < 0) {
            contained = contained;
        } else {
            int result = contained + add;
            if (result > 100) {
                contained = 100;
            } else {
                contained = result;

            }
        }
    }

    public void remove(int amount) {
        int remove = amount;
        if (remove < 0) {
            contained = contained;
        } else {
            int result = contained - remove;
            if (result < 0) {
                contained = 0;
            } else {
                contained = result;

            }
        }
    }
    
    public String toString(){
        return contained + "/100";
    }

}
