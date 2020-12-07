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
public class darkRoast implements Beverage {
    
    @Override
    public String getInfo() {
        return "Dark Roast";
    }
    
    @Override
    public double cost () {
        return 12.00;
    }
    
}
