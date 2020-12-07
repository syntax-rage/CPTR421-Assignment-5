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

    public abstract class Condiments implements Beverage {
        protected Beverage decoratedBeverage;
        
        public Condiments(Beverage decoratedBeverage) {
            this.decoratedBeverage = decoratedBeverage;
            
        }
        public String getInfo() {
            return decoratedBeverage.getInfo();
            
        }
        
        public double cost() {
            return decoratedBeverage.cost();
        }
    }
    

