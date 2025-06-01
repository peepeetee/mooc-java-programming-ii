/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author peepeetee
 */
public class ProductWarehouseWithHistory extends ProductWarehouse {
    private ChangeHistory changehistory;

    public ProductWarehouseWithHistory(String productName, double capacity , double initialBalance) {
        super(productName, capacity);
        super.addToWarehouse(initialBalance);
        changehistory = new ChangeHistory();
        changehistory.add(initialBalance);
    }
    
    public String history(){
        return changehistory.toString();
    }
    
    public void addToWarehouse(double amount){
        super.addToWarehouse(amount);
        changehistory.add(this.getBalance());
    }
    
    public double takeFromWarehouse(double amount){
        Double return_value = super.takeFromWarehouse(amount);
        changehistory.add(this.getBalance());
        
        return return_value;
    }
    
    public void printAnalysis(){
        System.out.println("Product: " + this.getName());
        System.out.println("History: " + changehistory);
        System.out.println("Largest amount of product: " + changehistory.maxValue());
        System.out.println("Smallest amount of product: " + changehistory.minValue());
        System.out.println("Average: " + changehistory.average());
    }
}
