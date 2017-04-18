package site.moree.factory;

import site.moree.factory.basic.PizzaFactory;
import site.moree.factory.basic.VeggiePizzaFactory;
import site.moree.factory.pizza.Pizza;
import site.moree.factory.simple.SimplePizzaFactory;

/**
 * Created by MORE-E on 4/17/2017.
 */
public class FactoryPattern {
    public static void main(String[] args) {
        //---------------------------------------------------------------------------------------
        //  Simple factory test
        //---------------------------------------------------------------------------------------
        Pizza cheese = SimplePizzaFactory.createPizza("cheese");
        cheese.prepare();
        cheese.bake();

        //---------------------------------------------------------------------------------------
        //  Different factory test
        //---------------------------------------------------------------------------------------
        System.out.println("-------------------------------------------------------------------");
        PizzaFactory pizzaFactory = new VeggiePizzaFactory();
        Pizza veggie = pizzaFactory.createPizza("veggie");
        veggie.prepare();
        veggie.bake();
    }
}
