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
public class Mocha extends Condiments {
    public Mocha(Beverage decoratedBeverage) {
        super(decoratedBeverage);
    }
    @Override
    public String getInfo(){
        return "Mocha";
    }
    
    @Override
    public double cost() {
        return 5.00;
    }
    
}
