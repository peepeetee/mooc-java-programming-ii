/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.lang.IllegalStateException;
import java.util.Random;

/**
 *
 * @author peepeetee
 */
public class TemperatureSensor implements Sensor{
    
    private boolean on;

    public TemperatureSensor() {
        this.on = false;
    }

    @Override
    public boolean isOn() {
        return on;
    }

    @Override
    public void setOn() {
        on = true;
    }

    @Override
    public void setOff() {
        on = false;
    }

    @Override
    public int read() {
        if(on){
            return (new Random().nextInt(61)) - 30;
        } else {
            throw new IllegalStateException();
        }
    }
    
    
    
    
    
}
