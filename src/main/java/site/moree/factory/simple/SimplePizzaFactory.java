package site.moree.factory.simple;

import site.moree.factory.pizza.CheesePizza;
import site.moree.factory.pizza.Pizza;
import site.moree.factory.pizza.VeggiePizza;

/**
 * Created by MORE-E on 4/17/2017.
 * 最简单的工厂，自然而然，用于返回类的实例
 */
public class SimplePizzaFactory {
    public static Pizza createPizza(String type) {
        if ("cheese".equals(type)) {
            return new CheesePizza();
        } else if ("veggie".equals(type)) {
            return new VeggiePizza();
        } else {
            throw new IllegalArgumentException("type is illegal.");
        }
    }
}
