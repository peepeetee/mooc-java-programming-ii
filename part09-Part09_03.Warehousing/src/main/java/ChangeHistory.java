
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author peepeetee
 */
public class ChangeHistory {

    private ArrayList<Double> history;

    public ChangeHistory() {
        history = new ArrayList<>();
    }

    public void add(double status) {
        history.add(status);

    }

    public void clear() {
        history.clear();
    }

    public String toString() {
        return history.toString();
    }

    public double maxValue() {
        if (history.isEmpty()) {
            return 0;
        } else {
            Double max = history.get(0);
            for (Double price : history) {
                if (price > max) {
                    max = price;
                }
            }
            return max;
        }
    }

    public double minValue() {
        if (history.isEmpty()) {
            return 0;
        } else {
            Double min = history.get(0);
            for (Double price : history) {
                if (price < min) {
                    min = price;
                }
            }
            return min;
        }
    }

    public double average() {
        if (history.isEmpty()) {
            return 0;
        } else {
            Double sum = 0.0;
            for (Double price : history) {
                sum += price;
            }
            return sum / history.size();
        }
    }

}
