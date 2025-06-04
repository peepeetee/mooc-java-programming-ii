/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author peepeetee
 */
public class AverageSensor implements Sensor {

    private List<Sensor> sensors;
    private List<Integer> readings;

    public AverageSensor() {
        this.sensors = new ArrayList<>();
        this.readings = new ArrayList<>();
    }

    @Override
    public boolean isOn() {
        boolean on = true;
        for (Sensor sensor : sensors) {
            if (!sensor.isOn()) {
                on = false;
            }
        }
        return on;
    }

    @Override
    public void setOn() {
        for (Sensor sensor : sensors) {
            sensor.setOn();
        }
    }

    @Override
    public void setOff() {
        for (Sensor sensor : sensors) {
            sensor.setOff();
        }
    }

    @Override
    public int read() {
        if(!isOn() || sensors.isEmpty()){
            throw new IllegalStateException();
        } else {
            int count = 0;
            int sum = 0;
            for (Sensor sensor : sensors) {
                if(sensor.isOn()){
                    count += 1;
                    sum += sensor.read();
                }
            }
            int result = sum/count;
            readings.add(result);
            return result;
        }
        
    }
    
    public void addSensor(Sensor toAdd){
        sensors.add(toAdd);
    }
    
    public List<Integer> readings(){
        return readings;
    }

}
