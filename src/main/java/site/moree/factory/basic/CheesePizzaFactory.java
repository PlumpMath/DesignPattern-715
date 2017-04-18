package site.moree.factory.basic;

import site.moree.factory.pizza.CheesePizza;
import site.moree.factory.pizza.Pizza;

/**
 * Created by MORE-E on 4/17/2017.
 * 只能生成Cheese的工厂
 */
public class CheesePizzaFactory extends PizzaFactory {
    @Override
    public Pizza createPizza(String type) {
        if ("cheese".equals(type)) {
            return new CheesePizza();
        } else {
            throw new IllegalArgumentException("type is illegal.");
        }
    }
}
