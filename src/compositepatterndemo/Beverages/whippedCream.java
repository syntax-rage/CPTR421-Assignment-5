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
public class whippedCream extends Condiments {
    
    public whippedCream(Beverage decoratedBeverage) {
        super(decoratedBeverage);
    }
    
    @Override
    public String getInfo() {
        return "Whipped Cream";
    }
    
    @Override
    public double cost () {
        return 5.00;
    }
}
