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
public class CarmelSyrup extends Condiments {

    public CarmelSyrup(Beverage decoratedBeverage) {
        super(decoratedBeverage);
    }
    
    @Override
    public String getInfo(){
        return " Caramel Syrup ";
    }
    
    
    @Override
    public double cost(){
        return 2.00;
    }
    
}
