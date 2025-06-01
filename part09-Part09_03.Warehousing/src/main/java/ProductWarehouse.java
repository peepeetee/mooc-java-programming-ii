/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author peepeetee
 */
public class ProductWarehouse extends Warehouse{
    private String productName;

    public ProductWarehouse(String productName, double capacity) {
        super(capacity);
        this.productName = productName;
    }
    
    public String getName(){
        return productName;
    }
    
    public void setName(String name){
        productName = name;
    }
    
    public String toString(){
        return getName() + ": " + super.toString();
    }
    
}
