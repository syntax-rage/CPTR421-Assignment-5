/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compositepatterndemo.Beverages;

/**
 *
 * @author Jason
 */
public class houseBlend implements Beverage {
    
    @Override
    public String getInfo() {
        return "House Blend";
    }
    
    @Override
    public double cost() {
        return 10.00;
    }
    
}
