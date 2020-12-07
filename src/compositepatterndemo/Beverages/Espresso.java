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
public class Espresso implements Beverage {
    
    @Override
    public String getInfo() {
        return "Espresso";
    }
    
    @Override
    public double cost () {
        return 9.00;
    }
    
}