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
public class Milk extends Condiments {

    public Milk(Beverage decoratedBeverage) {
        super(decoratedBeverage);
    }
    
    @Override
    public String getInfo(){
        return " Milk ";
    }
    
    
    @Override
    public double cost(){
        return 1.00;
    }
    
}
