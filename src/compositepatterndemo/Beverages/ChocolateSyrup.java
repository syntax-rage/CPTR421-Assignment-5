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
public class ChocolateSyrup extends Condiments {

    public ChocolateSyrup(Beverage decoratedBeverage) {
        super(decoratedBeverage);
    }
    
    @Override
    public String getInfo(){
        return " Chocolate Syrup ";
    }
    
    
    @Override
    public double cost(){
        return 2.00;
    }
    
}
